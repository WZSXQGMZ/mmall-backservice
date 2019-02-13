package com.mmall.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource(locations = {"classpath:/generatorConfig.xml"})
public class DaoConfig {
}
