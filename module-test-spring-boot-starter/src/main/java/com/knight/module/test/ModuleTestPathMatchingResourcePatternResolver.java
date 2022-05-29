/*
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */
package com.knight.module.test;

import lombok.extern.slf4j.Slf4j;
import org.springframework.core.io.FileUrlResource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;

/**
 * 解决当开启Jigsaw Module后，在单元测试中Spring的类扫描机制无法扫描到/target/classes目录下的类文件的问题
 *
 * @author wss
 * @date 2022/5/28 6:35 PM
 */
@Slf4j
public class ModuleTestPathMatchingResourcePatternResolver extends PathMatchingResourcePatternResolver {
    /**
     * 测试代码编译输出目录
     */
    private static final String TEST_CLASS_PATH = "/target/test-classes/";

    /**
     * 正常代码编译输出目录
     */
    private static final String CLASS_PATH = "/target/classes/";

    /**
     * 类文件后缀
     */
    private static final String CLASS_SUFFIX = ".class";

    public ModuleTestPathMatchingResourcePatternResolver(final ResourceLoader resourceLoader) {
        super(resourceLoader);
    }

    @Override
    public Resource[] getResources(String locationPattern) throws IOException {
        if (locationPattern.startsWith(CLASSPATH_ALL_URL_PREFIX)) {
            if (getPathMatcher().isPattern(locationPattern.substring(CLASSPATH_ALL_URL_PREFIX.length()))) {
                return findPathMatchingResources(locationPattern);
            } else {
                var allResources = new HashSet<Resource>();
                var resources = findAllClassPathResources(locationPattern.substring(CLASSPATH_ALL_URL_PREFIX.length()));

                // 如果存在test目录，那么将test目录转换为对应的正常代码目录，并添加到resource数组中
                if (resources != null && resources.length > 0) {
                    Arrays.stream(resources).forEach(allResources::add);
                    Arrays.stream(resources)
                            .map(this::getURL)
                            .filter(Objects::nonNull)
                            .filter(e -> e.getPath().contains(TEST_CLASS_PATH))
                            .filter(e -> !e.getPath().endsWith(CLASS_SUFFIX))
                            .map(this::newResource)
                            .filter(Objects::nonNull)
                            .forEach(allResources::add);
                }
                return allResources.toArray(Resource[]::new);
            }
        } else {
            int prefixEnd = (locationPattern.startsWith("war:") ? locationPattern.indexOf("*/") + 1 : locationPattern.indexOf(':') + 1);
            if (getPathMatcher().isPattern(locationPattern.substring(prefixEnd))) {
                return findPathMatchingResources(locationPattern);
            } else {
                return new Resource[] {getResourceLoader().getResource(locationPattern)};
            }
        }
    }

    /**
     * 获取Resource对应的URL
     *
     * @param resource  Resource
     * @return          URL
     */
    private URL getURL(Resource resource) {
        try {
            return resource.getURL();
        } catch (IOException e) {
            log.error("获取Resource对应的URL出现异常，异常信息: {}", e.getMessage(), e);
            return null;
        }
    }

    /**
     * 将test url转换为正常代码的url
     *
     * @param url       test url
     * @return          正常代码url
     */
    private Resource newResource(URL url) {
        try {
            var file = url.toString();
            var newFile = file.replace(TEST_CLASS_PATH, CLASS_PATH);
            return new FileUrlResource(new URL((newFile)));
        } catch (MalformedURLException e) {
            log.error("通过URL构建新的Resource出现异常，异常信息: {}", e.getMessage(), e);
            return null;
        }
    }
}
