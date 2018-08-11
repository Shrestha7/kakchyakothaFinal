/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*This class is used to create user and set their authentication. 
Each time login is required when user want to access into the
application.*/
package com.kakchyakotha.kakchyakothafinal;

import org.springframework.context.annotation.*;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.*;
import org.springframework.security.core.userdetails.*;
import org.springframework.security.core.userdetails.User.UserBuilder;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

/**
 *
 * @author SWASTIK_SHRESTHA
 */

@EnableWebSecurity
@ComponentScan("com.kakchyakotha")
@EnableGlobalMethodSecurity(prePostEnabled=true)
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
@Bean
public UserDetailsService UserDetailsService(){
    //ensure the passwords are encoded properly
    UserBuilder users = User.withDefaultPasswordEncoder();
    InMemoryUserDetailsManager manager = new InMemoryUserDetailsManager();
manager.createUser(users.username("ram").password("user1").roles("USER").build());
manager.createUser(users.username("admin").password("admin1").roles("ADMIN").build());
return manager;
}
@Override
protected void configure(HttpSecurity http) throws Exception {
http.authorizeRequests().
antMatchers("/index","/").permitAll()
.antMatchers("/admin","/user").authenticated()
.and()
.formLogin()
.and()
.logout()
.logoutRequestMatcher(new AntPathRequestMatcher("/logout"));
}
}
