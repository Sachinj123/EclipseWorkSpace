package com.sachin.cdac.Service.Impl;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sachin.cdac.DTO.UserDto;
import com.sachin.cdac.Entities.User;
import com.sachin.cdac.Exceptions.ResourceNotFoundException;
import com.sachin.cdac.Repositories.UserRepo;
import com.sachin.cdac.Service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepo userRepo;
	
	@Autowired
	private ModelMapper modelMapper;
	
	@Override
	public UserDto createUser(UserDto userDto) {
		User user = this.dtoToUser(userDto);
		User savedUser = this.userRepo.save(user);
		
		return this.UserToDto(savedUser);
	}

	@Override
	public UserDto updateUser(UserDto userDto, Integer userId) 
	{
		User user =this.userRepo.findById(userId).orElseThrow(() -> new ResourceNotFoundException("User","id",userId));


		user.setName(userDto.getName());
		user.setEmail(userDto.getEmail());
		user.setPassword(userDto.getPassword());
		user.setAbout(userDto.getAbout());
		
		User updateUser =  this.userRepo.save(user);
		UserDto userDto1 = this.UserToDto(updateUser);
		return userDto1;
	}

	@Override
	public UserDto getUserById(Integer userId)
	{
		User user =this.userRepo.findById(userId).orElseThrow(() -> new ResourceNotFoundException("User","id",userId));
		
		
		return this.UserToDto(user);
	}

	@Override
	public List<UserDto> getAllUsers() {
		List<User> users = this.userRepo.findAll();
		
	   List<UserDto> userDto = users.stream().map(user->this.UserToDto(user)).collect(Collectors.toList());
		
		return userDto;
	}

	@Override
	public void deleteUser(Integer userId) {
	User user =	this.userRepo.findById(userId).orElseThrow(() -> new ResourceNotFoundException("User","id",userId));;

	this.userRepo.delete(user);
	}
	
	private User dtoToUser(UserDto userDto)
	{
		User user = this.modelMapper.map(userDto, User.class);
		
		//HE SARVA AUTOMATICALLY SARVA CONVERT KARNAR
		//USER ----> USERDTO MADHE
		
		
		/*user.setId(userDto.getId());
		user.setName(userDto.getName());
		user.setEmail(userDto.getEmail());
		user.setPassword(userDto.getPassword());
		user.setAbout(userDto.getAbout());*/
		
		return user;
		
	}
	
	private UserDto UserToDto(User user)
	{
		UserDto userDto = this.modelMapper.map(user, UserDto.class);
		
		/*userDto.setId(user.getId());
		userDto.setName(user.getName());
		userDto.setEmail(user.getEmail());
		userDto.setPassword(user.getPassword());
		userDto.setAbout(user.getAbout());*/
		
		return userDto;
	}

}
