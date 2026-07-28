package com.tns.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
 
import com.tns.spring.repository.StudentRepository;
 
@Service
public class StudentService {
 
    private final StudentRepository studentRepository;
 
    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
        System.out.println("StudentService Bean Created");
    }
 
    public void registerStudent() {
        System.out.println("Student Registered Successfully");
        studentRepository.saveStudent();
    }
}