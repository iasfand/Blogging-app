package com.spring.bloggingpatform.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import com.spring.bloggingpatform.model.Blogs;
import com.spring.bloggingpatform.model.user_registration;
@Transactional
public interface UserRegistrationRepository  extends MongoRepository<user_registration, String>{

	//@Query({username:'?0',password:'?1'}")
	//@Query("{{$or:[username:'?0',email:'?0']},{password: ?1}}")
	
	//@Query("{id:'?0'}")
//	@Query("{$and:[ $or: [{username:'?0'},{email:'?0'}],{password:'?1'}]}") 
	@Query("{$and: [{$or: [{'username': '?0'},{'email': '?0'}]},{'password': '?1'}]}")
	Optional<user_registration> validateUsernameAndPassword(String username,String password);
	
}
