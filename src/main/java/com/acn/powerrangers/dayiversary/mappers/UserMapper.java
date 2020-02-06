package com.acn.powerrangers.dayiversary.mappers;

import java.util.List;

import org.mapstruct.Mapper;

import com.acn.powerrangers.dayiversary.dtos.UserDTO;
import com.acn.powerrangers.dayiversary.models.User;

@Mapper(componentModel = "spring")
public interface UserMapper {

	UserDTO userToUserDto(User user);

	User userDtoToUser(UserDTO user);

	List<UserDTO> userListToUserDtoList(Iterable<User> users);

}
