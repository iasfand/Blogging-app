package com.spring.bloggingpatform.controller;
import java.util.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.bloggingpatform.model.Blogs;
import com.spring.bloggingpatform.model.User;
import com.spring.bloggingpatform.model.user_registration;
import com.spring.bloggingpatform.service.BlogServices;

import jakarta.websocket.server.PathParam;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class MainController {

	@Autowired
	BlogServices blogServices;
	
	
	@GetMapping("/test")
	public String testMsg()
	{
		return "Hello world";
	}
	
	
	@GetMapping("/allblogs")
	@ResponseBody
	public List<Blogs> allBlogs()
	{
		return blogServices.showAllBlogs();
	}
	
	
	@GetMapping("/blog")
	@ResponseBody
	public Optional<Blogs> oneBlogs()
	{
		return blogServices.BlogsByItem();
	}
	
	
	@PostMapping("/save")
	@ResponseBody
	public String saveBlogs(@RequestBody Blogs blogs)
	{
		return blogServices.saveBlog(blogs);
	}


	@GetMapping("/show/{id}")
	@ResponseBody
	public Blogs getBlogs(@PathVariable("id") String id)
	{
		System.out.println(id);
		return blogServices.getById(id);
	}

	
	@GetMapping("/delete/{id}")
	@ResponseBody
	public String deleteBlogs(@PathVariable("id") String id)
	{
		return blogServices.deleteById(id);
	}

	
	@PostMapping("/update")
	public Optional<Blogs> updateBlogs(@RequestBody Blogs blogs)
	{
		return blogServices.updateBlogs(blogs.getId(),blogs);
	}//updateBlogs
	
	@PostMapping("/saveUser")
	public @ResponseBody ResponseEntity<Object> saveUser(@RequestBody user_registration usr_reg)
	{
		blogServices.userRegister(usr_reg);
		//return "Success";
		Map<String, String> data = new HashMap<>();
        data.put("response", "Success");

	    return new ResponseEntity<>(data, HttpStatus.OK);
	}//updateBlogs
	
	@PostMapping("/validate")
	public @ResponseBody Optional<user_registration> validateUser(@RequestBody User user)
	{
		return blogServices.validateUser(user);

		
	}
	
	
	@GetMapping("/test")
	public String sample()
	{
		return "Sample test code";

		
	}
}
