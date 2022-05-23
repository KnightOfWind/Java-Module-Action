package com.knight.config;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @author wss
 * @date 2022/5/23 9:01 PM
 */
@Slf4j
@Component
public class FillMetaObjectHandler implements MetaObjectHandler {

    @Override
    public void insertFill(MetaObject metaObject) {
        this.strictInsertFill(metaObject, "creator", Integer.class, 0);
        this.strictInsertFill(metaObject, "createTime", Date.class, new Date(System.currentTimeMillis()));
        this.strictInsertFill(metaObject, "modifier", Integer.class,0);
        this.strictInsertFill(metaObject, "modifyTime", Date.class, new Date(System.currentTimeMillis()));
    }

    @Override
    public void updateFill(MetaObject metaObject) {
        this.strictInsertFill(metaObject, "modifier", Integer.class,0);
        this.strictInsertFill(metaObject, "modifyTime", Date.class, new Date(System.currentTimeMillis()));
    }
}
