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
package com.knight.ui.http.convert;

import com.knight.config.MapStructConfig;
import com.knight.domain.dos.User;
import com.knight.ui.http.dto.UserCreateDto;
import com.knight.ui.http.dto.UserDetailDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

/**
 * @author wss
 * @date 2022/5/23 8:10 PM
 */
@Mapper(config = MapStructConfig.class)
public interface UserConvert {

    @Mapping(source = "birthDay", target = "birthDay", dateFormat = "yyyy-MM-dd")
    User convert(UserCreateDto userCreateDto);

    @Mapping(source = "birthDay", target = "birthDay", dateFormat = "yyyy-MM-dd")
    @Mapping(source = "createTime", target = "createTime", dateFormat = "yyyy-MM-dd HH:mm:ss")
    @Mapping(source = "modifyTime", target = "modifyTime", dateFormat = "yyyy-MM-dd HH:mm:ss")
    UserDetailDto convert(User user);
}
