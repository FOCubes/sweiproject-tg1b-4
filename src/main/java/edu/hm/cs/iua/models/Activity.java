package edu.hm.cs.iua.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Activity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Long author;
    private String text;
    private String[] tags;
    private String title;

    public Activity (){}

    public Activity(Long author, String title, String text, String... tags) {
        this.author = author;
        this.text = text;
        this.tags = tags;
        this.title = title;
    }

    public Long getAuthor() {
        return author;
    }

    public void setAuthor(Long author) {
        this.author = author;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
    
    public String[] getTags() {
      return tags;
    }

    public void setTags(String[] tags) {
      this.tags = tags;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

}