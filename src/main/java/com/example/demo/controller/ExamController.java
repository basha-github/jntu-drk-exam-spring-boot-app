package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Student;
import com.example.demo.service.StudentService;

@RestController
@CrossOrigin("*")
public class ExamController {
	
	
	@Autowired
	StudentService stuService;
	
	
	
	@GetMapping("/jntu/drk/exam")
	public Student getStuMarks(@RequestParam int id) {
		
		return stuService.getStudent(id);
	}
	
	
	@PostMapping("/jntu/exam/add/marks")
	public String addNewStudentMarks(@RequestBody Student stu) {
		
		System.out.println("from react app----->student"+stu);
		
		stuService.saveNewStudent(stu);
		
		return "successfully added into db";
	}

	@GetMapping("/jntu/exam/stu/all")
	public List<Student> getAllStudents(){
		
		return stuService.getAllStus();
	}
	
	
	
	
	
	
	

}
