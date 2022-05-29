package com.knight.infra.repository;

import com.knight.domain.interfaces.repository.RolePermissionRepository;
import com.knight.infra.repository.mapper.RolePermissionMapper;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

/**
 * @author wss
 * @date 2022/5/29 8:14 AM
 */
@Repository("rolePermissionRepository")
public class RolePermissionRepositoryImpl implements RolePermissionRepository {

    @Resource
    private RolePermissionMapper rolePermissionMapper;
}
