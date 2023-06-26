package com.sachin.cdac.Controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sachin.cdac.DTO.ApiResponce;
import com.sachin.cdac.DTO.UserDto;
import com.sachin.cdac.Service.UserService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/users")
public class UserController {

	@Autowired
	private UserService userService;
	
	//POST CREATE USER
	@PostMapping("/")
	public ResponseEntity<UserDto> createUser(@Valid   @RequestBody UserDto userDto )
	{
		UserDto createUserDto = this.userService.createUser(userDto);
		return new ResponseEntity<>(createUserDto,HttpStatus.CREATED);
	}
	//USER CREATE AND UPDATE SATHI APAN SAME "URL" SAME THEVLAY --->"/"
	//PUT UPDATE USER ----> UPDATE
	
	@PutMapping("/{userId}")
	//{userId} ----> Path URI VARIABLE YA ID LA FETCH KARAYCHA 
	
	public ResponseEntity<UserDto> updateUser(@Valid @RequestBody UserDto userDto,@PathVariable("userId") Integer uid)
	{
		UserDto updateUser = this.userService.updateUser(userDto,uid);
		return ResponseEntity.ok(updateUser);
	}
	
	 
	
	//DELETE - DELETE USER
	@DeleteMapping("/{userId}")
	public ResponseEntity<ApiResponce> deleteUser(@PathVariable ("userId") Integer uid)
	{
		this.userService.deleteUser(uid);
		return new  ResponseEntity(new ApiResponce("User Deleted Successfully",true), HttpStatus.OK);
	}
	
	//GET - GET USER
	@GetMapping("/")
   public ResponseEntity<List<UserDto>> getAllUsers()
   {
	   return ResponseEntity.ok(this.userService.getAllUsers());
   }
	
	@GetMapping("/{userId}")
	 public ResponseEntity<UserDto> getSingleUsers(@PathVariable Integer userId)
	 {
		return ResponseEntity.ok(this.userService.getUserById(userId));
	 }
	   
}
