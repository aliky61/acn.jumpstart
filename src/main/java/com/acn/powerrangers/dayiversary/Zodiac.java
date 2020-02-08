package com.acn.powerrangers.dayiversary;

import java.time.LocalDate;
import java.time.Period;

public enum Zodiac {
	
	CAPICORN("1969-12-22","1970-01-20"),			//Steinbock
	AQUARIUS("1970-01-21","1970-02-19"),			//Wassermann
	PISCES("1970-02-20","1970-03-20"),			//Fische
	ARIES("1970-03-21","1970-04-20"),			//Widder
	TAURUS("1970-04-21","1970-05-20"),			//Stier
	GEMINI ("1970-05-21","1970-06-21"),			//Zwillinge
	CANCER("1970-06-20","1970-07-22"),			//Krebs
	LEO("1970-07-23", "1970-08-23"),				//Löwe
	VIRGO("1970-08-24","1970-09-23"),			//Jungfrau
	LIBRA("1970-09-24","1970-10-23"),			//Waage
	SCORPIO("1970-10-24","1970-11-22"),			//Skorpion
	SAGITTARIUS("1970-11-23","1970-12-21");		//Schütze
	
	private final LocalDate beginDate;
	private final LocalDate endDate;
	//private final Period duration;
	
	Zodiac(String beginDate, String endDate) {
		this.beginDate = LocalDate.parse(beginDate);
		this.endDate = LocalDate.parse(endDate);
		//duration = Period.between(this.beginDate, this.endDate.plusDays(1));
	}
	
	public boolean checkZodiac(LocalDate birthday) {
		LocalDate patchedBirthday;
		if (birthday.getMonthValue() == 12 && birthday.getDayOfMonth() >= 22) {
			patchedBirthday = birthday.withYear(1969);
		} else {
			patchedBirthday = birthday.withYear(1970);
		}
		
		return !(patchedBirthday.isBefore(beginDate) || patchedBirthday.isAfter(endDate));
	}
}
