/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.vtt.configs;

import com.vtt.configs.WebAppContextConfigs;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 *
 * @author admin
 */
public class DitpatcherServletInit extends AbstractAnnotationConfigDispatcherServletInitializer{

    @Override
    protected Class<?>[] getRootConfigClasses() {
       return new Class[]{
           ThymeleafConfigs.class,
           HibernateConfigs.class
       };
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[] {
            WebAppContextConfigs.class
        };
    }


    @Override
    protected String[] getServletMappings() {
         return new String[] {"/"};
    }
    
    
    
}
    
