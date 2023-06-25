package com.jtang.assignment3.services;

import java.util.List;

import com.jtang.assignment3.entities.Student;

public interface StudentService {

	public List<Student> getStudents();
	
	public Student findStudent(int id);
	
	public Student updateStudent(Student student);
	
	public Student createStudent(Student student);
	
	public void deleteStudentById(int id);
}
