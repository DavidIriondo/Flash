package com.project.flash.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.project.flash.entities.Package;
import com.project.flash.service.PackagesService;

import org.springframework.stereotype.Service;

@Service
public class PackageServiceImpl implements PackagesService{

  @Override
  public List<Package> packageList() {
    List<Package> packageList = new ArrayList<>();
    //Packages
    Package flask = new Package(1L, "Flask", "Flask==2.1.2");
    Package flaskLogin = new Package(2L, "Flask Login", "Flask-Login==0.6.1");
    Package flaskSqlAlchemy = new Package(3L, "SQLAlchemy", "Flask-SQLAlchemy==2.5.1");
    Package flaskWtf = new Package(4L, "Flask WTF", "Flask-WTF==1.0.1");
    Package flaskMail = new Package(5L, "Flask Mail", "Flask-Mail==0.9.1");
    Package flaskRestfull = new Package(6L, "Flask RestFull", "Flask-RESTful==0.3.9");
    Package flaskDebugToolBar = new Package(7L, "Flask Debug Tool Bar", "Flask-DebugToolbar==0.13.1");
    Package flaskAdmin = new Package(8L, "Flask Admin", "Flask-Admin==1.6.0");
    Package flaskCors = new Package(9L, "Flask Cors", "Flask-Cors==3.0.10");
    Package flaskMigrate = new Package(10L, "Flask Migrate", "Flask-Migrate==3.1.0");
    Package flaskBootstrap= new Package(11L, "Flask Bootstrap", "Flask-Bootstrap==3.3.7.1");
    

    packageList.add(flask);
    packageList.add(flaskLogin);
    packageList.add(flaskSqlAlchemy);
    packageList.add(flaskWtf);
    packageList.add(flaskMail);
    packageList.add(flaskRestfull);
    packageList.add(flaskDebugToolBar);
    packageList.add(flaskAdmin);
    packageList.add(flaskCors);
    packageList.add(flaskMigrate);
    packageList.add(flaskBootstrap);

    return packageList;
  }
  
}
