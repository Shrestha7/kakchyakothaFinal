/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kakchyakotha.kakchyakothafinal;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 *
 * @author SWASTIK_SHRESTHA
 */
public class MvcWebApplicationInitializer extends AbstractAnnotationConfigDispatcherServletInitializer{
    @Override
    protected Class<?>[]getRootConfigClasses(){
      return new Class[]{WebSecurityConfig.class};  
    }
    @Override
    protected Class<?>[]getServletConfigClasses(){
        //TODO auto-generated method stub
        return null;
    }
    @Override
    protected String[]getServletMappings(){
        return new String[]{"/"};
    }
}
