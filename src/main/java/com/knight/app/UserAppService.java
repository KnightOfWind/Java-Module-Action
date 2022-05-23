package com.knight.app;

import com.knight.common.Result;
import com.knight.domain.dos.User;
import com.knight.domain.services.UserDomainService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author wss
 * @date 2022/5/23 8:25 AM
 */
@Service
public class UserAppService {

    @Resource
    private UserDomainService userDomainService;

    public Result<User> registerUser(User user) {
        userDomainService.registerUser(user);
        return new Result<>();
    }

    public User queryUser(Integer userId) {
        return userDomainService.queryUser(userId);
    }
}
