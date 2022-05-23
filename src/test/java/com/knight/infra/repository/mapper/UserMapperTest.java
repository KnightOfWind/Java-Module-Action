package com.knight.infra.repository.mapper;

import com.knight.domain.dos.User;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

/**
 * @author wss
 * @date 2022/5/23 9:23 AM
 */
@SpringBootTest
public class UserMapperTest {

    @Resource
    private UserMapper userMapper;

    @Test
    public void saveUser() {
        final User user = userMapper.selectById(1);
    }
}