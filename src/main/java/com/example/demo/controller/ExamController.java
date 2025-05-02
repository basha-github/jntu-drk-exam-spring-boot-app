package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Student;
import com.example.demo.service.StudentService;

@RestController
@CrossOrigin("*")
public class ExamController {
	
	
	@Autowired
	StudentService stuService;
	
	
	
	@GetMapping("/jntu/drk/exam")
	public Student getStuMarks() {
		
		Student stu = new Student(12345,"Ramya","DRK","CSE",87);
		
		return stu;
	}
	
	
	@PostMapping("/jntu/exam/add/marks")
	public String addNewStudentMarks(@RequestBody Student stu) {
		
		System.out.println("from react app----->student"+stu);
		
		stuService.saveNewStudent(stu);
		
		return "successfully added into db";
	}
	
	
	
	
	

}
