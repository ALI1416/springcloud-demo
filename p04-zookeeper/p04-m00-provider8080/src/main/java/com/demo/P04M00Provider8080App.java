package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

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
@SpringBootApplication
// zookeeper服务发现注解
// 启动成功后，在zkCli中可以看到
// `ls /` 可以看到`[services, zookeeper]`，其中`services`保存服务信息
// `ls /services` 可以看到`[zookeeper-provider]`，其中`zookeeper-provider`是服务名称
// `ls /services/zookeeper-provider`
// 可以看到`[47cfca95-762b-4434-aeac-46059db3296c, ccc72c1b-1523-463e-8eb7-e649fabc4214]`，
// 这两个是客户端名称
// `get /services/zookeeper-provider/47cfca95-762b-4434-aeac-46059db3296c` 可以看到
// {
// 	"name": "zookeeper-provider",
// 	"id": "47cfca95-762b-4434-aeac-46059db3296c",
// 	"address": "DESKTOP-AJC6JKM",
// 	"port": 8081,
// 	"sslPort": null,
// 	"payload": {
// 		"@class": "org.springframework.cloud.zookeeper.discovery.ZookeeperInstance",
// 		"id": "application-1",
// 		"name": "zookeeper-provider",
// 		"metadata": {
// 			"instance_status": "UP"
// 		}
// 	},
// 	"registrationTimeUTC": 1645936814650,
// 	"serviceType": "DYNAMIC",
// 	"uriSpec": {
// 		"parts": [{
// 			"value": "scheme",
// 			"variable": true
// 		}, {
// 			"value": "://",
// 			"variable": false
// 		}, {
// 			"value": "address",
// 			"variable": true
// 		}, {
// 			"value": ":",
// 			"variable": false
// 		}, {
// 			"value": "port",
// 			"variable": true
// 		}]
// 	}
// }
// 该节点类型是，临时节点
@EnableDiscoveryClient
public class P04M00Provider8080App {

    public static void main(String[] args) {
        SpringApplication.run(P04M00Provider8080App.class, args);
    }

}
