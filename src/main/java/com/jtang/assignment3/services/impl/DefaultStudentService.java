package com.jtang.assignment3.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.jtang.assignment3.entities.Student;
import com.jtang.assignment3.repos.StudentRepository;
import com.jtang.assignment3.services.StudentService;

@Service
public class DefaultStudentService implements StudentService {

	@Autowired
	private StudentRepository repo;
	
	@Override
	public List<Student> getStudents() {
		return repo.findAll();
	}
	
	@Override
	public Student findStudent(@PathVariable("id") int id) {
		return repo.findById(id).get();
	}
	
	@Override
	public Student createStudent(@RequestBody Student student) {
		return repo.save(student);
	}
	
	@Override
	public Student updateStudent(@RequestBody Student student) {
		return repo.save(student);
	}
	
	@Override
	public void deleteStudentById(@PathVariable("id") int id) {
		repo.deleteById(id);
	}
}
