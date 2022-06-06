package com.project.flash.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "TEMPLATES")
public class Template {
  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @ManyToOne
  @JoinColumn(name="USER_ID")
  private User userTemplate;

  @Column(name = "TITLE")
  private String title;

  @Column(name = "DESCRIPTION")
  private String description;

  @Column(name = "FILE")
  private byte[] file;

  @Column(name = "FILE_IMAGE")
  private byte[] fileImage;

  @Column(name = "LIKES_NUMBER")
  private Integer likesNumber;

  @Column(name = "DOWNLOAD_NUMBER")
  private Integer downloadNumber;

  @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "template")
  private List<Comment> commentList;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public User getUserTemplate() {
    return userTemplate;
  }

  public void setUserTemplate(User userTemplate) {
    this.userTemplate = userTemplate;
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

  public byte[] getFile() {
    return file;
  }

  public void setFile(byte[] file) {
    this.file = file;
  }

  public byte[] getFileImage() {
    return fileImage;
  }

  public void setFileImage(byte[] fileImage) {
    this.fileImage = fileImage;
  }

  public Integer getLikesNumber() {
    return likesNumber;
  }

  public void setLikesNumber(Integer likesNumber) {
    this.likesNumber = likesNumber;
  }

  public Integer getDownloadNumber() {
    return downloadNumber;
  }

  public void setDownloadNumber(Integer downloadNumber) {
    this.downloadNumber = downloadNumber;
  }

  public List<Comment> getCommentList() {
    return commentList;
  }

  public void setCommentList(List<Comment> commentList) {
    this.commentList = commentList;
  }


  

}
