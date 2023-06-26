package com.sachin.cdac.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sachin.cdac.Entities.Category;

public interface CategoryRepo extends JpaRepository<Category, Integer> {

}
