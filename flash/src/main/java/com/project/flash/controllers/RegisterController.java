package com.project.flash.controllers;

import javax.servlet.http.HttpServletRequest;

import com.project.flash.forms.UserRegisterForm;

import org.springframework.ui.Model;

public interface RegisterController {
  
  String registerPage(UserRegisterForm form, Model model);
}
