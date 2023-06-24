package com.jtang.assignment3.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.jtang.assignment3.entities.Student;
import com.jtang.assignment3.services.StudentService;

@RestController
public class StudentRestController {

	@Autowired
	private StudentService service;
	
	@RequestMapping(value = "/students/", method = RequestMethod.GET)
	public List<Student> getStudents() {
		return service.getStudents();
	}
	
	@RequestMapping(value = "/students/{id}", method = RequestMethod.GET)
	public Student findStudent(@PathVariable("id") int id) {
		return service.findStudent(id);
	}
	
	@RequestMapping(value = "/students/", method = RequestMethod.POST)
	public Student createStudent(@RequestBody Student student) {
		return service.createStudent(student);
	}
	
	@RequestMapping(value = "/students/", method = RequestMethod.PUT)
	public Student updateStudent(@RequestBody Student student) {
		return service.updateStudent(student);
	}
	
	@RequestMapping(value = "/students/{id}", method = RequestMethod.DELETE)
	public void deleteStudent(@PathVariable("id") int id) {
		service.deleteStudent(id);
	}
	
}
