package com.mmall.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.web.servlet.DelegatingFilterProxyRegistrationBean;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
/*import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.session.data.redis.config.annotation.web.http.RedisHttpSessionConfiguration;
import org.springframework.session.web.http.DefaultCookieSerializer;*/
import org.springframework.web.filter.DelegatingFilterProxy;
import redis.clients.jedis.JedisPoolConfig;

import java.util.LinkedList;
import java.util.List;

@Configuration
//@ImportResource(locations = {"classpath:/applicationContext-spring-session.xml"})
public class RedisConfig {

/*    @Bean(name = "redisHttpSesionConfiguration")
    public RedisHttpSessionConfiguration getRedisHttpSessionConfiguration(){
        RedisHttpSessionConfiguration configuration = new RedisHttpSessionConfiguration();
        configuration.setMaxInactiveIntervalInSeconds(1800);

        return configuration;
    }*/

/*    @Bean(name = "defaultCookieSerializer")
    public DefaultCookieSerializer getDefaultCookieSerializer(){
        DefaultCookieSerializer serializer = new DefaultCookieSerializer();
        serializer.setDomainName(".mmall.com");
        serializer.setUseHttpOnlyCookie(true);
        serializer.setCookiePath("/");
        serializer.setCookieMaxAge(31536000);

        return serializer;
    }*/

    @Bean(name = "jedisPoolConfig")
    public JedisPoolConfig getJedisPoolConfig(){
        JedisPoolConfig config = new JedisPoolConfig();
        config.setMaxTotal(20);

        return config;
    }

/*    @Bean(name = "jedisConnectionFactory")
    public JedisConnectionFactory getJedisConnectionFactory(@Qualifier("jedisPoolConfig")JedisPoolConfig jedisPoolConfig){
        JedisConnectionFactory factory = new JedisConnectionFactory();
        factory.setHostName("192.168.56.10");
        factory.setPort(6379);
        factory.setPoolConfig(jedisPoolConfig);

        return factory;
    }*/
}
