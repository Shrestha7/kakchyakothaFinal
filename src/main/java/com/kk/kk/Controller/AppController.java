/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kk.kk.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author SWASTIK_SHRESTHA
 */
@Controller
public class AppController {
    
    @GetMapping("/")
    public String showHome(){
        
        return "home";
    }
    
}
