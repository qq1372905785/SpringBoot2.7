package com.tdcare.boot.bean;

public class User {
    private String userName;

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }

    private Integer age;
    private  Dog dog;


    public void setAge(Integer age) {
        this.age = age;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }


    public Integer getAge() {
        return age;
    }

    public Dog getDog() {
        return dog;
    }

    public User() {
    }

    public User(String userName, Integer age, Dog dog) {
        this.userName = userName;
        this.age = age;
        this.dog = dog;
    }


}
