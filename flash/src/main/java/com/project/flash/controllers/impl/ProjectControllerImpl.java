package com.project.flash.controllers.impl;

import com.project.flash.controllers.ProjectController;
import com.project.flash.forms.UserRegisterForm;
import com.project.flash.utils.constants.WebConstants;

import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(WebConstants.APPLICATION_NAME + WebConstants.API_VERSION_1 + WebConstants.PROJECT_PAGE)
public class ProjectControllerImpl implements ProjectController{
    
    @Override
    @GetMapping()
    public String projectPage(Model model, Authentication authentication) {
        model.addAttribute("UserRegisterForm", new UserRegisterForm());

        System.out.println(authentication.getName());

        // TODO Auto-generated method stub
        return "project/project";
    }

/*     @GetMapping("/file")
    public String filePage() {
        // TODO Auto-generated method stub
        return "file";
    } */

}
