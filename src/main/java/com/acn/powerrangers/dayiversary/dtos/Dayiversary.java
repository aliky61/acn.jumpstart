package com.acn.powerrangers.dayiversary.dtos;

import java.time.LocalDate;

public class Dayiversary {

	private LocalDate nextDayiversary;
	private Long daysLeftToNextDayiversary;
	private Long daysLivingOnEarth;
	
	public Dayiversary() {
	}
	
	public Dayiversary(LocalDate nextDayiversary, Long daysLeftToNextDayiversary, Long daysLivingOnEarth) {
		this.nextDayiversary = nextDayiversary;
		this.daysLeftToNextDayiversary = daysLeftToNextDayiversary;
		this.daysLivingOnEarth = daysLivingOnEarth;
	}

	public LocalDate getNextDayiversary() {
		return nextDayiversary;
	}

	public void setNextDayiversary(LocalDate nextDayiversary) {
		this.nextDayiversary = nextDayiversary;
	}

	public Long getDaysLeftToNextDayiversary() {
		return daysLeftToNextDayiversary;
	}

	public void setDaysLeftToNextDayiversary(Long daysLeftToNextDayiversary) {
		this.daysLeftToNextDayiversary = daysLeftToNextDayiversary;
	}

	public Long getDaysLivingOnEarth() {
		return daysLivingOnEarth;
	}

	public void setDaysLivingOnEarth(Long daysLivingOnEarth) {
		this.daysLivingOnEarth = daysLivingOnEarth;
	}
	
}
