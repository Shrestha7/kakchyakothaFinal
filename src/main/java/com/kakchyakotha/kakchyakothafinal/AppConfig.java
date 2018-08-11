/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kakchyakotha.kakchyakothafinal;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

/**
 *
 * @author SWASTIK_SHRESTHA
 */
@EnableWebMvc
@Configuration
@ComponentScan({"com.kakchyakotha.kakchyakothafinal.controller.*"})
public class AppConfig {

    @Bean
   public InternalResourceViewResolver viewResolver() {
InternalResourceViewResolver viewResolver
= new InternalResourceViewResolver();
viewResolver.setViewClass(JstlView.class);
viewResolver.setPrefix("/WEB-INF/views/");
viewResolver.setSuffix(".jsp");
return viewResolver;
}
}
