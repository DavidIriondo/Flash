package com.project.flash.controllers;

import org.springframework.security.core.Authentication;
import org.springframework.ui.Model;

public interface ProjectController {
    
    String projectPage(Model model, Authentication authentication);
}
