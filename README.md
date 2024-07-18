# springcloud-demo SpringCloud示例

[![License](https://img.shields.io/github/license/ALI1416/springcloud-demo?label=License)](https://opensource.org/licenses/BSD-3-Clause)
[![Java Support](https://img.shields.io/badge/Java-8+-green)](https://openjdk.org/)
[![Repo Size](https://img.shields.io/github/repo-size/ALI1416/springcloud-demo?label=Repo%20Size&color=success)](https://github.com/ALI1416/springcloud-demo/archive/refs/heads/master.zip)

## 简介

SpringCloud示例

## 项目

- **`demo-rest`** : RestTemplate版
  - **`demo-rest-consumer`** : 消费者
    - SpringBoot Web
    - FastJson
  - **`demo-rest-provider`** : 提供者
    - SpringBoot Web
    - FastJson
    - 雪花ID生成器
- **`demo-nacos`** : nacos
  - **`demo-nacos-consumer`** : 消费者
    - SpringBoot Web
    - FastJson
    - nacos
  - **`demo-nacos-provider`** : 提供者
    - SpringBoot Web
    - FastJson
    - nacos
    - 雪花ID生成器
- **`demo-feign`** : feign
  - **`demo-feign-consumer`** : 消费者
    - SpringBoot Web
    - FastJson
    - nacos
    - **demo-feign-api**
  - **`demo-feign-provider`** : 提供者
    - SpringBoot Web
    - FastJson
    - nacos
    - 雪花ID生成器
- **`demo-gateway`** : 网关
  - **`demo-gateway-consumer`** : 消费者
    - SpringBoot Web
    - FastJson
    - nacos
    - **demo-gateway-api**
  - **`demo-gateway-gateway`** : 网关
    - SpringBoot 网关
    - FastJson
    - nacos
    - **demo-gateway-api**
  - **`demo-gateway-provider-goods`** : 提供者-商品
    - SpringBoot Web
    - FastJson
    - nacos
    - 雪花ID生成器
    - **demo-gateway-api**
  - **`demo-gateway-provider-test`** : 提供者-测试
    - SpringBoot Web
    - FastJson
    - nacos
    - 雪花ID生成器
- **`demo-config`** : nacos配置管理
  - SpringBoot Web
  - SpringCloud Bootstrap
  - 自动配置
  - 配置
  - FastJson
  - nacos
  - nacos配置管理
  - 雪花ID生成器
- **`demo-sentinel`** : sentinel
  - **`demo-sentinel-consumer`** : 消费者
    - SpringBoot Web
    - FastJson
    - nacos
    - sentinel
    - **demo-sentinel-api**
  - **`demo-sentinel-provider`** : 提供者
    - SpringBoot Web
    - FastJson
    - nacos
    - 雪花ID生成器
- **`demo-seata`** : seata
  - **`demo-seata-consumer`** : 消费者
    - SpringBoot Web
    - FastJson
    - nacos
    - seata
    - **demo-seata-api**
  - **`demo-seata-provider-goods`** : 提供者-商品
    - SpringBoot Web
    - Spring事务
    - FastJson
    - nacos
    - seata
    - 雪花ID生成器
    - **demo-seata-api**
  - **`demo-seata-provider-test`** : 提供者-测试
    - SpringBoot Web
    - Spring事务
    - FastJson
    - nacos
    - seata
    - 雪花ID生成器

## 版本号

- 父依赖 :
  - `SpringBoot Parent` : `org.springframework.boot:spring-boot-starter-parent`  
    [![Maven Central](https://img.shields.io/maven-central/v/org.springframework.boot/spring-boot-starter-parent?label=Maven%20Central)](https://mvnrepository.com/artifact/org.springframework.boot/spring-boot-starter-parent)
- 继承父依赖不可修改版本号 :
  - `SpringBoot` : `org.springframework.boot:spring-boot-starter`  
    [![Maven Central](https://img.shields.io/maven-central/v/org.springframework.boot/spring-boot-starter?label=Maven%20Central)](https://mvnrepository.com/artifact/org.springframework.boot/spring-boot-starter)
  - `SpringBoot Web` : `org.springframework.boot:spring-boot-starter-web`  
    [![Maven Central](https://img.shields.io/maven-central/v/org.springframework.boot/spring-boot-starter-web?label=Maven%20Central)](https://mvnrepository.com/artifact/org.springframework.boot/spring-boot-starter-web)
  - `热部署` : `org.springframework.boot:spring-boot-devtools`  
    [![Maven Central](https://img.shields.io/maven-central/v/org.springframework.boot/spring-boot-devtools?label=Maven%20Central)](https://mvnrepository.com/artifact/org.springframework.boot/spring-boot-devtools)
  - `SpringBoot打包插件` : `org.springframework.boot:spring-boot-maven-plugin`  
    [![Maven Central](https://img.shields.io/maven-central/v/org.springframework.boot/spring-boot-maven-plugin?label=Maven%20Central)](https://mvnrepository.com/artifact/org.springframework.boot/spring-boot-maven-plugin)
  - `配置` : `org.springframework.boot:spring-boot-configuration-processor`  
    [![Maven Central](https://img.shields.io/maven-central/v/org.springframework.boot/spring-boot-configuration-processor?label=Maven%20Central)](https://mvnrepository.com/artifact/org.springframework.boot/spring-boot-configuration-processor)
- 继承父依赖可修改版本号 :
  - `实体层注解` : `org.projectlombok:lombok`  
    [![Maven Central](https://img.shields.io/maven-central/v/org.projectlombok/lombok?label=Maven%20Central)](https://mvnrepository.com/artifact/org.projectlombok/lombok)
  - `Maven编译插件` : `org.apache.maven.plugins:maven-compiler-plugin`  
    [![Maven Central](https://img.shields.io/maven-central/v/org.apache.maven.plugins/maven-compiler-plugin?label=Maven%20Central)](https://mvnrepository.com/artifact/org.apache.maven.plugins/maven-compiler-plugin)
- 父依赖不含 :
  - `SpringCloud Alibaba Dependencies` : `com.alibaba.cloud:spring-cloud-alibaba-dependencies`  
    [![Maven Central](https://img.shields.io/maven-central/v/com.alibaba.cloud/spring-cloud-alibaba-dependencies?label=Maven%20Central)](https://mvnrepository.com/artifact/com.alibaba.cloud/spring-cloud-alibaba-dependencies)
  - `SpringCloud Dependencies` : `org.springframework.cloud:spring-cloud-dependencies`  
    [![Maven Central](https://img.shields.io/maven-central/v/org.springframework.cloud/spring-cloud-dependencies?label=Maven%20Central)](https://mvnrepository.com/artifactorg.springframework.cloud/spring-cloud-dependencies)
  - `FastJson` : `com.alibaba.fastjson2:fastjson2`  
    [![Maven Central](https://img.shields.io/maven-central/v/com.alibaba.fastjson2/fastjson2?label=Maven%20Central)](https://mvnrepository.com/artifact/com.alibaba.fastjson2/fastjson2)
  - `雪花ID生成器` : `cn.404z:id-spring-boot-autoconfigure`  
    [![Maven Central](https://img.shields.io/maven-central/v/cn.404z/id-spring-boot-autoconfigure?label=Maven%20Central)](https://mvnrepository.com/artifact/cn.404z/id-spring-boot-autoconfigure)
  - `OpenFeign` : `org.springframework.cloud:spring-cloud-starter-openfeign`  
    [![Maven Central](https://img.shields.io/maven-central/v/org.springframework.cloud/spring-cloud-starter-openfeign?label=Maven%20Central)](https://mvnrepository.com/artifact/org.springframework.cloud/spring-cloud-starter-openfeign)
  - `OpenFeign连接池` : `io.github.openfeign:feign-okhttp`  
    [![Maven Central](https://img.shields.io/maven-central/v/io.github.openfeign/feign-okhttp?label=Maven%20Central)](https://mvnrepository.com/artifact/io.github.openfeign/feign-okhttp)
  - `负载均衡` : `org.springframework.cloud:spring-cloud-starter-loadbalancer`  
    [![Maven Central](https://img.shields.io/maven-central/v/org.springframework.cloud/spring-cloud-starter-loadbalancer?label=Maven%20Central)](https://mvnrepository.com/artifact/org.springframework.cloud/spring-cloud-starter-loadbalancer)
  - `负载均衡缓存` : `com.github.ben-manes.caffeine:caffeine`  
    [![Maven Central](https://img.shields.io/maven-central/v/com.github.ben-manes.caffeine/caffeine?label=Maven%20Central)](https://mvnrepository.com/artifact/com.github.ben-manes.caffeine/caffeine)

## 关于

<picture>
  <source media="(prefers-color-scheme: dark)" srcset="https://www.404z.cn/images/about.dark.svg">
  <img alt="About" src="https://www.404z.cn/images/about.light.svg">
</picture>
