package com.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * <h1>提供者</h1>
 *
 * <p>
 * createDate 2022/02/19 17:14:57
 * </p>
 *
 * @author ALI[ali-k@foxmail.com]
 * @since 1.0.0
 **/
@MapperScan("com.demo.mapper")
@SpringBootApplication
public class P00M01Provider8080App {

    public static void main(String[] args) {
        SpringApplication.run(P00M01Provider8080App.class, args);
    }

}
