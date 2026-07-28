package com.tns.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
 
import com.tns.spring.entity.Student;
 
@Configuration
@ComponentScan(basePackages = "com.tns.spring")
public class AppConfig {
 
    @Bean
    public Student student() {
        return new Student(101, "Padmanabh");
    }
}
