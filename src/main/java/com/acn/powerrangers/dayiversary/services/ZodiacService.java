package com.acn.powerrangers.dayiversary.services;

import java.time.LocalDate;

import org.springframework.stereotype.Service;

import com.acn.powerrangers.dayiversary.Zodiac;

@Service
public class ZodiacService {
	public Zodiac zodiacByDate(LocalDate birthday) {
		Zodiac[] zodiacs = Zodiac.values();
		for (Zodiac zodiac : zodiacs) {
			if (zodiac.checkZodiac(birthday)) {
				return zodiac;
			}
		}
		throw new RuntimeException("Zodiac not found!");
	}
}
