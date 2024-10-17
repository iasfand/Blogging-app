package com.spring.bloggingpatform;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.spring.bloggingpatform.repository.BlogRepository;

@EnableMongoRepositories
@SpringBootApplication
public class BloggingpatformApplication{

  //  @Autowired
  //  BlogRepository mongoRepository;
    
	public static void main(String[] args) {
		SpringApplication.run(BloggingpatformApplication.class, args);
	}

}
