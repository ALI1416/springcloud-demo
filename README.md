# cloud-demo

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
      <br>![Maven Central](https://maven-badges.herokuapp.com/maven-central/com.alibaba.cloud/spring-cloud-alibaba-dependencies/badge.svg)
    - `SpringCloudDependencies` : `org.springframework.cloud:spring-cloud-dependencies`
      <br>![Maven Central](https://maven-badges.herokuapp.com/maven-central/org.springframework.cloud/spring-cloud-dependencies/badge.svg)
    - `SpringBootDependencies` : `org.springframework.boot:spring-boot-dependencies`
      <br>![Maven Central](https://maven-badges.herokuapp.com/maven-central/org.springframework.boot/spring-boot-dependencies/badge.svg)
    - `SpringBoot整合Maven插件` : `org.springframework.boot:spring-boot-maven-plugin`
      <br>![Maven Central](https://maven-badges.herokuapp.com/maven-central/org.springframework.boot/spring-boot-maven-plugin/badge.svg)
    - `Maven打包插件` : `org.apache.maven.plugins:maven-compiler-plugin`
      <br>![Maven Central](https://maven-badges.herokuapp.com/maven-central/org.apache.maven.plugins/maven-compiler-plugin/badge.svg)
    - `MySQL(与服务器版本号对应，不需一致)` : `mysql:mysql-connector-java`
      <br>![Maven Central](https://maven-badges.herokuapp.com/maven-central/mysql/mysql-connector-java/badge.svg)
    - `实体层注解(与IDE安装的版本号对应，不需一致)` : `org.projectlombok:lombok`
      <br>![Maven Central](https://maven-badges.herokuapp.com/maven-central/org.projectlombok/lombok/badge.svg)
    - `MyBatis` : `org.mybatis.spring.boot:mybatis-spring-boot-starter`
      <br>![Maven Central](https://maven-badges.herokuapp.com/maven-central/org.mybatis.spring.boot/mybatis-spring-boot-starter/badge.svg)
    - `雪花ID生成器` : `cn.404z:id-spring-boot-autoconfigure`
      <br>![Maven Central](https://maven-badges.herokuapp.com/maven-central/cn.404z/id-spring-boot-autoconfigure/badge.svg)
    - `FastJson` : `com.alibaba:fastjson`
      <br>![Maven Central](https://maven-badges.herokuapp.com/maven-central/com.alibaba/fastjson/badge.svg)
    - `HuTool工具包` : `cn.hutool:hutool-all`
      <br>![Maven Central](https://maven-badges.herokuapp.com/maven-central/cn.hutool/hutool-all/badge.svg)
- `dependencyManagement` : 依赖管理，不用写版本号
- `profiles` : 配置
  - `profile.id:install` : 打包配置
    - `activation.activeByDefault:true` : 默认配置
    - `build.plugins.plugin.configuration` : 插件配置，编译插件
      - `source`和`target` : 指定java版本
