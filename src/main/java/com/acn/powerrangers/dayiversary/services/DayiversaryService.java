package com.acn.powerrangers.dayiversary.services;

import java.time.LocalDate;

import org.springframework.stereotype.Service;

import com.acn.powerrangers.dayiversary.dtos.DayiversaryDTO;

import static java.time.temporal.ChronoUnit.DAYS;

@Service
public class DayiversaryService {

	public DayiversaryDTO calculate(LocalDate birthDate) {
		
		long daysOnEarth = DAYS.between(birthDate, LocalDate.now());
		long daysToNextDayiversary = 1000 - (daysOnEarth % 1000); 		
		LocalDate nextDayiversary = LocalDate.now().plusDays(daysToNextDayiversary);
		long daysTonextTenThousandDayiversary = 10000 - (daysOnEarth % 10000);
		
		DayiversaryDTO dayiversary = new DayiversaryDTO();
		dayiversary.setDaysLivingOnEarth(daysOnEarth);
		dayiversary.setNextDayiversary(nextDayiversary);		
		dayiversary.setDaysLeftToNextDayiversary(daysToNextDayiversary);
		dayiversary.setDaysLeftToNextTenThousandDayiversary(daysTonextTenThousandDayiversary);

		return dayiversary;
	}

}
