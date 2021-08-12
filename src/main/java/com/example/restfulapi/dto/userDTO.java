package com.example.restfulapi.dto;

import java.io.Serializable;

/**
 * Create by czl on 2021/8/12 18:21
 */
public class userDTO implements Serializable {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public userDTO(String name, int age) {
        this.age=age;
        this.name=name;
    }
}
