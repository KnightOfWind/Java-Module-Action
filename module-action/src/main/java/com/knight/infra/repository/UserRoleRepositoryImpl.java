package com.knight.infra.repository;

import com.knight.domain.interfaces.repository.UserRoleRepository;
import com.knight.infra.repository.mapper.UserRoleMapper;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

/**
 * @author wss
 * @date 2022/5/29 8:15 AM
 */
@Repository("userRoleRepository")
public class UserRoleRepositoryImpl implements UserRoleRepository {

    @Resource
    private UserRoleMapper userRoleMapper;
}
