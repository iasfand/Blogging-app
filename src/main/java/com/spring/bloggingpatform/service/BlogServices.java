package com.spring.bloggingpatform.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.bloggingpatform.model.Blogs;
import com.spring.bloggingpatform.repository.BlogRepository;

@Service
public class BlogServices {

	@Autowired
	BlogRepository blogRepository;
	

	
	public List<Blogs> showAllBlogs()
	{
		blogRepository.findAll().forEach(item -> System.out.println(item));
	 return blogRepository.findAll();
		
		
	//	blogRepo.findAll().forEach(item -> new blog(item));
	}
	
	
	
	public Optional<Blogs> BlogsByItem()
	{
		//blogRepository.findAll().forEach(item -> System.out.println(item));
	 System.out.println(blogRepository.findById("670a77c6c6e63f0de12f5b18"));
	 return blogRepository.findById("670a77c6c6e63f0de12f5b18");
		
		
	//	blogRepo.findAll().forEach(item -> new blog(item));
	}
	
	
	public String saveBlog(Blogs bl) 
	{
	
	 blogRepository.save(bl);
	 return "save";	
		
	//	blogRepo.findAll().forEach(item -> new blog(item));
	}
	
	
	public Blogs getById(String id) 
	{
	
	 return blogRepository.findBlogsById(id);
	 
		
	//	blogRepo.findAll().forEach(item -> new blog(item));
	}
	
	
	public String deleteById(String id) 
	{
	
	 blogRepository.deleteById(id);
	 return "success";
		
	//	blogRepo.findAll().forEach(item -> new blog(item));
	}
}
