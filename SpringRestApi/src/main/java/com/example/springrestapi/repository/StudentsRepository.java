package com.example.springrestapi.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.springrestapi.data.entity.Student;



public interface StudentsRepository extends CrudRepository<Student, Integer> {
	
	Student findById( int id );
}