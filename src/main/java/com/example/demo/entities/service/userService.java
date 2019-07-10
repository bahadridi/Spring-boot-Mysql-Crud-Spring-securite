package com.example.demo.entities.service;


import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.entities.User;

public interface userService {

	public List<User> findallusers ();
	public Optional<User> getuserbyid(Integer id);
	public void removeUser(Integer id);
	public Optional<User> loguser();

}
