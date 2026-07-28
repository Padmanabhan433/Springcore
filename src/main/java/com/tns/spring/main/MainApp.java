package com.tns.spring.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.tns.spring.config.AppConfig;
import com.tns.spring.entity.Course;
import com.tns.spring.service.StudentService;
 
public class MainApp {
 
    public static void main(String[] args) {
 
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);
 
        StudentService service = context.getBean(StudentService.class);
        service.registerStudent();
 
        System.out.println("\n----- Bean Scope Demo -----");
 
        Course c1 = context.getBean(Course.class);
        Course c2 = context.getBean(Course.class);
 
        System.out.println("Course Bean 1 : " + c1);
        System.out.println("Course Bean 2 : " + c2);
 
        if (c1 == c2) {
            System.out.println("Singleton Scope");
        } else {
            System.out.println("Prototype Scope");
        }
 
        context.close();
    }
}
