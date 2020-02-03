package com.acn.powerrangers.dayiversary;

import java.time.LocalDate;

import org.springframework.stereotype.Service;

import com.acn.powerrangers.dayiversary.dtos.Dayiversary;

import static java.time.temporal.ChronoUnit.DAYS;

@Service
public class DayiversaryService {

	public Dayiversary calculate(LocalDate birthDate){
		Dayiversary dayiversary = new Dayiversary();
		dayiversary.setDaysLivingOnEarth(DAYS.between(birthDate, LocalDate.now()));
		dayiversary.setNextDayiversary(LocalDate.now().plusDays(dayiversary.getDaysLivingOnEarth() % 1000L));
		//dayiversary.setDaysLeftToNextDayiversary();
		return dayiversary;
	}

}
