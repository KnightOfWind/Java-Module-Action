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
package com.knight.config;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @author wss
 * @date 2022/5/23 9:01 PM
 */
@Slf4j
@Component
public class FillMetaObjectHandler implements MetaObjectHandler {

    @Override
    public void insertFill(MetaObject metaObject) {
        this.strictInsertFill(metaObject, "creator", Integer.class, 0);
        this.strictInsertFill(metaObject, "createTime", Date.class, new Date(System.currentTimeMillis()));
        this.strictInsertFill(metaObject, "modifier", Integer.class,0);
        this.strictInsertFill(metaObject, "modifyTime", Date.class, new Date(System.currentTimeMillis()));
    }

    @Override
    public void updateFill(MetaObject metaObject) {
        this.strictInsertFill(metaObject, "modifier", Integer.class,0);
        this.strictInsertFill(metaObject, "modifyTime", Date.class, new Date(System.currentTimeMillis()));
    }
}
