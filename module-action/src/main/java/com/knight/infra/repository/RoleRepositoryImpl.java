package com.knight.infra.repository;

import com.knight.domain.interfaces.repository.RoleRepository;
import com.knight.infra.repository.mapper.RoleMapper;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

/**
 * @author wss
 * @date 2022/5/29 8:11 AM
 */
@Repository("roleRepository")
public class RoleRepositoryImpl implements RoleRepository {

    @Resource
    private RoleMapper roleMapper;
}
