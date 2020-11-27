package com.atguigu.hellospringboot.config;

import com.atguigu.hellospringboot.bean.DataSourceProperties2;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;

/**
 * @author ohhhhhsc
 * @create 2020-11-2419:44
 */
@SpringBootConfiguration
public class JdbcConfig {

    @Bean
    @ConfigurationProperties(prefix = "spring.jdbc.datasource")
    public DataSourceProperties2 dataSourceProperties2(){
        return new DataSourceProperties2();
    }
}
