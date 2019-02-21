package com.mmall.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

//@Configuration
@ImportResource(locations = {"classpath:logback.xml"})
public class LogbackConfig {
}
