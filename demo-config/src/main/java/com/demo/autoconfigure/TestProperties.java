package com.demo.autoconfigure;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * <h1>Test配置属性</h1>
 *
 * <p>
 * createDate 2023/08/31 14:28:35
 * </p>
 *
 * @author ALI[ali-k@foxmail.com]
 * @since 1.0.0
 **/
@ConfigurationProperties(prefix = "test")
public class TestProperties {

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
        return "TestProperties{" +
                "a='" + a + '\'' +
                ", b='" + b + '\'' +
                ", c='" + c + '\'' +
                '}';
    }

}
