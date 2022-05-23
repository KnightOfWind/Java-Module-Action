package com.knight.infra.repository;

import com.knight.domain.dos.User;
import com.knight.domain.interfaces.repository.UserRepository;
import com.knight.infra.repository.mapper.UserMapper;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

/**
 * @author wss
 * @date 2022/5/23 8:17 AM
 */
@Repository("userRepository")
public class UserRepositoryImpl implements UserRepository {

    @Resource
    private UserMapper userMapper;

    @Override
    public boolean save(User user) {
        int count = userMapper.insert(user);
        return count > 0;
    }

    @Override
    public User query(Integer userId) {
        return userMapper.selectById(userId);
    }
}
