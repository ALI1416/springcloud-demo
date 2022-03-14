package com.demo.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * <h1>网关路由配置</h1>
 *
 * <p>代码注入</p>
 *
 * <p>
 * createDate 2022/03/14 11:32:07
 * </p>
 *
 * @author ALI[ali-k@foxmail.com]
 * @since 1.0.0
 **/
@Configuration
public class GatewayRouteConfig {

    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
        RouteLocatorBuilder.Builder routes = builder.routes();
        routes.route("c", r -> r.path("/c").uri("http://localhost:8080/c"));
        // 动态路由(无效)
        // routes.route("c", r -> r.path("/c").uri("lb://gateway-provider/c"));
        return routes.build();
    }

}
