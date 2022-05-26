package com.project.flash.entities;

public class Package {
  
  Long id;
  String name;
  String requirementName;
  String description;

  public Package(){

  }

  public Package(Long id, String name, String requirementName){
    this.id = id;
    this.name = name;
    this.requirementName = requirementName;
    this.description = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.";
  }

  public Package(Long id, String nam, String requirementName, String description){
    this.id = id;
    this.name = name;
    this.requirementName = requirementName;
    this.description = description;
  }

  public Long getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public String getDescription() {
    return description;
  }

  public String getRequirementName() {
    return requirementName;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public void setRequirementName(String requirementName) {
    this.requirementName = requirementName;
  }
}
