package com.project.flash.controllers.impl;

import com.project.flash.controllers.LoginCongtroller;
import com.project.flash.forms.UserRegisterForm;
import com.project.flash.utils.constants.WebConstants;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(WebConstants.APPLICATION_NAME + WebConstants.API_VERSION_1 + WebConstants.LOGIN_PAGE)
public class LoginControllerImpl implements LoginCongtroller{

  @Override
  @GetMapping
  public String loginPage(Model model) {
    model.addAttribute("UserRegisterForm", new UserRegisterForm());
    return "home/login";
  }
  
}
