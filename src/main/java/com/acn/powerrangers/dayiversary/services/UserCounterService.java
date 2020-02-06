package com.acn.powerrangers.dayiversary.services;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.acn.powerrangers.dayiversary.models.User;
import com.acn.powerrangers.dayiversary.models.UserCounter;
import com.acn.powerrangers.dayiversary.repositories.UserCounterRepository;
import com.acn.powerrangers.dayiversary.repositories.UserRepository;

@Service
public class UserCounterService {

	@Autowired
	UserRepository userRepository;

	@Autowired
	UserCounterRepository userCounterRepository;

	public void logAccessForUserId(Long userId, String ip) {

		if (!userRepository.existsById(userId)) {
			System.out.println("This ID doesn't exist!");
			return;
		}

		UserCounter userCounter = new UserCounter();
		userCounter.setTimestamp(LocalDateTime.now());
		userCounter.setIp(ip);

		User user = userRepository.findById(userId).get();
		user.addUserCounter(userCounter);

		userCounter.setUser(user);

		userCounterRepository.save(userCounter);

	}

}
