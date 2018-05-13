![Licence](https://img.shields.io/badge/licence-none-green.svg)
[![GitHub Release](https://img.shields.io/github/release/lihengming/spring-boot-api-project-seed.svg)](https://github.com/lihengming/spring-boot-api-project-seed/releases)
## 简介
springboot2基于[作者：lihengming]的[spring-boot-api-project-seed](https://github.com/lihengming/spring-boot-api-project-seed)项目并在其基础上添加新的特新，若您无必要使用新特性，建议去往原作者项目页面，支持原创

## 原特征&提供
- 最佳实践的项目结构、配置文件、精简的POM（[查看项目结构图](https://github.com/lihengming/java-codes/blob/master/shared-resources/github-images/project-struct.png)）
- 统一响应结果封装及生成工具
- 统一异常处理
- 简单的接口签名认证
- 常用基础方法抽象封装
- 使用Druid Spring Boot Starter 集成Druid数据库连接池与监控
- 使用FastJsonHttpMessageConverter，提高JSON序列化速度
- 集成MyBatis、通用Mapper插件、PageHelper分页插件，实现单表业务零SQL
- 提供代码生成器根据表名生成对应的Model、Mapper、MapperXML、Service、ServiceImpl、Controller等基础代码，其中Controller模板默认提供POST和RESTful两套，根据需求在```CodeGenerator.genController(tableName)```方法中自己选择，默认使用POST模板。代码模板可根据实际项目的需求来扩展，由于每个公司业务都不太一样，所以只提供了一些比较基础、通用的模板，主要是提供一个思路来减少重复代码的编写，我在实际项目的使用中，其实根据公司业务的抽象编写了大量的模板。另外，使用模板也有助于保持团队代码风格的统一

## 新特性
- 代码生成器支持业务路径配置，生成的model，mapper，service，controller等基础代码会自动放入业务路径下
- 代码生成工具生成的mapper_xml文件增加Base_Column_List，不用手写表字段名称
- 可以自定义生成的model类中的属性类型，如数据库字段类型smallint生成model的字段类型为Integer
- 事物支持声明式与注解式
- 基于hibernate-validator的参数自动校验，统一异常处理参数校验错误
- string格式日期参数[格式为：yyyy-MM-dd HH:mm:ss]，自动映射java.util.Date类型

## 快速开发
- [开发工具配置](https://github.com/xiongzhao1217/springboot2/blob/master/ide-config.md)
- [启动项目](https://github.com/lihengming/spring-boot-api-project-seed)
