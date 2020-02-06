package com.acn.powerrangers.dayiversary.aspects;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;

import com.acn.powerrangers.dayiversary.services.UserCounterService;

@Aspect
@Component
public class UserCounterAspect {

	@Autowired
	UserCounterService userCounterService;
	
	@After("execution(* com.acn.powerrangers.dayiversary.controller.UserController.readUserById(..)) && args(id)")
	public void logAccessForUserId(Long id) {
		userCounterService.logAccessForUserId(id, "blubb");
	}

}
