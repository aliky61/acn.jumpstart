package com.acn.powerrangers.dayiversary.controller;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.acn.powerrangers.dayiversary.Zodiac;
import com.acn.powerrangers.dayiversary.dtos.Dayiversary;
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
	
	@GetMapping("/users/{id}/astrological")
	public Zodiac astrological(@PathVariable("id") Long id) {
		UserDTO userById = userService.readUserById(id);
		Dayiversary userDayiversary = dayiversaryService.calculate(userById.getBirthDate());
		LocalDate specificDayiversary = userDayiversary.getNextDayiversary();
		return zodiacService.zodiacByDate(specificDayiversary);
	}	
	
	/*
	 * if ((specificDayiversary.getMonthValue() == 12 && specificDayiversary.getDayOfMonth() >= 22)
				|| (specificDayiversary.getMonthValue() == 1 && specificDayiversary.getDayOfMonth() <= 20)) {
			return Zodiac.CAPICORN;
		} else if ((specificDayiversary.getMonthValue() == 1 && specificDayiversary.getDayOfMonth() >= 21)
				|| (specificDayiversary.getMonthValue() == 2 && specificDayiversary.getDayOfMonth() <= 19)) {
			return Zodiac.AQUARIUS;
		} else if ((specificDayiversary.getMonthValue() == 2 && specificDayiversary.getDayOfMonth() >= 20)
				|| (specificDayiversary.getMonthValue() == 3 && specificDayiversary.getDayOfMonth() <= 20)) {
			return Zodiac.PISCES;
		} else if ((specificDayiversary.getMonthValue() == 3 && specificDayiversary.getDayOfMonth() >= 21)
				|| (specificDayiversary.getMonthValue() == 4 && specificDayiversary.getDayOfMonth() <= 20)) {
			return Zodiac.ARIES;
		} else if ((specificDayiversary.getMonthValue() == 4 && specificDayiversary.getDayOfMonth() >= 21)
				|| (specificDayiversary.getMonthValue() == 5 && specificDayiversary.getDayOfMonth() <= 20)) {
			return Zodiac.TAURUS;
		} else if ((specificDayiversary.getMonthValue() == 5 && specificDayiversary.getDayOfMonth() >= 21)
				|| (specificDayiversary.getMonthValue() == 6 && specificDayiversary.getDayOfMonth() <= 20)) {
			return Zodiac.GEMINI;
		} else if ((specificDayiversary.getMonthValue() == 6 && specificDayiversary.getDayOfMonth() >= 22)
				|| (specificDayiversary.getMonthValue() == 7 && specificDayiversary.getDayOfMonth() <= 22)) {
			return Zodiac.CANCER;
		} else if ((specificDayiversary.getMonthValue() == 7 && specificDayiversary.getDayOfMonth() >= 23)
				|| (specificDayiversary.getMonthValue() == 8 && specificDayiversary.getDayOfMonth() <= 23)) {
			return Zodiac.LEO;
		} else if ((specificDayiversary.getMonthValue() == 8 && specificDayiversary.getDayOfMonth() >= 24)
				|| (specificDayiversary.getMonthValue() == 9 && specificDayiversary.getDayOfMonth() <= 23)) {
			return Zodiac.VIRGO;
		} else if ((specificDayiversary.getMonthValue() == 9 && specificDayiversary.getDayOfMonth() >= 24)
				|| (specificDayiversary.getMonthValue() == 10 && specificDayiversary.getDayOfMonth() <= 23)) {
			return Zodiac.LIBRA;
		} else if ((specificDayiversary.getMonthValue() == 10 && specificDayiversary.getDayOfMonth() >= 24)
				|| (specificDayiversary.getMonthValue() == 11 && specificDayiversary.getDayOfMonth() <= 22)) {
			return Zodiac.SCORPIO;
		} else if ((specificDayiversary.getMonthValue() == 11 && specificDayiversary.getDayOfMonth() >= 23)
				|| (specificDayiversary.getMonthValue() == 12 && specificDayiversary.getDayOfMonth() <= 21)) {
			return Zodiac.SAGITTARIUS;
		} else {
			return Zodiac.NULLO;
		}*/
}
