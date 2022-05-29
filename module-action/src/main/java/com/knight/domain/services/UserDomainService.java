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
