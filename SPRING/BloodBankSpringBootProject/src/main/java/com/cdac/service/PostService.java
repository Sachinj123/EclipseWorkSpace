package com.cdac.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cdac.entity.Post;
import com.cdac.repository.PostRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class PostService {

	@Autowired
	private PostRepository postRepository;
	
	public void savePost(Post post)
	{
		postRepository.save(post);
	}
	
	public Post fetchPost(int postId)
	{
		return postRepository.findById(postId).get();
	}
	
	public void deletePost(int postId)
	{
		postRepository.deleteById(postId);
	}
}
