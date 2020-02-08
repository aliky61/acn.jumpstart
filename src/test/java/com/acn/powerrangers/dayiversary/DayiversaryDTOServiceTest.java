package com.acn.powerrangers.dayiversary;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import com.acn.powerrangers.dayiversary.dtos.DayiversaryDTO;
import com.acn.powerrangers.dayiversary.services.DayiversaryService;

public class DayiversaryDTOServiceTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	//@Ignore
	@Test
	public void calculateDayiversaryTest() {
		DayiversaryService dayiversaryService = new DayiversaryService();
		LocalDate birthDate = LocalDate.now().minusDays(1000);//LocalDate.of(1950, 4, 2);
		DayiversaryDTO dayiversary = new DayiversaryDTO();
		//dayiversary.setDaysLivingOnEarth();
		assertEquals(1000L , (long) dayiversaryService.calculate(birthDate).getDaysLivingOnEarth());
	}

}
