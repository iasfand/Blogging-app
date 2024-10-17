package com.spring.bloggingpatform.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.spring.bloggingpatform.model.Blogs;

public interface BlogRepository extends MongoRepository<Blogs, String>{
	 
/*	@Query("{name:'?0'}")
    GroceryItem findItemByName(String name);
    
    @Query(value="{category:'?0'}", fields="{'name' : 1, 'quantity' : 1}")
    List<GroceryItem> findAll(String category);
    
    public long count();  */
	@Query("{id:'?0'}")
    Blogs findBlogsById(String id);
	
}
