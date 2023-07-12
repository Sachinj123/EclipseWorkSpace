package com.cdac.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.cdac.entity.Post;

public interface PostRepository extends CrudRepository<Post, Integer>{
	
	public List<Post> findBypostCategory (String postCategory);
	
	public List<Post> findBypostId (int postId);

}
