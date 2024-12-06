package com.spring.bloggingpatform.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.bloggingpatform.model.Blogs;
import com.spring.bloggingpatform.model.User;
import com.spring.bloggingpatform.model.user_registration;
import com.spring.bloggingpatform.repository.BlogRepository;
import com.spring.bloggingpatform.repository.UserRegistrationRepository;

@Service
public class BlogServices {

	@Autowired
	BlogRepository blogRepository;
	
	@Autowired
	UserRegistrationRepository userRegistrationRepo;
	
	public List<Blogs> showAllBlogs()
	{
	//	blogRepository.findAll().forEach(item -> System.out.println(item));
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
	
	
	
/*	public String updateBlogs(Blogs bl)
	{
	//	blogRepository.findAll().forEach(item -> System.out.println(item));
	//	(String bdate, String bname,String bcontent,
//				String btags,String btitle,String bid);
	//	Blogs bli=blogRepository.findBlogsById(bl.getId());
	 blogRepository.updatePost(bl.getDate(),bl.getName(),bl.getContent(),
			 bl.getTags(),bl.getTags(),bl.getId());	
		return "Success";
	//	blogRepo.findAll().forEach(item -> new blog(item));
	}  */
	
	
    public Optional<Blogs> updateBlogs(String id, Blogs blog) {
        if(!blogRepository.existsById(id)) {
            return Optional.empty();
        }
        
        blog.setId(id);
        return Optional.of(blogRepository.save(blog));
    }
    
    
    public void userRegister(user_registration usr) {
    	userRegistrationRepo.save(usr);    
    }
    
    public Optional<user_registration> validateUser(User user) {
    	return userRegistrationRepo.validateUsernameAndPassword(user.getUsername(),user.getPassword());
    }
}
