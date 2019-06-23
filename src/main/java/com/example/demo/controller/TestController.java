package com.example.demo.controller;

import com.example.demo.mapper.CthUserMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("test")
public class TestController {
    private Logger log = LoggerFactory.getLogger(this.getClass());
    @Autowired
    private CthUserMapper cthUserMapper;
    @Autowired
    private RedisTemplate redisTemplate;

    @GetMapping("testGet")
    public String testGet() {

        return "success";
    }
}
