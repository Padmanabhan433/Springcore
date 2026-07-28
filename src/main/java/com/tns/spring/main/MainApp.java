package com.tns.spring.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.tns.spring.config.AppConfig;
import com.tns.spring.service.StudentService;
 
public class MainApp {
 
    public static void main(String[] args) {
 
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);
 
        StudentService service = context.getBean(StudentService.class);
 
        service.registerStudent();
 
        context.close();
    }
}
