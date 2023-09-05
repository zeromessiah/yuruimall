package com.chia.yurui.mall.order.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhaiyujia
 * @date 2023/09/05
 */
@RestController
@RequestMapping("consulConfig")
@RefreshScope
public class ConsulController {
    @Value("${my.name}")
    private String name;

    @PostMapping("test")
    public String test() {
        return name;
    }
}
