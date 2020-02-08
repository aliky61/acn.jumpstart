package com.acn.powerrangers.dayiversary.controller;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.acn.powerrangers.dayiversary.Zodiac;
import com.acn.powerrangers.dayiversary.dtos.DayiversaryDTO;
import com.acn.powerrangers.dayiversary.dtos.UserDTO;
import com.acn.powerrangers.dayiversary.services.DayiversaryService;
import com.acn.powerrangers.dayiversary.services.UserService;
import com.acn.powerrangers.dayiversary.services.ZodiacService;

@RestController
public class ZodiacController {
	@Autowired
	UserService userService;
	@Autowired
	DayiversaryService dayiversaryService;
	@Autowired
	ZodiacService zodiacService;
	
	@GetMapping("/users/{id}/zodiac")
	public Zodiac calculateZodiac(@PathVariable("id") Long id) {
		UserDTO userById = userService.readUserById(id);
		DayiversaryDTO userDayiversary = dayiversaryService.calculate(userById.getBirthDate());
		LocalDate specificDayiversary = userDayiversary.getNextDayiversary();
		return zodiacService.zodiacByDate(specificDayiversary);
		//return zodiacService.zodiacByDate(userById.getBirthDate());
	}
	
}
