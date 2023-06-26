package com.sachin.cdac.Service.Impl;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sachin.cdac.DTO.CategoryDto;
import com.sachin.cdac.Entities.Category;
import com.sachin.cdac.Exceptions.ResourceNotFoundException;
import com.sachin.cdac.Repositories.CategoryRepo;
import com.sachin.cdac.Service.CategoryService;

@Service
public class CategoryServiceImpl implements CategoryService {

	@Autowired
	private CategoryRepo categoryRepo;
	
	@Autowired
	private ModelMapper modelMapper;
	
	@Override
	public CategoryDto createCategory(CategoryDto categoryDto) {
		//HERE WE HAVE TO ADD CATEGORY BUT WE HAVE CATEGORYDTO
		//THEREFORE USE MODELMAPPER  TO CONVERT
		
	  Category cat =this.modelMapper.map(categoryDto, Category.class);
	  
		Category addedCat = this.categoryRepo.save(cat);
		
		return this.modelMapper.map(addedCat, CategoryDto.class);
	}

	@Override
	public CategoryDto updateCategory(CategoryDto categoryDto, Integer categoryId) {
		Category cat = this.categoryRepo.findById(categoryId).orElseThrow(() -> new ResourceNotFoundException("Category","CategoryIy",categoryId));
		
		cat.setCategoryTitle(categoryDto.getCategoryTitle());
		
		cat.setCategoryDiscription(categoryDto.getCategoryDescription());
		
		Category updateCat = this.categoryRepo.save(cat);
		
		return this.modelMapper.map(updateCat, CategoryDto.class);
	}

	@Override
	public void deleteCategory(Integer categoryId) {
		
		Category cat = this.categoryRepo.findById(categoryId).orElseThrow(() -> new ResourceNotFoundException("Caterory","CategoryId",categoryId));
		
		
		 this.categoryRepo.delete(cat);;
	}

	@Override
	public CategoryDto getCategory(Integer categoryId) {
		 
		Category cat = this.categoryRepo.findById(categoryId).orElseThrow(() -> new ResourceNotFoundException("Caterory","CategoryId",categoryId));
		return this.modelMapper.map(cat, CategoryDto.class);
	}

	@Override
	public List<CategoryDto> getCategories() {
		List<Category> getAllCategories = this.categoryRepo.findAll();
		
	     List<CategoryDto> catDtos = getAllCategories.stream().map((cat)->this.modelMapper.map(getAllCategories, CategoryDto.class)).collect(Collectors.toList());
		return catDtos;
	}

}
