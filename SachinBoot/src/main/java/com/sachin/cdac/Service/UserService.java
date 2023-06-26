package com.sachin.cdac.Service;

import java.util.List;

import com.sachin.cdac.DTO.UserDto;
import com.sachin.cdac.Entities.User;

public interface UserService {

	//HERE WE JUST LIST DOWN ALL THE METHOD WE HAVE TO PERFORM WITH THE HELP OF USERS
	
	UserDto createUser (UserDto user );
	
	UserDto updateUser (UserDto user,Integer userId);
	
	UserDto getUserById(Integer userId);
	
	List<UserDto> getAllUsers();
	
	void deleteUser(Integer userId);
}
