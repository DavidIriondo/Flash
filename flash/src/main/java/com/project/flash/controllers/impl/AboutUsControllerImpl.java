package com.project.flash.controllers.impl;

import com.project.flash.controllers.AboutUsController;
import com.project.flash.forms.UserRegisterForm;
import com.project.flash.utils.constants.WebConstants;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(WebConstants.APPLICATION_NAME + WebConstants.API_VERSION_1 + WebConstants.ABOUT_PAGE)
public class AboutUsControllerImpl implements AboutUsController{

    @Override   
    @GetMapping()
    public String aboutUsPage(Model model) {
        model.addAttribute("UserRegisterForm", new UserRegisterForm());
        return "about-us/about-us";
    }
    
}
