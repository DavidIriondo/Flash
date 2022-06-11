package com.project.flash.controllers.impl;

import com.project.flash.controllers.UserController;
import com.project.flash.entities.User;
import com.project.flash.forms.UserRegisterForm;
import com.project.flash.service.impl.UserServiceImpl;
import com.project.flash.utils.constants.WebConstants;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(WebConstants.APPLICATION_NAME + WebConstants.API_VERSION_1 + WebConstants.USER_PAGE)
public class UserControllerImpl implements UserController{

  @Autowired
  private UserServiceImpl userServiceImpl;

  @Override
  @GetMapping("/profile")
  public String userProfilePage(Model model, Authentication authentication) {

    User user = userServiceImpl.getUserByEmail(authentication.getName());

    model.addAttribute("UserRegisterForm", new UserRegisterForm());
    model.addAttribute("UserObject", user);

    return "user/user-profile";
  }

  @Override
  @GetMapping("/new-template")
  public String userUploadTemplatePage(Model model) {
    model.addAttribute("UserRegisterForm", new UserRegisterForm());
    return "user/user-upload-template";
  }

  @Override
  @GetMapping("/template-list")
  public String userTemplateList(Model model) {
    model.addAttribute("UserRegisterForm", new UserRegisterForm());
    return "user/user-template-list";
  }
  
  
}
