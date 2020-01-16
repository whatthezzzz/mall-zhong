package com.zhong.mall.tiny;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class MallTinyApplication {

    public static void main(String[] args) {
        SpringApplication.run(MallTinyApplication.class, args);
    }

}
