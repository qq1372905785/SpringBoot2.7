package com.tdcare.boot.bean;

public class User {
    private String userName;
    private Integer age;
    private Dog dog;

    public User() {
    }

    public User(String userName, Integer age,Dog dog) {
        this.userName = userName;
        this.age = age;
        this.dog = dog;
    }

    public String getUserName() {
        return userName;
    }

    public Integer getAge() {
        return age;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }
}
