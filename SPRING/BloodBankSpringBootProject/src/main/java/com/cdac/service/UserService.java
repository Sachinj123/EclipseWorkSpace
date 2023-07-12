package com.cdac.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cdac.entity.User;
import com.cdac.repository.UserRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class UserService {

	@Autowired
	private UserRepository userRepository;
	
	//save is responsible for update and insert
	public void saveUser(User user)
	{
		userRepository.save(user);
	}
	
	//HERE WE FETCH THE USER ON THE BASIS OF USERID
	public User fetchUser(int userId)
	{
		return userRepository.findById(userId).get();
	}
	
	//HERE WE DELETE THE USER ON THE BASIS OF USERID
	public void deleteUser(int userId)
	{
		 userRepository.deleteById(userId);
	}
}
