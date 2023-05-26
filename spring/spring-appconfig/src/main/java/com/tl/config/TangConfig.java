package com.tl.config;

import com.tl.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TangConfig {

    /**
     * 注册一个bean,就相当于我们写的bean标签
     * 方法名就是id属性
     * 返回值就是class属性
     */
    @Bean
    User user(){
        return new User();
    }
}
