package com.acn.powerrangers.dayiversary;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.acn.powerrangers.dayiversary.models.User;
import com.acn.powerrangers.dayiversary.repositories.UserRepository;

@Service //das ist ein stereotyp

public class UserService {

	private List<User> userList = new ArrayList<>();

	@Autowired
	UserRepository userRepository;
	
	public Iterable<User> getUserList() {
	//	return userList;
		return userRepository.findAll();
	}
	
	public void deleteUser(Long id){
		//userList.removeIf(x -> x.getId().equals(id));
		userRepository.deleteById(id);
	}
	
	public User readUserById(Long id) {
		//return userList.stream().filter(x -> x.getId().equals(id)).findFirst().get();	
		/*hier lesen wir die ID variable aus, sie wird erst von den dingen gefiltert via stream,
		dann wird die erste genommen*/
		return userRepository.findById(id).get();
	}
	
	public User add(User user) {
		return userRepository.save(user);
	}
	
	
	
	
}
