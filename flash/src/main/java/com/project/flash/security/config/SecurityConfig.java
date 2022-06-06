package com.project.flash.security.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

  @Override
  protected void configure(HttpSecurity http) throws Exception {
    http
    .authorizeRequests()
      .antMatchers("/css/**", "/js/**", "/img/**").permitAll() //STATIC RESOURCES
      .antMatchers("/", "/flash/v1/home").permitAll()
      //.antMatchers("/flash/v1/template").permitAll()
      //.antMatchers("/flash/v1/about-us").permitAll()
      //.antMatchers("/flash/v1/project").permitAll()
      .anyRequest().authenticated()
      .and()
    .formLogin()
      .loginPage("/flash/v1/home") // MY DEFAULT LOGIN PAGE
      .permitAll()
      .and()
    .logout() //THE DEFAULT LOGOUT CONTROLLER, JUST CALL "/logout" URL AND WILL LOGOUT
      .permitAll();
  }
 

  @Bean
  @Override
  protected UserDetailsService userDetailsService() {
    UserDetails user =
    User.withDefaultPasswordEncoder()
     .username("user")
     .password("password")
     .roles("USER")
     .build();

     System.out.println("HEY YOU ARE AUTHENTICATED");

    return new InMemoryUserDetailsManager(user);
  }
}
