package com.acn.powerrangers.dayiversary.dtos;

import lombok.*;

import java.time.LocalDate;

@Data
public class UserDTO {

    private Long id;
    private String firstName;
    private String lastName;
    private LocalDate birthDate;

}
