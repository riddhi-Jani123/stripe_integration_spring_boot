package com.inexture.stripeintegration.service;

import com.inexture.stripeintegration.dto.UserDTO;

import java.util.List;

public interface UserService {

    UserDTO getByUserId(long id);
    List<UserDTO> getAllUser();
    UserDTO addUser(UserDTO userDTO);
    UserDTO updateUser(UserDTO userDTO, long id);
    void deleteUser(long id);
}
