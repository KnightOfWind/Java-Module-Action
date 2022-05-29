--
--  Licensed under the Apache License, Version 2.0 (the "License");
--    you may not use this file except in compliance with the License.
--    You may obtain a copy of the License at
--
--        http://www.apache.org/licenses/LICENSE-2.0
--
--    Unless required by applicable law or agreed to in writing, software
--    distributed under the License is distributed on an "AS IS" BASIS,
--    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
--    See the License for the specific language governing permissions and
--    limitations under the License.
--

-- 用户表
create table user
(
    id          int auto_increment comment '自增主键' primary key,
    name        varchar(50) not null comment '名字',
    gender      tinyint     not null comment '性别',
    birth_day   date        not null comment '生日',
    creator     int         not null comment '创建人',
    create_time datetime    not null comment '创建时间',
    modifier    int         not null comment '修改人',
    modify_time datetime    not null comment '修改时间',
    constraint user_id_uindex unique (id)
) comment '用户表';

-- 角色表
create table role
(
    id          int auto_increment comment '角色id，自增主键' primary key,
    role_name   varchar(50) not null comment '角色名称',
    role_desc   varchar(50) not null comment '角色描述',
    create_time datetime    not null comment '创建时间',
    creator     int         not null comment '创建人',
    modify_time datetime    not null comment '修改时间',
    modifier    int         not null comment '修改人',
    constraint role_id_uindex unique (id),
    constraint role_role_name_uindex unique (role_name)
) comment '角色表';

-- 权限表
create table permission
(
    id          int auto_increment comment '权限id，自增主键' primary key,
    perm_name   varchar(50) not null comment '权限名称',
    perm_desc   varchar(50) not null comment '权限描述',
    create_time datetime    not null comment '创建时间',
    creator     int         not null comment '创建人',
    modify_time datetime    not null comment '修改时间',
    modifier    int         not null comment '修改人',
    constraint permission_id_uindex unique (id),
    constraint permission_perm_name_uindex unique (perm_name)
) comment '权限表';

-- 用户角色表
create table user_role
(
    id          int auto_increment comment '自增主键' primary key,
    user_id     int      not null comment '用户id',
    role_id     int      not null comment '角色id',
    create_time datetime not null comment '创建时间',
    creator     int      null comment '创建人',
    modify_time datetime not null comment '修改时间',
    modifier    int      not null comment '修改人',
    constraint user_role_id_uindex unique (id),
    constraint user_role_unique_index unique (user_id, role_id)
) comment '用户角色表';

-- 角色权限表
create table role_permission
(
    id          int auto_increment comment '自增主键' primary key,
    role_id     int      not null comment '角色id',
    perm_id     int      not null comment '权限id',
    create_time datetime not null comment '创建时间',
    creator     int      not null comment '创建人',
    modify_time datetime not null comment '修改时间',
    modifier    int      not null comment '修改人',
    constraint role_permission_id_uindex unique (id),
    constraint role_permission_unique_index unique (role_id, perm_id)
) comment '权限角色关联表';

-- 日志表
create table log
(
    id           int auto_increment comment '自增主键',
    event_type   int         not null comment '事件类型',
    event        varchar(50) not null comment '事件',
    operator     int         not null comment '操作人',
    operate_time datetime    not null comment '操作时间',
    constraint log_pk primary key (id)
) comment '日志表';


