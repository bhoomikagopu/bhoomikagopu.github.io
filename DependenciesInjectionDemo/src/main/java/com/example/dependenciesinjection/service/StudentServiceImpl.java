package com.example.dependenciesinjection.service;

import java.util.List;

import java.util.ArrayList;



import com.example.dependenciesinjection.model.Student;



public class StudentServiceImpl implements StudentService {
	
	private List<Student> studentList = new ArrayList<>();
	
	

	@Override
	public void add(Student student) {
		// TODO Auto-generated method stub
		studentList.add(student);

	}

	@Override
	public void delete(Student student) {
		// TODO Auto-generated method stub
		studentList.remove(student);

	}

	@Override
	public List<Student> all() {
		// TODO Auto-generated method stub
		return studentList;
	}

	@Override
	public Student findById(String id) {
		// TODO Auto-generated method stub
		for(Student student : studentList) {
			if(student.getIdStudent().equals(id)) {
				return student;
			}
		}
		return null;
	}

}
