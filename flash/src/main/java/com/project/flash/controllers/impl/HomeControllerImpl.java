package com.project.flash.controllers.impl;

import com.project.flash.controllers.HomeController;
import com.project.flash.utils.constants.WebConstants;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HomeControllerImpl implements HomeController{

    @Override
    @GetMapping(WebConstants.APPLICATION_NAME + WebConstants.API_VERSION_1 + WebConstants.HOME_PAGE)
    public String homePage() {
        return "home/home";
    }

    @GetMapping()
    public String defaultPage(){
        return "home/home";
    }

}
