package com.si.demo.service;

import java.util.List;

import com.si.demo.entity.Student;

public interface StudentService {
	public Student saveStudent(Student student);

	public List<Student> fetchStudentList();

	public Student fetchStudentById(Long studentId);

	public void deleteStudentById(Long studentId);

	public Student updateStudent(Long studentId, Student student);

}
