package com.demo.filter;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.gateway.filter.GatewayFilter;
import org.springframework.cloud.gateway.filter.OrderedGatewayFilter;
import org.springframework.cloud.gateway.filter.factory.AbstractGatewayFilterFactory;
import org.springframework.http.server.RequestPath;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

/**
 * <h1>自定义网关过滤器</h1>
 *
 * <p>
 * createDate 2023/12/20 10:15:58
 * </p>
 *
 * @author ALI[ali-k@foxmail.com]
 * @since 1.0.0
 **/
@Component
@Slf4j
public class MyGatewayFilterFactory extends AbstractGatewayFilterFactory<MyGatewayFilterFactory.Config> {

    /**
     * 应用
     *
     * @param config Config
     * @return GatewayFilter
     */
    @Override
    public GatewayFilter apply(Config config) {
        return new OrderedGatewayFilter((exchange, chain) -> {
            ServerHttpRequest request = exchange.getRequest();
            RequestPath path = request.getPath();
            log.info("自定义网关过滤器 RequestPath {}, Config {}", path, config);
            return chain.filter(exchange);
        }, 1);
    }

    /**
     * 构造函数
     */
    public MyGatewayFilterFactory() {
        super(Config.class);
    }

    /**
     * 设置参数顺序
     *
     * @return 参数顺序
     */
    @Override
    public List<String> shortcutFieldOrder() {
        return Arrays.asList("a", "b", "c");
    }

    /**
     * 配置
     */
    public static class Config {

        /**
         * 参数a
         */
        private String a;
        /**
         * 参数b
         */
        private String b;
        /**
         * 参数c
         */
        private String c;

        public String getA() {
            return a;
        }

        public void setA(String a) {
            this.a = a;
        }

        public String getB() {
            return b;
        }

        public void setB(String b) {
            this.b = b;
        }

        public String getC() {
            return c;
        }

        public void setC(String c) {
            this.c = c;
        }

        @Override
        public String toString() {
            return "Config{" +
                    "a='" + a + '\'' +
                    ", b='" + b + '\'' +
                    ", c='" + c + '\'' +
                    '}';
        }

    }

}
