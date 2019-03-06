package com.mmall;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@EnableAutoConfiguration
@Controller
@EnableEurekaClient
public class MmallBackserviceApplication extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(MmallBackserviceApplication.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(MmallBackserviceApplication.class, args);
	}

	@RequestMapping(path = "/")
	public String getIndex(){
		return "/WEB-INF/index.html";
	}
}

