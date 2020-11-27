package com.atguigu.hellospringboot.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author ohhhhhsc
 * @create 2020-11-2418:20
 */
@Component
//使用configurationProperties可以一次性将属性配置注入bean，controller上使用enableConfigurationProperties允许注入
//@ConfigurationProperties(prefix = "spring.jdbc.datasource")
public class DataSourceProperties1 {
    private String driverClassName;
    private String url;
    private String username;
    private String password;

    @Override
    public String toString() {
        return "DataSourceProperties1{" +
                "driverClassName='" + driverClassName + '\'' +
                ", url='" + url + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public String getDriverClassName() {
        return driverClassName;
    }

    public void setDriverClassName(String driverClassName) {
        this.driverClassName = driverClassName;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
