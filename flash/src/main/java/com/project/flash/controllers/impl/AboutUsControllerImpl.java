package com.project.flash.controllers.impl;

import com.project.flash.controllers.AboutUsController;
import com.project.flash.utils.constants.WebConstants;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(WebConstants.APPLICATION_NAME + WebConstants.API_VERSION_1 + WebConstants.ABOUT_PAGE)
public class AboutUsControllerImpl implements AboutUsController{

    @Override   
    @GetMapping()
    public String aboutUsPage() {
        return "about-us/about-us";
    }
    
}
