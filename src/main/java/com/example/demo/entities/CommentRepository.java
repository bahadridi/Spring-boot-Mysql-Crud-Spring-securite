package com.example.demo.entities;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


public interface CommentRepository extends CrudRepository<Comment, Integer> {

	
	@Query("SELECT u FROM User u where u.username= :username and u.password= :password")
	public User finduser(String username, String password );

}
