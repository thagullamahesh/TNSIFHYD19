package com.si.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.si.demo.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
