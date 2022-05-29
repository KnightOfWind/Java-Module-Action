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
/**
 * @author wss
 * @date 2022/5/23 9:43 AM
 */
module module.action {
    opens com.knight;
    opens com.knight.config;
    opens com.knight.ui.http;
    opens com.knight.ui.http.convert;
    opens com.knight.ui.http.dto;
    opens com.knight.app;
    opens com.knight.domain.dos;
    opens com.knight.domain.services;
    opens com.knight.infra.repository;
    opens com.knight.infra.repository.mapper;

    exports com.knight.common.enums;

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
    requires org.mapstruct;
    requires org.slf4j;
}