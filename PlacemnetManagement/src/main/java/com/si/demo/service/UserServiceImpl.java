package com.si.demo.service;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.si.demo.entity.User;
import com.si.demo.repository.UserRepository;

@Service
public class UserServiceImpl {
	 @Autowired
	    private UserRepository userRepository;
	
	
	
	    @Override
	    public User saveUser(User user) {
	        return userRepository.save(user);
	    }

	    @Override
	    public List<User> fetchUserList() {
	        return userRepository.findAll();
	    }

	   @Override
	   public User fetchUserById(Long userId) {
		   return userRepository.findById(userId).get();
	   }
		
	   @Override
	   public void deleteUserById(Long userId) {
	      userRepository.deleteById(userId);
	   }


	   @Override
	   public User updateUser(Long userId, User user) {
	       User database = userRepository.findById(userId).get();

	       if(Objects.nonNull(user.getUsername()) &&
	       !"".equalsIgnoreCase(user.getUsername())) {
	           database.setUsername(user.getUsername());
	       }

	       if(Objects.nonNull(user.getUserpassword()) &&
	               !"".equalsIgnoreCase(user.getUserpassword())) {
	          database.setUserpassword(user.getUserpassword());
	       }

	       return userRepository.save(database);
	   }

}
