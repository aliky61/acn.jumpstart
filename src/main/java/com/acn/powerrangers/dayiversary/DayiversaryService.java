package com.acn.powerrangers.dayiversary;

import java.time.LocalDate;

import org.springframework.stereotype.Service;

import com.acn.powerrangers.dayiversary.dtos.Dayiversary;

import static java.time.temporal.ChronoUnit.DAYS;

@Service
public class DayiversaryService {

	public Dayiversary calculate(LocalDate birthDate) {
		
		long daysOnEarth = DAYS.between(birthDate, LocalDate.now());
		long daysToNextDayiversary = 1000 - (daysOnEarth % 1000); 		
		LocalDate nextDayiversary = LocalDate.now().plusDays(daysToNextDayiversary);
		
		Dayiversary dayiversary = new Dayiversary();
		dayiversary.setDaysLivingOnEarth(daysOnEarth);
		dayiversary.setNextDayiversary(nextDayiversary);		
		dayiversary.setDaysLeftToNextDayiversary(daysToNextDayiversary);
		
		return dayiversary;
	}

}
