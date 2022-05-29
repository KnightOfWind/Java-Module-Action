package com.knight.infra.repository;

import com.knight.domain.interfaces.repository.PermissionRepository;
import com.knight.infra.repository.mapper.PermissionMapper;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

/**
 * @author wss
 * @date 2022/5/29 8:12 AM
 */
@Repository("permissionRepository")
public class PermissionRepositoryImpl implements PermissionRepository {

    @Resource
    private PermissionMapper permissionMapper;
}
