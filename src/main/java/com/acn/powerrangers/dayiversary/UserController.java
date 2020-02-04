package com.acn.powerrangers.dayiversary;

import java.util.ArrayList;
import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.acn.powerrangers.dayiversary.models.User;

@RestController
public class UserController {
	
	private UserService userService;
	private DayiversaryService dayiversaryService;

	@Autowired
	public UserController(UserService userService, DayiversaryService dayiversaryService) {
		this.userService = userService;
		this.dayiversaryService = dayiversaryService;
	}

	@GetMapping("/users")
	//@RequestMapping(method = RequestMethod.GET, path = "/users") Unnötig!
	public Iterable<User> readUsers() {
		return userService.getUserList();
	}
	//@ResponseBody //das ist equivalent zu @RestController über der class
//	@GetMapping("/users/{id}/dayiversary") das ist nutzlos hier
	public void dayiversary() {
		
	}
	
	@PostMapping("/users")
	public User createUser(@RequestBody User user){
		//user.setId(userService.getUserList().size()+1L);
		userService.add(user);
		return user;
	}
	
	@DeleteMapping("/users/{id}")
	public ResponseEntity<Object> deleteUser(@PathParam("id") Long id){
		userService.deleteUser(id);
		return ResponseEntity.noContent().build();
	}
	
	
	
	
	/*
	@GetMapping("/users/{id}")
	//@RequestMapping(method = RequestMethod.GET, path = "/users") Lange art und weise
	public List<User> readUsersById(User user) {
		return null;
	}
	*/
	
	
	
	/*
	@PutMapping("/users/{id}")
	public User putUser(@RequestBody User user){
		return null;
	}
	*/
	
	
}
