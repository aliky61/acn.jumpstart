package com.acn.powerrangers.dayiversary.dtos;

import java.time.LocalDate;

import lombok.Data;

@Data
public class UserDTO {

	private Long id;
	private String firstName;
	private String lastName;
	private LocalDate birthDate;

}
