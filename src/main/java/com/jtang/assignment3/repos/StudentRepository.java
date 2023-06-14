package com.jtang.assignment3.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jtang.assignment3.entities.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
