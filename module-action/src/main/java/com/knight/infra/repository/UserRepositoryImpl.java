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
