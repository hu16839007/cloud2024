package com.zjf.cloud.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @Author zjf
 * @Date 2024/2/27
 */
@Configuration
public class RestTemplateConfig
{
    //把RestTemplate交给String管理
    @Bean
    public RestTemplate restTemplate()
    {
        return new RestTemplate();
    }
}