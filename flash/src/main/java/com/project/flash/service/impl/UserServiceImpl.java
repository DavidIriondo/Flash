package com.project.flash.service.impl;

import java.util.List;

import com.project.flash.entities.User;
import com.project.flash.forms.UserRegisterForm;
import com.project.flash.repositories.UserRepository;
import com.project.flash.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

  @Autowired
	private BCryptPasswordEncoder encoder;

  @Autowired
  private UserRepository userRepository;

  @Override
  public List<User> getAllUsers() {
    return userRepository.findAll();
  }

  @Override
  public User getUserById(Long id) {
    return userRepository.findById(id).get();
  }

  @Override
  public User getUserByEmail(String email) {
    return userRepository.findByEmail(email);
  }

  @Override
  public User createUser(User user) {
    //Encrypting password
		user.setPassword(encoder.encode(user.getPassword()));
		//Saving new user
		userRepository.save(user);
		userRepository.flush();

    return user;
  }

  @Override
  public User createUserByForm(UserRegisterForm form) {
   
    User user = new User();

    user.setEmail(form.getEmail());
    user.setPassword(encoder.encode(form.getPassword()));
    user.setName(form.getName());
    user.setSurname(form.getSurname());

    userRepository.saveAndFlush(user);

    return user;
  }

  @Override
  public User updateUser(Long id, User user) {
    return null;
  }

  @Override
  public User removeUser(Long id) {
    User usr = userRepository.findById(id).get();
    userRepository.deleteById(id);

    return usr;
  }
  

  
}
