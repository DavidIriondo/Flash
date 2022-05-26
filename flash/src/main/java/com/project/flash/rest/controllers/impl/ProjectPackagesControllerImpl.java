package com.project.flash.rest.controllers.impl;

import java.util.List;

import com.project.flash.entities.Package;
import com.project.flash.rest.controllers.ProjectPackagesController;
import com.project.flash.service.impl.PackageServiceImpl;
import com.project.flash.utils.constants.WebConstants;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(WebConstants.APPLICATION_NAME + WebConstants.API_VERSION_1 + WebConstants.REST_CONTENT)
public class ProjectPackagesControllerImpl implements ProjectPackagesController{

  @Autowired
    PackageServiceImpl packageServiceImpl;

  @Override
  @GetMapping(value = WebConstants.PACKAGES_REST, produces = MediaType.APPLICATION_JSON_VALUE)
  public List<Package> packagesList() {
    
    return packageServiceImpl.packageList();
  }


  
}
