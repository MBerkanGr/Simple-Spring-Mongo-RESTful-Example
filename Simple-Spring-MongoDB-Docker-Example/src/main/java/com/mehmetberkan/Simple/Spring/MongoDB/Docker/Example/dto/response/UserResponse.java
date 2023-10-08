package com.mehmetberkan.Simple.Spring.MongoDB.Docker.Example.dto.response;

import java.util.HashMap;

public class UserResponse {
    private String id;
    private String name;
    private String surname;
    private HashMap features;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public HashMap getFeatures() {
        return features;
    }

    public void setFeatures(HashMap features) {
        this.features = features;
    }
}
