package com.egemsoft.springbootgoogleoauth.enums;

public enum UserType {
    GOOGLE("google"), FACEBOOK("facebook");

    private String value;

    UserType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
