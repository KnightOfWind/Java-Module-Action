package com.knight.infra.repository;

import com.knight.domain.interfaces.repository.LogRepository;
import com.knight.infra.repository.mapper.LogMapper;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

/**
 * @author wss
 * @date 2022/5/29 8:12 AM
 */
@Repository("logRepository")
public class LogRepositoryImpl implements LogRepository {

    @Resource
    private LogMapper logMapper;
}
