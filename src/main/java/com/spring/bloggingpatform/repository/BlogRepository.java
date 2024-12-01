package com.spring.bloggingpatform.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import com.spring.bloggingpatform.model.Blogs;

@Transactional
public interface BlogRepository extends MongoRepository<Blogs, String>{
	 
/*	@Query("{name:'?0'}")
    GroceryItem findItemByName(String name);
    
    @Query(value="{category:'?0'}", fields="{'name' : 1, 'quantity' : 1}")
    List<GroceryItem> findAll(String category);
    
    public long count();  */
	@Query("{id:'?0'}")
    Blogs findBlogsById(String id);

	
	/*@Query("update Blogs b set b.date = ?1, b.name = ?2 "
			+ "b.content = ?3, b.tags = ?4 "
			+ "b.title = ?5 where b.id = ?6")
	void updatePost(String bdate, String bname,String bcontent,
			String btags,String btitle,String bid);  */
}