package com.mmall.config;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@MapperScan("com.mmall.dao")
@ImportResource(locations = {"classpath:/generatorConfig.xml"})
public class DaoConfig {
}
