package com.chia.yurui.mall.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class YuruiOrderApplication {

    public static void main(String[] args) {
        SpringApplication.run(YuruiOrderApplication.class, args);
    }

}
