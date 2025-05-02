package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Student;
import com.example.demo.repo.StudentRepo;

@Service
public class StudentService {
	
	@Autowired
	StudentRepo stuRepo;
	

	public void saveNewStudent(Student stu) {
		
		stuRepo.save(stu);
		
	}


	public List<Student> getAllStus() {
		return stuRepo.findAll();
	}


	public Student getStudent(int id) {
		// TODO Auto-generated method stub
		return stuRepo.findById(id).get();
	}

}
