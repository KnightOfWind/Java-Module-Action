package com.knight.domain.interfaces.repository;

import com.knight.domain.dos.User;

/**
 * @author wss
 * @date 2022/5/23 8:07 AM
 */
public interface UserRepository {

    boolean save(User user);

    User query(Integer userId);
}
