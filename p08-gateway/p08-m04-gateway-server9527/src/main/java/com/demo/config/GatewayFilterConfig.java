package com.demo.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.Ordered;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

/**
 * <h1>网关过滤器配置</h1>
 *
 * <p>代码注入</p>
 *
 * <p>
 * createDate 2022/03/14 16:15:29
 * </p>
 *
 * @author ALI[ali-k@foxmail.com]
 * @since 1.0.0
 **/
@Component
@Slf4j
public class GatewayFilterConfig implements GlobalFilter, Ordered {

    /**
     * 过滤器配置
     */
    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        // 获取查询参数name
        String name = exchange.getRequest().getQueryParams().getFirst("name");
        log.info("用户进入，名称为:" + name);
        if (name == null) {
            log.warn("非法用户！");
            // 未携带name参数的返回406错误
            exchange.getResponse().setStatusCode(HttpStatus.NOT_ACCEPTABLE);
            // 结束请求
            return exchange.getResponse().setComplete();
        }
        // 去执行下一个过滤器
        return chain.filter(exchange);
    }

    /**
     * 最高优先级
     */
    @Override
    public int getOrder() {
        return 0;
    }
}
