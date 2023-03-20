package com.example.springrestapi.service;

import com.example.springrestapi.data.entity.Student;

public interface StudentService {
	
	Iterable<Student> all();

    Student get( int studentId );

    Student save( Student student );

    void delete( int studentId );

}