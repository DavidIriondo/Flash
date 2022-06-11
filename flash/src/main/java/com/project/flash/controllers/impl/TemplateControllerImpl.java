package com.project.flash.controllers.impl;

import com.project.flash.controllers.TemplateController;
import com.project.flash.forms.UserRegisterForm;
import com.project.flash.utils.constants.WebConstants;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping(WebConstants.APPLICATION_NAME + WebConstants.API_VERSION_1 + WebConstants.TEMPLATE_PAGE)
public class TemplateControllerImpl implements TemplateController{

  @Override
  @GetMapping()
  public String templatePage(Model model) {
    model.addAttribute("UserRegisterForm", new UserRegisterForm());
    return "template/templates.html";
  }
  
  //This page is loaded when client click over one template in template store,  here you can download the template
  @GetMapping("/template-information")
  public String templateInformationPage() {
    
    return "template/template-information.html";
  }
}
