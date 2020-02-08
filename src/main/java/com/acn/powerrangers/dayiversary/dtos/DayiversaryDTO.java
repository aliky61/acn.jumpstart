package com.acn.powerrangers.dayiversary.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DayiversaryDTO {

    private LocalDate nextDayiversary;
    private Long daysLeftToNextDayiversary;
    private Long daysLivingOnEarth;
    private Long daysLeftToNextTenThousandDayiversary;

}
