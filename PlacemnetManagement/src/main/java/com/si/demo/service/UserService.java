package com.si.demo.service;

import java.util.List;

import com.si.demo.entity.User;

public interface UserService {
	public User saveUser(User user);

	public List<User> fetchUserList();

	public User fetchUserById(Long userId);

	public void deleteUserById(Long userId);

	public User updateUser(Long userId, User user);

}
