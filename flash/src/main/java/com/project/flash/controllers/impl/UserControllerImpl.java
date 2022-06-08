package com.project.flash.controllers.impl;

import com.project.flash.controllers.UserController;
import com.project.flash.forms.UserRegisterForm;
import com.project.flash.utils.constants.WebConstants;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(WebConstants.APPLICATION_NAME + WebConstants.API_VERSION_1 + WebConstants.USER_PAGE)
public class UserControllerImpl implements UserController{

  @Override
  @GetMapping("/profile")
  public String userProfilePage(Model model) {
    model.addAttribute("UserRegisterForm", new UserRegisterForm());
    return "user/user-profile";
  }

  @Override
  @GetMapping("/new-template")
  public String userUploadTemplatePage(Model model) {
    return "user/user-upload-template";
  }

  @Override
  @GetMapping("/template-list")
  public String userTemplateList() {
    return "user/user-template-list";
  }
  
  
}
