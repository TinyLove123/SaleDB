/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.vtt.repository.impl;

import com.vtt.hibernatedemo.HibernateConfig;
import com.vtt.pojo.Category;
import jakarta.persistence.Query;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author admin
 */
public class CategoryRepositoryImpl {
    public List<Category> getCates(){
        try(Session s = HibernateConfig.getFACTORY().openSession()){
            Query q = s.createQuery("From Category", Category.class);
            return q.getResultList();
        }
    }
    
}
