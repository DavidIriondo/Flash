package com.project.flash.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "COMMENTS")
public class Comment {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(name = "TITLE")
  private String title;

  @Column(name = "DESCRIPTION")
  private String description;

  
  @ManyToOne
  @JoinColumn(name="USER_ID")
  private User userComment;

  
  @ManyToOne
  @JoinColumn(name="TEMPLATE_ID")
  private Template template;


  public Long getId() {
    return id;
  }


  public void setId(Long id) {
    this.id = id;
  }


  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    this.title = title;
  }


  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public User getUserComment() {
    return userComment;
  }


  public void setUserComment(User userComment) {
    this.userComment = userComment;
  }


  public Template getTemplate() {
    return template;
  }


  public void setTemplate(Template template) {
    this.template = template;
  }
  

  
}
