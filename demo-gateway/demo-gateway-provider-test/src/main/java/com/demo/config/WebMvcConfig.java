package com.demo.config;

import cn.z.constant.FormatConstant;
import cn.z.spring.tool.FastJsonHttpMessageConverter;
import com.demo.interceptor.UserInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.List;

/**
 * <h1>WebMvc配置</h1>
 *
 * <p>
 * createDate 2023/03/03 13:13:13
 * </p>
 *
 * @author ALI[ali-k@foxmail.com]
 * @since 1.0.0
 **/
@Configuration
public class WebMvcConfig implements WebMvcConfigurer {

    /**
     * 消息转换器
     */
    @Override
    public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
        converters.add(0, new FastJsonHttpMessageConverter(FormatConstant.DATE, FormatConstant.JSON_READER_FEATURE, FormatConstant.JSON_WRITER_FEATURE));
    }

    /**
     * 用户拦截器
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new UserInterceptor()) // 用户拦截器
                .addPathPatterns("/**") // 拦截所有路径
                .excludePathPatterns("/") // 排除首页
                .excludePathPatterns("/error") // 排除404
                .excludePathPatterns("/favicon.ico") // 排除图标
        ;
    }

}
