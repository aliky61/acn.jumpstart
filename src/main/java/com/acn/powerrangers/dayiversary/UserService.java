package com.acn.powerrangers.dayiversary;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.acn.powerrangers.dayiversary.models.User;

@Service
public class UserService {

	private List<User> userList = new ArrayList<>();

	public List<User> getUserList() {
		return userList;
	}
	
	public void deleteUser(Long id){
		userList.removeIf(x -> x.getId().equals(id));
	}
	
}
