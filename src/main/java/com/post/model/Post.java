package com.post.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Temporal;
import org.springframework.data.annotation.Id;

import java.util.Date;
import static jakarta.persistence.TemporalType.TIMESTAMP;

public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String text;
    @Temporal(TIMESTAMP)
    private Date creationDate;

    public Post(String title, String text, Date creationDate){
        this.title = title;
        this.text = text;
        this.creationDate = creationDate;
    }
    public Long getId(){
        return id;
    }
    public void setId(Long id){
        this.id = id;
    }
    public String getTitle(){
        return title;
    }
    public void setTitle(String title){
        this.title = title;
    }
    public String getText(){
        return text;
    }
    public void setText(String text){
        this.text = text;
    }
    public Date getCreationDate(){
        return creationDate;
    }
    public void setCreationDate(Date creationDate){
        this.creationDate = creationDate;
    }
}
