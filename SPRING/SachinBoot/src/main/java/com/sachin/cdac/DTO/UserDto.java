package com.sachin.cdac.DTO;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class UserDto {

	private int id;
	
	@NotEmpty
	@Size(min =4, message = "Username must be minimum of 4 characters !!!")
	private String name;
	
	@Email(message = "Email Address is not valid !!!")
	private String email;
	
	@NotNull
	@Size(min =5, max =15,message = "Password must be minimum of 5 characters and maximum of 15 charachters !!!" )
	//@Pattern(regexp = ) ----> aplyala konta pn pattern follow karay cha asel tr he use karay cha
	private String password;
	
	@NotNull
	private String about;
}
