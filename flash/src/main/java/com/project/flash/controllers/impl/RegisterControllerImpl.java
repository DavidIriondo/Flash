package com.project.flash.controllers.impl;

import javax.servlet.http.HttpServletRequest;

import com.project.flash.controllers.RegisterController;
import com.project.flash.forms.UserRegisterForm;
import com.project.flash.service.impl.UserServiceImpl;
import com.project.flash.utils.constants.WebConstants;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
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
  public String registerPage(@ModelAttribute("UserRegisterForm") UserRegisterForm form,  Model model) {
    System.out.println("***REGISTRO DE USUARIO***");
    System.out.println(form.getEmail());
    System.out.println(form.getPassword());
    System.out.println(form.getRepeatPassword());
    System.out.println(form.getName());
    System.out.println(form.getSurname());

    userServiceImpl.createUserByForm(form);

    return "redirect:" + WebConstants.APPLICATION_NAME + WebConstants.API_VERSION_1 + WebConstants.HOME_PAGE + "/user-registered";

  }

  
}
