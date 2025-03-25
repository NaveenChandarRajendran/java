package com.restapi.learn_springboot_api.user;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserResource {
	
	private UserDaoService service;
	
	private UserResource(UserDaoService service) {
		this.service = service;
	}

	@GetMapping("/users")
	private List<User> retriveAll(){
		return service.findAll();
	}
	
	@GetMapping("/users/{id}")
	private User retriveById(@PathVariable int id){
		return service.findOne(id);
	}
	
	@PostMapping("/users")
	private void createUser(@RequestBody User user){
		service.save(user);
	}
}
