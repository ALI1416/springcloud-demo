package com.demo.filter;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.Ordered;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.server.RequestPath;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.http.server.reactive.ServerHttpResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

/**
 * <h1>权限全局网关过滤器</h1>
 *
 * <p>
 * createDate 2023/12/20 10:02:59
 * </p>
 *
 * @author ALI[ali-k@foxmail.com]
 * @since 1.0.0
 **/
@Component
@Slf4j
public class AuthGlobalGatewayFilter implements GlobalFilter, Ordered {

    /**
     * 过滤器
     *
     * @param exchange ServerWebExchange
     * @param chain    GatewayFilterChain
     * @return Mono Void
     */
    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        ServerHttpRequest request = exchange.getRequest();
        RequestPath path = request.getPath();
        HttpHeaders headers = request.getHeaders();
        log.info("权限全局网关过滤器 RequestPath {}, HttpHeaders {}", path, headers);
        // 认证失败
        if ("/test/get3".equals(path.pathWithinApplication().value())) {
            ServerHttpResponse response = exchange.getResponse();
            response.setStatusCode(HttpStatus.UNAUTHORIZED);
            return response.setComplete();
        }
        // 新增请求头
        ServerWebExchange build = exchange.mutate().request(
                builder -> builder.header("user-id", "1234")
        ).build();
        return chain.filter(build);
    }

    /**
     * 执行顺序
     *
     * @return 顺序
     */
    @Override
    public int getOrder() {
        return 0;
    }

}
