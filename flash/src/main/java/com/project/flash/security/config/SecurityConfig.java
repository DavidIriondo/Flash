package com.project.flash.security.config;

import com.project.flash.security.utils.CustomUserDetails;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

  @Autowired
  private CustomUserDetails customUserDetails;

  @Autowired
	@Lazy
	private BCryptPasswordEncoder bCrypt;
	
	
	@Bean
	public BCryptPasswordEncoder passwordEncoder() {
		BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
		return bCryptPasswordEncoder;
	} 

  @Override
  protected void configure(HttpSecurity http) throws Exception {
    http
    .authorizeRequests()
      .antMatchers("/css/**", "/js/**", "/img/**").permitAll() //STATIC RESOURCES
      .antMatchers("/", "/flash/v1/home").permitAll()
      //.antMatchers("/flash/v1/template").permitAll()
      //.antMatchers("/flash/v1/about-us").permitAll()
      //.antMatchers("/flash/v1/project").permitAll()
      .antMatchers("/flash/v1/home/register-user").permitAll()
      .anyRequest().authenticated()
      .and()
    .formLogin()
      .loginPage("/flash/v1/home") // MY DEFAULT LOGIN PAGE
      .permitAll()
      .and()
    .logout() //THE DEFAULT LOGOUT CONTROLLER, JUST CALL "/logout" URL AND WILL LOGOUT
      .permitAll();
  }
 
  @Override
  protected void configure(AuthenticationManagerBuilder auth) throws Exception {
    auth.userDetailsService(customUserDetails).passwordEncoder(bCrypt);
  }


/*   @Bean
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
  } */
}
