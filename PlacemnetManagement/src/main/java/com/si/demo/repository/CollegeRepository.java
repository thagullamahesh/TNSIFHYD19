package com.si.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.si.demo.entity.College;

@Repository
public interface CollegeRepository extends JpaRepository<College, Long>{

}
