package com.si.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.si.demo.entity.Student;
import com.si.demo.service.StudentService;

@RestController
public class StudentController {
	 @Autowired
	    private StudentService studentService;
	    
	    @PostMapping("/student")
	    public Student saveStudent(@RequestBody Student student) {
	       
	        return studentService.saveStudent(student);
	    
	}   @GetMapping("/student/{id}")
	public Student fetchStudenttById(@PathVariable("id") Long studentId)
	{
	return studentService.fetchStudentById(studentId);
	}

	@DeleteMapping("/student/{id}")
	public String deleteStudentById(@PathVariable("id") Long studentId) {
	studentService.deleteStudentById(studentId);
	return "Student deleted Successfully!!";
	}

	@PutMapping("/student/{id}")
	public Student updateStudent(@PathVariable("id") Long studentId,
	                           @RequestBody Student student) {
	return studentService.updateStudent(studentId,student);
	}

}
