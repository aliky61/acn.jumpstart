package com.acn.powerrangers.dayiversary.models;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Data;

@Data
@Entity
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String firstName;
	private String lastName;
	private LocalDate birthDate;

	@OneToMany(mappedBy = "user")
	private List<UserCounter> userCounterList = new ArrayList<>();
	
	public void addUserCounter(UserCounter userCounter) {
		this.userCounterList.add(userCounter);
	}

}
