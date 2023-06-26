package com.sachin.cdac.DTO;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class CategoryDto {
	
	private Integer categoryId;
	@NotBlank
	@Size(min=4)
	private String categoryTitle;
	@NotBlank
	private String categoryDescription;
	

}
