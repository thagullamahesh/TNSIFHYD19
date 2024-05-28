package com.si.demo.service;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.si.demo.entity.Student;
import com.si.demo.repository.StudentRepository;

@Service
public class StudentServiceImpl {
	 @Autowired
	    private StudentRepository studentRepository;
	
	
	
	    @Override
	    public Student saveStudent(Student student) {
	        return studentRepository.save(student);
	    }

	    @Override
	    public List<Student> fetchStudentList() {
	        return studentRepository.findAll();
	    }

	   @Override
	   public Student fetchStudentById(Long studentId) {
		   return studentRepository.findById(studentId).get();
	   }
		
	   @Override
	   public void deleteStudentById(Long studentId) {
	       studentRepository.deleteById(studentId);
	   }


	   @Override
	   public Student updateStudent(Long studentId, Student student) {
	       Student database = studentRepository.findById(studentId).get();

	       if(Objects.nonNull(student.getName()) &&
	       !"".equalsIgnoreCase(student.getName())) {
	           database.setName(student.getName());
	       }

	       if(Objects.nonNull(student.getCollege()) &&
	               !"".equalsIgnoreCase(student.getCollege())) {
	          database.setCollege(student.getCollege());
	       }
	if(Objects.nonNull(student.getRoll()) &&
	               !"".equalsIgnoreCase(student.getRoll())) {
	          database.setRoll(student.getRoll());
	       }
	if(Objects.nonNull(student.getQualification()) &&
	               !"".equalsIgnoreCase(student.getQualification())) {
	          database.setQualification(student.getQualification());
	       }
	 if(Objects.nonNull(student.getCourse()) &&
	               !"".equalsIgnoreCase(student.getCourse())) {
	          database.setCourse(student.getCourse());
	       }


	      

	       return studentRepository.save(database);
	   }

}
