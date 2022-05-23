package com.knight.domain.services;

import com.knight.domain.dos.User;
import com.knight.domain.interfaces.repository.UserRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author wss
 * @date 2022/5/23 8:27 AM
 */
@Service
public class UserDomainService {

    @Resource
    private UserRepository userRepository;

    public void registerUser(User user) {
        userRepository.save(user);
    }

    public User queryUser(Integer userId) {
        return userRepository.query(userId);
    }
}
