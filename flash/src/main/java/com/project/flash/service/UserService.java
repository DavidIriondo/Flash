package com.project.flash.service;

import java.util.List;

import com.project.flash.entities.User;
import com.project.flash.forms.UserRegisterForm;

public interface UserService {
  
  List<User> getAllUsers();

  User getUserById(Long id);

  User getUserByEmail(String email);

  User createUser(User user);

  User createUserByForm(UserRegisterForm form);

  User updateUser(Long id, User user);

  User removeUser(Long id);
}
