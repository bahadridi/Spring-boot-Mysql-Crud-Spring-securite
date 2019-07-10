package com.example.demo.entities.service;

import java.util.List;
import java.util.Optional;

import org.omg.CORBA.UserException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.example.demo.entities.User;
import com.example.demo.entities.UserRepository;

@Service("userService")
public class serviceImple implements userService  {

	
	@Autowired
	private UserRepository userRepository;
	
	@Override
	public List<User> findallusers() {
		
		return (List<User>) userRepository.findAll();
	}

	@Override
	public Optional<User> getuserbyid(Integer id) {
		// TODO Auto-generated method stub
		return userRepository.findById(id);
	}
	
	@Override
	public void removeUser(Integer id) {
		// TODO Auto-generated method stub
		 userRepository.deleteById(id);
	}

	@Override
	public Optional<User> loguser() {
		// TODO Auto-generated method stub
		return null;
	}





	
}
