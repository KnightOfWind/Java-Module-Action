# Java模块化实践
## 背景
Jigsaw Module是随着JDK9发布的，同时也是JDK9的一项重要特性，最近刚学习完Jigsaw Module，因此想着使用国内互联网公司使用的主流
技术栈搭建一个基于Jigsaw Module的项目，一方面加深自己对Jigsaw Module的理解，另一方面验证一下Jigsaw Module在生产环境中的可行性。

## 项目描述
实现一个简单的用户角色权限管理系统，主要包括以下功能：
- 用户的注册及用户信息的查询、以及对应的角色及权限配置
- 角色信息的配置及管理
- 权限信息的配置及管理
- 系统各类操作日志记录及查询

## 项目结构
项目整体分为Java-Module-Action、module-action、module-test-spring-boot-starter三个模块：
- Java-Module-Action: 父模块，统一管理子模块的依赖及插件的版本
- module-action: 核心模块，实现了用户、角色、权限相关的核心逻辑
- module-test-spring-boot-starter: 一个测试的starter，解决当开启Jigsaw Module之后，单元测试中SpringBoot的类扫描机制无法扫描出Class文件的问题

## 使用的技术栈
- Java: JDK17
- 项目脚手架：Spring、SpringBoot
- 持久化存储：MyBatis、MyBatisPlus、MySQL
- 单元测试: Junit4、SpringBootStarterTest、Spock
- 对象转换：MapStruct

## 运行项目
- 通过git clone将项目下载到本地
- 将项目导入到IDE中
- 执行module-action/init-script中的初始化脚本
  - 执行init.sql中的sql语句进行数据库创建以及创建对应的表 
- 配置对应的数据库连接

## 总结
使用主流技术栈搭建一个Jigsaw Module项目，整个过程中没有遇到特别难以解决的问题，可以在生产环境中投入使用，但还是有一些问题需要我们开发者注意，
因为这些问题可能会影响我们的开发体验和开发效率：
- 目前IDE及一些开源框架支持得还不是特别完善，当出现与Jigsaw Module相关的错误信息时，很多时候不是那么明确，或者有一点迷惑， 
这会加大开发者排查问题的难度，尤其是当对Jigsaw Module不是特别了解的时候
- 当前主流的一些框架如：Spring、Hibernate、MyBatis等框架，都大量使用了反射，因此为了保证这些框架的正常运行，我们需要对项目中的一些包进行opens操作，
这在一定程度违背了Jigsaw Module的强封装