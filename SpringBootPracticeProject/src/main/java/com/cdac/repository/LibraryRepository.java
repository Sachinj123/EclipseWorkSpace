package com.cdac.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.cdac.entity.Library;

public interface LibraryRepository extends CrudRepository<Library, Integer>
{
	public List<Library> findByLibraryName(String library);
}
