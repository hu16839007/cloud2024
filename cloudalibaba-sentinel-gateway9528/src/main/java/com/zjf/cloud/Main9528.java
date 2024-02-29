package com.zjf.cloud;

import com.sun.tools.javac.Main;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author zjf
 * @Date 2024/2/28
 */
@SpringBootApplication
@EnableDiscoveryClient
public class Main9528 {
   public static void main(String[] args)
       {
           SpringApplication.run(Main9528.class,args);
       }
}