package com.rest.firstRest.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rest.firstRest.model.User;
import com.rest.firstRest.repository.UserRepo;

@RestController
public class MainController {
	
	@Autowired
	UserRepo repo;
	
	@PostMapping("/adduser")
	public User addUser(@RequestBody User user) {
		repo.save(user);
		return user;
	}
	
	@GetMapping("/getuser/{id}")
	public Optional<User> getUser(@PathVariable("id") Long id) {
		return repo.findById(id);
	}
	
	@GetMapping("/getallusers")
	public List<User> getAllUsers(){
		return repo.findAll();
	}
	
	@DeleteMapping("/deleteuser/{id}")
	public String delete(@PathVariable("id")Long id) {
		repo.deleteById(id);
		return "deleted";
	}
	
	@PutMapping("/updateuser")
	public User updateUser(@RequestBody User user) {
		repo.save(user);
		return user;
	}

}
