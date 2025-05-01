package com.example.demo.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Student;

@RestController
@CrossOrigin("*")
public class ExamController {
	
	
	@GetMapping("/jntu/drk/exam")
	public Student getStuMarks() {
		
		Student stu = new Student(12345,"Ramya","DRK","CSE",87);
		
		return stu;
	}
	
	
	

}
