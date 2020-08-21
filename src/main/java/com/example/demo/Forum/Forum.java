package com.example.demo.Forum;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Forum {

    @Id
    private String id;

    private String description;

    public Forum() {

    }

    public Forum(String id, String description) {
        this.id = id;
        this.description = description;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
