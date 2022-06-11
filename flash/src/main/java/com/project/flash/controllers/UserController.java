package com.project.flash.controllers;

import org.springframework.security.core.Authentication;
import org.springframework.ui.Model;

public interface UserController {
  
  String userProfilePage(Model model, Authentication authentication);

  String userUploadTemplatePage(Model model);

  String userTemplateList(Model model);
}
