package com.sachin.cdac.Controller;

import java.beans.BeanProperty;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
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
import com.sachin.cdac.DTO.CategoryDto;
import com.sachin.cdac.Service.CategoryService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/categories")

public class CategoryController {
	
	//STEP1 - CREATE "CATEGORY" CLASS 
	
	//STEP2 - CREATE "CATEGORYDTO" CLASS
	
	//STEP3 - CREATE "CATEGORYREPO" INTERFACE
	
	//STEP4 - CREATE "CATEGORYSERVICE" INTERFACE
	         //HERE WE DECLARED ALL THE METHODS WHICH WE WANT TO IMPLEMENT
	
	//STEP5 - CREATE "CATEGORY SERVICE IMPL" HERE WE IMPLEMENT ALL THE METHODS
	
	//STEP6 - CREATE "CATEGORY CONTROLLER" THE WE CALL ALL THE METHODS HERE FROM CATEGORYSERVICEIMPL.
	
	
	@Autowired
	
	private CategoryService categoryService;
	
	//CREATE
	@PostMapping("/")
	public ResponseEntity<CategoryDto> createCategory (@Valid @RequestBody CategoryDto categoryDto)
	{
		CategoryDto createCategory = this.categoryService.createCategory(categoryDto);
		
		return new ResponseEntity<CategoryDto>(createCategory,HttpStatus.CREATED);
	}
	
	//UPDATE
	@PutMapping("/{catId}")
	public ResponseEntity<CategoryDto> updateCategory (@Valid @RequestBody CategoryDto categoryId, @PathVariable Integer catId)
	{
		
		CategoryDto updateCategory = this.categoryService.updateCategory(categoryId, catId );
		
		return new ResponseEntity<CategoryDto>(updateCategory,HttpStatus.OK);
		
		
	}
	
	//DELETE
	@DeleteMapping("/{catId}")
	public ResponseEntity<ApiResponce> deleteCategory ( @PathVariable Integer catId)
	{
		
		 this.categoryService.deleteCategory( catId );
		
		return new ResponseEntity<ApiResponce>(new ApiResponce("Category is Deleted Succesfully!!!", true),HttpStatus.OK);
		
		
	}
	
	//GET
	@GetMapping("/{catId}")
	public ResponseEntity<CategoryDto> getCategory(@PathVariable Integer catId)
	{
		CategoryDto categoryDto = this.categoryService.getCategory(catId);
		
		return new ResponseEntity<CategoryDto>(categoryDto,HttpStatus.OK);
	}
	
	
	//GET ALL
	@GetMapping("/")
	public ResponseEntity<List<CategoryDto>> getAllCategories()
	{
		List<CategoryDto> categories =   this.categoryService.getCategories();
		return  ResponseEntity.ok(categories);
	}

}
