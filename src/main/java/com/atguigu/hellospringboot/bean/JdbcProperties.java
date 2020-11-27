package com.atguigu.hellospringboot.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author ohhhhhsc
 * @create 2020-11-2419:42
 */
@Component
@ConfigurationProperties(prefix = "spring.jdbc")
public class JdbcProperties {

    DataSourceProperties2 datasource;
    String type;

    @Override
    public String toString() {
        return "JdbcProperties{" +
                "datasource=" + datasource +
                ", type='" + type + '\'' +
                '}';
    }

    public DataSourceProperties2 getDatasource() {
        return datasource;
    }

    public void setDatasource(DataSourceProperties2 datasource) {
        this.datasource = datasource;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
