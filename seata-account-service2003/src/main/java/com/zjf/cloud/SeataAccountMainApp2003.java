package com.zjf.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @Author zjf
 * @Date 2024/2/29
 */
@SpringBootApplication
@EnableFeignClients
@MapperScan("com.zjf.cloud.mapper")//import tk.mybatis.spring.annotation.MapperScan;
@EnableDiscoveryClient
public class SeataAccountMainApp2003 {

    public static void main(String[] args)
        {
            SpringApplication.run(SeataAccountMainApp2003.class,args);
        }
}