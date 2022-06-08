package com.project.flash.security.utils;

import java.util.ArrayList;
import java.util.List;

import com.project.flash.entities.User;
import com.project.flash.repositories.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

@Service
public class CustomUserDetails implements UserDetailsService{

  @Autowired
  private UserRepository userRepository;

  @Override
  public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
    
    User user = userRepository.findByEmail(email);
		
		//Roles, here we need to retrieve the user´roles from data base
		List<GrantedAuthority> roles = new ArrayList<GrantedAuthority>();
		
		//Assing roles
		roles.add(new SimpleGrantedAuthority("ROLE_USER"));

		//System.out.println(roles);
		
		UserDetails userDetails =  new org.springframework.security.core.userdetails.User(user.getEmail(), user.getPassword(), roles);
		
		return userDetails;
  }
  
}
