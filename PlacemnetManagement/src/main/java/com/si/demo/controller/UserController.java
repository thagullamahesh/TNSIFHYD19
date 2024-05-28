package com.si.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.si.demo.entity.User;
import com.si.demo.service.UserService;

@RestController
public class UserController {
	@Autowired
    private UserService userService;
    
    @PostMapping("/user")
    public User saveUser(@RequestBody User user) {
       
        return userService.saveUser(user);
    
}   @GetMapping("/user/{id}")
public User fetchUserById(@PathVariable("id") Long userId)
{
return userService.fetchUserById(userId);
}

@DeleteMapping("/user/{id}")
public String deleteUserById(@PathVariable("id") Long userId) {
userService.deleteUserById(userId);
return "User deleted Successfully!!";
}

@PutMapping("/user/{id}")
public User updateUser(@PathVariable("id") Long userId,
                           @RequestBody User user) {
return userService.updateUser(userId,user);
}
}
