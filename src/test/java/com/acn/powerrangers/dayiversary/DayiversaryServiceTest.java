package com.acn.powerrangers.dayiversary;

import static org.junit.Assert.*;

import java.time.LocalDate;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.acn.powerrangers.dayiversary.dtos.Dayiversary;

public class DayiversaryServiceTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void calculateDayiversaryTest() {
		DayiversaryService dayiversaryService = new DayiversaryService();
		LocalDate birthDate = LocalDate.now().minusDays(1000);//LocalDate.of(1950, 4, 2);
		Dayiversary dayiversary = new Dayiversary();
		//dayiversary.setDaysLivingOnEarth();
		assertEquals(1000L , (long) dayiversaryService.calculate(birthDate).getDaysLivingOnEarth());
	}

}
