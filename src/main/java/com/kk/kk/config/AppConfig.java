/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kk.kk.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/**
 *
 * @author SWASTIK_SHRESTHA
 */
@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.kk.kk")
public class AppConfig {
//    define a bean for ViewResolver
    
    @Bean
    public ViewResolver viewResolver(){
        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
        viewResolver.setPrefix("/WEB-INF/View/");
        viewResolver.setSuffix(".jsp");
        
        return viewResolver;
    }
    
}
