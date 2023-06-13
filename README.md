# springcloud-demo SpringCloud示例

[![License](https://img.shields.io/github/license/ALI1416/springcloud-demo?label=License)](https://opensource.org/licenses/BSD-3-Clause)
[![Java Support](https://img.shields.io/badge/Java-8+-green)](https://openjdk.org/)
[![Repo Size](https://img.shields.io/github/repo-size/ALI1416/springcloud-demo?label=Repo%20Size&color=success)](https://github.com/ALI1416/springcloud-demo/archive/refs/heads/master.zip)

## 简介

SpringCloud示例

## 目录结构

- **`demo-base`** : springboot项目模板
  - SpringBoot Web
- `.gitignore` : git忽略
- `LICENSE` : 许可证
- `pom.xml` : 父pom
- `README.md` : 说明

### pom.xml

- `modules` : 模块，新增时添加`module`子标签
- `properties` : 属性
  - `java.version` : 指定java版本，最低1.8
  - `maven.compiler.source`和`maven.compiler.target` : 打包成jar时指定java版本
  - `maven.compiler.encoding`、`project.build.sourceEncoding`和`project.reporting.outputEncoding` : 项目编码
  - 指定pom版本号 :
    - `SpringCloudAlibabaDependencies` : `com.alibaba.cloud:spring-cloud-alibaba-dependencies`  
      ![Maven Central](https://img.shields.io/maven-central/v/com.alibaba.cloud/spring-cloud-alibaba-dependencies?label=Maven%20Central)
    - `SpringCloudDependencies` : `org.springframework.cloud:spring-cloud-dependencies`  
      ![Maven Central](https://img.shields.io/maven-central/v/org.springframework.cloud/spring-cloud-dependencies?label=Maven%20Central)
    - `SpringBootDependencies` : `org.springframework.boot:spring-boot-dependencies`  
      ![Maven Central](https://img.shields.io/maven-central/v/org.springframework.boot/spring-boot-dependencies?label=Maven%20Central)
    - `SpringBoot整合Maven插件` : `org.springframework.boot:spring-boot-maven-plugin`  
      ![Maven Central](https://img.shields.io/maven-central/v/org.springframework.boot/spring-boot-maven-plugin?label=Maven%20Central)
    - `Maven打包插件` : `org.apache.maven.plugins:maven-compiler-plugin`  
      ![Maven Central](https://img.shields.io/maven-central/v/org.apache.maven.plugins/maven-compiler-plugin?label=Maven%20Central)
    - `MySQL(与服务器版本号对应，不需一致)` : `mysql:mysql-connector-java`  
      ![Maven Central](https://img.shields.io/maven-central/v/mysql/mysql-connector-java?label=Maven%20Central)
    - `实体层注解(与IDE安装的版本号对应，不需一致)` : `org.projectlombok:lombok`  
      ![Maven Central](https://img.shields.io/maven-central/v/org.projectlombok/lombok?label=Maven%20Central)
    - `MyBatis` : `org.mybatis.spring.boot:mybatis-spring-boot-starter`  
      ![Maven Central](https://img.shields.io/maven-central/v/org.mybatis.spring.boot/mybatis-spring-boot-starter?label=Maven%20Central)
    - `雪花ID生成器` : `cn.404z:id-spring-boot-autoconfigure`  
      ![Maven Central](https://img.shields.io/maven-central/v/cn.404z/id-spring-boot-autoconfigure?label=Maven%20Central)
    - `FastJson` : `com.alibaba:fastjson`  
      ![Maven Central](https://img.shields.io/maven-central/v/com.alibaba/fastjson?label=Maven%20Central)
    - `HuTool工具包` : `cn.hutool:hutool-all`  
      ![Maven Central](https://img.shields.io/maven-central/v/cn.hutool/hutool-all?label=Maven%20Central)
- `dependencyManagement` : 依赖管理，不用写版本号
- `profiles` : 配置
  - `profile.id:install` : 打包配置
    - `activation.activeByDefault:true` : 默认配置
    - `build.plugins.plugin.configuration` : 插件配置，编译插件
      - `source`和`target` : 指定java版本

## 关于

<object data="https://404z.cn/images/about.svg" style="max-width:100%;">
  <picture>
    <source media="(prefers-color-scheme: dark)" srcset="https://404z.cn/images/about.dark.svg">
    <img alt="About" src="https://404z.cn/images/about.light.svg">
  </picture>
</object>
