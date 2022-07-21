package com.nowcoder.community.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;

import java.text.SimpleDateFormat;
import java.util.logging.SimpleFormatter;

/**
 * @Author Le
 * @Data 2022/7/18 16:53
 */
@Configuration
public class AlphaConfig {

    @Bean
    public SimpleDateFormat simpleDateFormat(){
        return  new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    }
}
