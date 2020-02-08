package com.acn.powerrangers.dayiversary.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.acn.powerrangers.dayiversary.dtos.DayiversaryDTO;
import com.acn.powerrangers.dayiversary.dtos.UserDTO;
import com.acn.powerrangers.dayiversary.services.DayiversaryService;
import com.acn.powerrangers.dayiversary.services.UserService;

//@Controller //das hier gibt html dateien zurück
@RestController
public class ThousandVersaryController {

    @Autowired //damit nehmen wir die variable von UserService
    private UserService userservice;
    @Autowired
    private DayiversaryService dayiversaryservice;

    @GetMapping("/users/{id}/dayiversary")
    public DayiversaryDTO thousandVersary(@PathVariable("id") Long id) {
        UserDTO userById = userservice.readUserById(id);
        return dayiversaryservice.calculate(userById.getBirthDate());
    }


}
