package com.thinkxfactor.zomatoplus.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.thinkxfactor.zomatoplus.models.User;
import com.thinkxfactor.zomatoplus.repo.UserRepository;

import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserRepository userRepo;

	@PostMapping("/create")
	public User userRegistration(@RequestBody User user) {
		userRepo.saveAndFlush(user);
		return user;
	}
	
	@PostMapping("/login")
	public User userLogin(@RequestBody User user1) {
		User user=userRepo.findByUsernameAndPassword(user1.getUsername(),user1.getPassword());
			return user;
			
	}
	
	@GetMapping("/all")
	public List<User> getAll(){
		return userRepo.findAll();
		
	}
	
}


