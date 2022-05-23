/**
 * @author wss
 * @date 2022/5/23 9:43 AM
 */
module Java.Module.Action {
    opens com.knight;
    opens com.knight.ui.http;
    opens com.knight.ui.http.convert;
    opens com.knight.ui.http.dto;
    opens com.knight.app;
    opens com.knight.domain.dos;
    opens com.knight.domain.services;
    opens com.knight.infra.repository;

    requires org.mybatis;
    requires org.mybatis.spring;
    requires mybatis.plus.annotation;
    requires mybatis.plus.core;
    requires mybatis.plus.boot.starter;

    requires spring.beans;
    requires spring.context;
    requires spring.core;
    requires spring.web;
    requires spring.aop;

    requires spring.boot;
    requires spring.boot.autoconfigure;

    requires java.annotation;
    requires java.sql;

    requires lombok;
    requires hutool.all;
}