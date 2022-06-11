package com.project.flash.controllers.impl;

import com.project.flash.controllers.RegisterController;
import com.project.flash.entities.User;
import com.project.flash.forms.UserRegisterForm;
import com.project.flash.security.utils.CustomUserDetails;
import com.project.flash.service.impl.UserServiceImpl;
import com.project.flash.utils.constants.WebConstants;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.authentication.WebAuthenticationDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(WebConstants.APPLICATION_NAME + WebConstants.API_VERSION_1 + WebConstants.HOME_PAGE)
public class RegisterControllerImpl implements RegisterController{

  @Autowired
  private UserServiceImpl userServiceImpl;
  

  @Override
  @PostMapping("/register-user")
  public String registerPage(HttpServletRequest request, @ModelAttribute("UserRegisterForm") UserRegisterForm form,  Model model) {

   userServiceImpl.createUserByForm(form);


    return "redirect:" + WebConstants.APPLICATION_NAME + WebConstants.API_VERSION_1 + WebConstants.HOME_PAGE;

  }

}
