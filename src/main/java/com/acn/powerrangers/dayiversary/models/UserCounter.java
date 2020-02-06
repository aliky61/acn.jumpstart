package com.acn.powerrangers.dayiversary.models;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.aspectj.lang.annotation.Aspect;

import lombok.Data;

@Entity
@Data
public class UserCounter {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private LocalDateTime timestamp;
	private String ip;

	@ManyToOne
	private User user;
	
}
