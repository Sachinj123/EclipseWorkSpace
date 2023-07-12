package com.cdac;

import java.time.LocalDate;
import java.time.LocalTime;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.cdac.entity.Bloodbank;
import com.cdac.entity.Post;
import com.cdac.entity.User;
import com.cdac.repository.BloodBankRepository;
import com.cdac.repository.PostRepository;
import com.cdac.repository.UserRepository;

@SpringBootTest
class BloodBankSpringBootProjectApplicationTests {

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private PostRepository postRepository;
	
	@Autowired
	private BloodBankRepository bloodBankRepository;

	@Test
	void addBloodBank()
	{
		Bloodbank bb = new Bloodbank();
		bb.setBloodBankName("Sheshai Niwas");
		bb.setEmailId("sheshaibloodbank@gmail.com");
		bb.setRegisteredOn(LocalDate.of(2019, 01, 01));
		bb.setOpenAt(LocalTime.of(9, 30));
		bb.setCloseAt(LocalTime.of(6, 0));
		
		bloodBankRepository.save(bb);
	}
	
	@Test
	void addUser()
	{
		Bloodbank bb = bloodBankRepository.findById(1).get();
		
		User user = new User();
		
		user.setUserName("credence_9");
		user.setAddress("Nanded");
		user.setBloodType("O+");
		user.setDateOfBirth(LocalDate.of(1997, 8, 03));
		user.setEmail("credence_4545@gmail.com");
		user.setGender("Male");
		user.setBloodBank(bb);
		
		userRepository.save(user);
	}
	
	@Test
	void addPost()
	{
		User user = userRepository.findById(1).get();
		
		Post post = new Post();
		post.setBloodType("AB");
		post.setAntigen("Positive");
		post.setPostCategory("Donar");
		post.setPostCreatedOn(LocalDate.of(2022, 12, 12));
		post.setUserId(user);
		
		postRepository.save(post);
		
	}

}
