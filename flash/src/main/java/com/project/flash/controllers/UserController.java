package com.project.flash.controllers;

import org.springframework.ui.Model;

public interface UserController {
  
  String userProfilePage(Model model);

  String userUploadTemplatePage(Model model);

  String userTemplateList();
}
