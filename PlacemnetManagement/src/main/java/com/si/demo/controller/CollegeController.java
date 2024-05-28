package com.si.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.si.demo.entity.College;
import com.si.demo.service.CollegeService;

@RestController
public class CollegeController {
	@Autowired
    private CollegeService collegeService;
    
    @PostMapping("/college")
    public College saveCollege(@RequestBody College college) {
       
        return collegeService.saveCollege(college);
    
    }
}
