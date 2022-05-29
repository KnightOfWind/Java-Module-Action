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
package com.knight.ui.http;

import com.knight.app.UserAppService;
import com.knight.common.Result;
import com.knight.domain.dos.User;
import com.knight.ui.http.convert.UserConvert;
import com.knight.ui.http.dto.UserCreateDto;
import com.knight.ui.http.dto.UserDetailDto;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author wss
 * @date 2022/5/23 8:23 AM
 */
@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Resource
    private UserConvert userConvert;

    @Resource
    private UserAppService userAppService;

    @RequestMapping("/register")
    public boolean registerUser(UserCreateDto userDto) {
        final User user = userConvert.convert(userDto);
        Result<User> userResult = userAppService.registerUser(user);
        return userResult.succeed();
    }

    @RequestMapping("/query/{userId}")
    public UserDetailDto queryUser(@PathVariable Integer userId) {
        final User user = userAppService.queryUser(userId);
        return userConvert.convert(user);
    }
}
