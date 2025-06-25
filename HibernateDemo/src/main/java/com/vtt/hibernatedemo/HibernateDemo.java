/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.vtt.hibernatedemo;

import com.vtt.repository.impl.CategoryRepositoryImpl;
import com.vtt.repository.impl.ProductRepositoryImpl;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author admin
 */
public class HibernateDemo {

    public static void main(String[] args) {
//        CategoryRepositoryImpl cs = new CategoryRepositoryImpl();
//        cs.getCates().forEach(c->System.err.println(c.getName()));
    
          Map<String,String>params = new HashMap<>();
          params.put("page", "1");
          ProductRepositoryImpl ps = new ProductRepositoryImpl();
          ps.getProducts(params).forEach(p->System.out.printf("%d - %s \n",p.getId(),p.getName()));
    }
}

