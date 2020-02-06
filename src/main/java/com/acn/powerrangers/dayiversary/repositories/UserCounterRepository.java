package com.acn.powerrangers.dayiversary.repositories;

import org.springframework.data.repository.CrudRepository;

import com.acn.powerrangers.dayiversary.models.UserCounter;

public interface UserCounterRepository extends CrudRepository<UserCounter, Long> {

}
