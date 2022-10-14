package com.tdcare.boot.bean;

import javax.naming.Name;

public class Dog {
    private String name;
    private Integer age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public Dog(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public Dog() {
    }
}
