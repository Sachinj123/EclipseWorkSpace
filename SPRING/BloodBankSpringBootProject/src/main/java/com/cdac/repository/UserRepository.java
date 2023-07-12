package com.cdac.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.cdac.entity.User;

public interface UserRepository extends CrudRepository<User, Integer> {

	public List<User> findByUserName(String userName);
	
	public List<User> findByUserId(int userId);
}
