package com.project.flash.controllers.impl;

import com.project.flash.controllers.ProjectController;
import com.project.flash.utils.constants.WebConstants;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(WebConstants.APPLICATION_NAME + WebConstants.API_VERSION_1 + WebConstants.PROJECT_PAGE)
public class ProjectControllerImpl implements ProjectController{
    
    @Override
    @GetMapping()
    public String projectPage() {
        // TODO Auto-generated method stub
        return "project/project";
    }

    @GetMapping("/file")
    public String filePage() {
        // TODO Auto-generated method stub
        return "file";
    }

    @GetMapping("/user")
    public String userPage() {
        // TODO Auto-generated method stub
        return "user/user-profile";
    }

    @GetMapping("/upload-template")
    public String uploadTemplatePage() {
        // TODO Auto-generated method stub
        return "user/user-upload-template";
    }

    @GetMapping("/user-template-list")
    public String userTemplateListPage() {
        // TODO Auto-generated method stub
        return "user/user-template-list";
    }
}
