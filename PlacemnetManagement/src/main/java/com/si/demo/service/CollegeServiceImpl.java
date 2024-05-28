package com.si.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.si.demo.entity.College;
import com.si.demo.repository.CollegeRepository;


@Service
public class CollegeServiceImpl {
	@Autowired
	CollegeRepository collegeRepository;
	@Override
	public College saveCollege(College college) {
		
		return collegeRepository.save(college);
	}


}
