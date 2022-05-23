package com.knight.ui.http;

import com.knight.app.UserAppService;
import com.knight.common.Result;
import com.knight.domain.dos.User;
import com.knight.ui.http.convert.UserConvert;
import com.knight.ui.http.dto.UserDto;
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
    public boolean registerUser(UserDto userDto) {
        final User user = userConvert.convert(userDto);
        Result<User> userResult = userAppService.registerUser(user);
        return userResult.succeed();
    }

    @RequestMapping("/query/{userId}")
    public User queryUser(@PathVariable Integer userId) {
        return userAppService.queryUser(userId);
    }
}
