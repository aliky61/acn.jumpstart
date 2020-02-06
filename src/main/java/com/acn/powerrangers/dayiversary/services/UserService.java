package com.acn.powerrangers.dayiversary.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.acn.powerrangers.dayiversary.dtos.UserDTO;
import com.acn.powerrangers.dayiversary.mappers.UserMapper;
import com.acn.powerrangers.dayiversary.models.User;
import com.acn.powerrangers.dayiversary.repositories.UserRepository;

@Service // das ist ein stereotyp

public class UserService {

	private List<User> userList = new ArrayList<>();

	UserRepository userRepository;
	UserMapper userMapper;

	@Autowired
	public UserService(UserRepository userRepository, UserMapper userMapper) {
		this.userRepository = userRepository;
		this.userMapper = userMapper;
	}

	public Iterable<UserDTO> getUserList() {
		// return userList;
		return userMapper.userListToUserDtoList(userRepository.findAll());
	}

	public void deleteUser(Long id) {
		// userList.removeIf(x -> x.getId().equals(id));
		userRepository.deleteById(id);
	}

	public UserDTO readUserById(Long id) {
		// return userList.stream().filter(x -> x.getId().equals(id)).findFirst().get();
		/*
		 * hier lesen wir die ID variable aus, sie wird erst von den dingen gefiltert
		 * via stream, dann wird die erste genommen
		 */
		return userMapper.userToUserDto(userRepository.findById(id).get());
	}

	public UserDTO add(UserDTO userDto) {
		
		User user = userMapper.userDtoToUser(userDto);
		userRepository.save(user);
		
		return userMapper.userToUserDto(user);
	}

	
	
}
