package com.demo.config;

import cn.z.constant.FormatConstant;
import cn.z.spring.tool.FastJsonHttpMessageConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * <h1>RestTemplate配置</h1>
 *
 * <p>
 * createDate 2023/12/05 17:43:37
 * </p>
 *
 * @author ALI[ali-k@foxmail.com]
 * @since 1.0.0
 **/
@Configuration
public class RestTemplateConfig {

    /**
     * RestTemplate
     */
    @Bean
    public RestTemplate restTemplate() {
        RestTemplate restTemplate = new RestTemplate();
        List<HttpMessageConverter<?>> converters = restTemplate.getMessageConverters();
        converters.add(0, new FastJsonHttpMessageConverter(FormatConstant.DATE, FormatConstant.JSON_READER_FEATURE, FormatConstant.JSON_WRITER_FEATURE));
        restTemplate.setMessageConverters(converters);
        return restTemplate;
    }

}
