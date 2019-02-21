package com.mmall.config;

import com.github.pagehelper.PageHelper;
import org.apache.commons.dbcp.BasicDataSource;
import org.apache.commons.dbcp.BasicDataSourceFactory;
import org.apache.ibatis.plugin.Interceptor;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.core.io.InputStreamResource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternUtils;

import javax.sql.DataSource;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URL;
import java.util.Properties;

//@Configuration
@MapperScan(basePackages = "com.mmall.mapper", value="sqlSessionFactory")
@ImportResource(locations = {"classpath:/applicationContext-datasource.xml"})
public class DataSourceConfig {
/*    @Bean(name = "propertyConfigurer")
    public PropertyPlaceholderConfigurer getPropertyConfigurer(){
        PropertyPlaceholderConfigurer configurer = new PropertyPlaceholderConfigurer();
        configurer.setOrder(2);
        configurer.setIgnoreUnresolvablePlaceholders(true);
        try{
            configurer.setLocation(new PathMatchingResourcePatternResolver().getResource("classpath:datasource.properties"));
        }catch (Exception e){
            e.printStackTrace();
        }
        configurer.setFileEncoding("utf-8");

        return configurer;
    }

    @Bean(name = "dataSource")
    public BasicDataSource getDataSource(){
        BasicDataSource dataSource = new BasicDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://192.168.56.10:3306/mmall?useUnicode=true&characterEncoding=utf8&allowMultiQueries=true&useSSL=false&serverTimezone=Asia/Shanghai");
        dataSource.setUsername("mmall");
        dataSource.setPassword("123456");
        dataSource.setInitialSize(20);
        dataSource.setMaxActive(50);
        dataSource.setMaxIdle(20);
        dataSource.setMinIdle(10);
        dataSource.setMaxWait(10);
        dataSource.setDefaultAutoCommit(true);
        dataSource.setMinEvictableIdleTimeMillis(3600000);
        dataSource.setTimeBetweenEvictionRunsMillis(40000);
        dataSource.setTestWhileIdle(true);
        dataSource.setValidationQuery("SELECT 1 FROM dual");

        return  dataSource;
    }

    @Bean(name = "sqlSessionFactory")
    public SqlSessionFactoryBean getSqlSessionFactoryBean(@Qualifier("dataSource")DataSource dataSource){
        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
        bean.setDataSource(dataSource);
        try{
            bean.setMapperLocations(new PathMatchingResourcePatternResolver().getResources("classpath*:mappers/*Mapper.xml"));
        }catch (Exception e){
            e.printStackTrace();
        }
        PageHelper pageHelper = new PageHelper();
        Properties properties = new Properties();
        properties.setProperty("dialect", "mysql");
        pageHelper.setProperties(properties);
        Interceptor[] interceptors = new Interceptor[1];
        interceptors[0] = pageHelper;
        bean.setPlugins(interceptors);

        return bean;
    }*/

}
