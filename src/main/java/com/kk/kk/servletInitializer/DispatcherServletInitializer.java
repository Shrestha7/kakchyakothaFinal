/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kk.kk.servletInitializer;

import com.kk.kk.config.AppConfig;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 *
 * @author SWASTIK_SHRESTHA
 */
public class DispatcherServletInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    @Override
    protected Class<?>[] getRootConfigClasses() {
//       TODO Auto-generated method stub
        return null;
    }
    
    @Override
    protected Class<?>[] getServletConfigClasses(){
        return new Class[] {AppConfig.class};
    }
    
    @Override
    protected String[] getServletMappings(){
        return new String[] {"/"};
    }

}
