package com.project.flash.controllers.impl;

import com.project.flash.controllers.TemplateController;
import com.project.flash.utils.constants.WebConstants;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping(WebConstants.APPLICATION_NAME + WebConstants.API_VERSION_1 + WebConstants.TEMPLATE_PAGE)
public class TemplateControllerImpl implements TemplateController{

  @Override
  @GetMapping()
  public String templatePage() {
    
    return "template/templates.html";
  }
  
  @GetMapping("/template-information")
  public String templateInformationPage() {
    
    return "template/template-information.html";
  }
}
