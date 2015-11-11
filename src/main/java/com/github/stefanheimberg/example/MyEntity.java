package com.github.stefanheimberg.example;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class MyEntity implements Serializable {
    
    @Id
    private Long id;
    
    private String text;

    public MyEntity() {
    }

    public Long getId() {
        return id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
    
}
