package com.atguigu.hellospringboot.helloController;

import com.atguigu.hellospringboot.bean.DataSourceProperties;
import com.atguigu.hellospringboot.bean.DataSourceProperties1;
import com.atguigu.hellospringboot.bean.JdbcProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ohhhhhsc
 * @create 2020-11-249:54
 */
@RestController
@EnableConfigurationProperties(JdbcProperties.class)
public class HelloController1 {

//    DataSourceProperties dataSourceProperties;
    @Autowired
    DataSourceProperties1 dataSourceProperties1;

    @Autowired
    JdbcProperties jdbcProperties;

    @RequestMapping("/hello")
    public String hello() {

        System.err.println(jdbcProperties);
        return "hello SpringBoot!!";
    }
}
