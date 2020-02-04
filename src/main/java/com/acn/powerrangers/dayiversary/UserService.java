package com.acn.powerrangers.dayiversary;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.acn.powerrangers.dayiversary.models.User;

@Service //das ist ein stereotyp
public class UserService {

	private List<User> userList = new ArrayList<>();

	public List<User> getUserList() {
		return userList;
	}
	
	public void deleteUser(Long id){
		userList.removeIf(x -> x.getId().equals(id));
	}
	
	public User readUserById(Long id) {
		return userList.stream().filter(x -> x.getId().equals(id)).findFirst().get();	
		/*hier lesen wir die ID variable aus, sie wird erst von den dingen gefiltert via stream,
		dann wird die erste genommen*/
	}
	
	
	
	
}
