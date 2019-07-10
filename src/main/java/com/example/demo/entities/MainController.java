package com.example.demo.entities;


import java.util.Date;
import java.util.Optional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.sql.ordering.antlr.Factory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.service.postService;
import com.example.demo.entities.service.userService;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
@Controller
@CrossOrigin("*")
@RestController

public class MainController {

	@Autowired
	private CommentRepository commentrepository;
	@Autowired
	private userService userservice;
	@Autowired

	private UserRepository userRepository;
@Autowired
private CommentRepository commentsRepository;
	@GetMapping("/add")
	public void adduser () {
		User n = new User();
		n.setUsername("Dali");
		n.setPassword("0010");
		n.setEmail("DAli@dali.com");

		n.setBirthday(new Date());
		
		userRepository.save(n);
		
	}
	@GetMapping("/addcmt")
	public void addcmt() {
		Comment c = new Comment();
		c.setCmtr("loooooooooool");
		commentsRepository.save(c);
	}
	
	@GetMapping("/getuser")
	public Iterable<User>  getuser() {
		
	return userRepository.findAll();
	}
	
	//find all user 
	@GetMapping("/Findall")
	public Iterable<User> findallusers(){
		
		return userservice.findallusers();
				
	}
	
	//find user by id
	@PostMapping("/findbyid")
	public @ResponseBody Optional<User> findbyid(@RequestParam Integer id){
	return	userservice.getuserbyid(id);
		
	}
	
	//remove user by id
	@PostMapping("/remove")
	public @ResponseBody String remove(@RequestParam Integer id){
		userservice.removeUser(id);
		return "Ok";
	}
	
	static class formlogin {
		public String username;
		public String password;
		public formlogin() {
			super();
			// TODO Auto-generated constructor stub
		}
		
	}
	
//try 
	@PostMapping("/log")
		public @ResponseBody User log(@RequestBody formlogin 	FL){
			return commentrepository.finduser(FL.username.toString(), FL.password.toString());	
		
	}
}
