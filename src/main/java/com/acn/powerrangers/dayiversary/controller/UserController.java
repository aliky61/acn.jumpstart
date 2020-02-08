package com.acn.powerrangers.dayiversary.controller;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.acn.powerrangers.dayiversary.dtos.UserDTO;
import com.acn.powerrangers.dayiversary.services.DayiversaryService;
import com.acn.powerrangers.dayiversary.services.UserService;

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
	public Iterable<UserDTO> readUsers() {
		return userService.getUserList();
	}
	//@ResponseBody //das ist equivalent zu @RestController über der class
//	@GetMapping("/users/{id}/dayiversary") das ist nutzlos hier
	public void dayiversary() {
		
	}
	
	@PostMapping("/users")
	public UserDTO createUser(@RequestBody UserDTO user){
		//user.setId(userService.getUserList().size()+1L);
		userService.add(user);
		return user;
	}
	
	@DeleteMapping("/users/{id}")
	public ResponseEntity<Object> deleteUser(@PathParam("id") Long id){
		userService.deleteUser(id);
		return ResponseEntity.noContent().build();
	}
	
	//"/users?id=4&
	@GetMapping("/users/{id}")
	//@RequestMapping(method = RequestMethod.GET, path = "/users") Lange art und weise
	public UserDTO readUserById(@PathVariable("id") Long userId) {
		return userService.readUserById(userId);
	}

	/*
	@PutMapping("/users/{id}")
	public User putUser(@RequestBody User user){
		return null;
	}
	*/
	
	
}
