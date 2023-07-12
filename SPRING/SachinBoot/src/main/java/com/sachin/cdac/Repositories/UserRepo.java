package com.sachin.cdac.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sachin.cdac.Entities.User;

public interface UserRepo extends JpaRepository<User, Integer> 
{
	 //JpaRepository Consist of All CURD operation 
	//like insert,update,delete,select
	
	//Instead of JPARepo we can use CrudRepo

}
