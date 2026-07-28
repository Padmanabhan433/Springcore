package com.tns.spring.entity;

import org.springframework.stereotype.Component;
import org.springframework.context.annotation.Scope;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
 
@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class Course {
 
    public Course() {
        System.out.println("Course Bean Created");
    }
 
    @PostConstruct
    public void init() {
        System.out.println("PostConstruct Method Executed");
    }
 
    @PreDestroy
    public void destroy() {
        System.out.println("PreDestroy Method Executed");
    }
 
    public void displayCourse() {
        System.out.println("Course : Spring Framework");
    }
}
