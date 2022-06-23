package com.project.learning.projectdemo.Configurations;

import com.alibaba.druid.pool.DruidDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
@MapperScan("com.project.learning.projectdemo.mapper")
public class PersistenceConfig
{
    @Autowired
    Config config;

    @Bean
    public DataSource dataSource()
    {
        return getDruidDs();
    }

    private DruidDataSource getDruidDs()
    {
        DruidDataSource ds = new DruidDataSource();
        ds.setDriverClassName(config.getDriverClassName());
        ds.setUrl(config.getUrl());
        ds.setUsername(config.getUsername());
        ds.setPassword(config.getPassword());
        return ds;
    }

    @Bean
    public SqlSessionFactory sqlSessionFactory() throws Exception {
        SqlSessionFactoryBean factoryBean=new SqlSessionFactoryBean();
        factoryBean.setDataSource(dataSource());
        return factoryBean.getObject();
    }
}
