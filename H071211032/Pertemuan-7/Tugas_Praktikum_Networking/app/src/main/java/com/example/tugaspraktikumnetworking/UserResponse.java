package com.example.tugaspraktikumnetworking;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class UserResponse {
    @SerializedName("id")
    private int id;
    @SerializedName("first_name")
    private String firstName;
    @SerializedName("last_name")
    private String lastName;
    @SerializedName("email")
    private String email;
    @SerializedName("avatar")
    private String avatarUrl;
    public int getId() {
        return id;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public String getEmail() {
        return email;
    }
    public String getAvatarUrl() {
        return avatarUrl;
    }
    @SerializedName("data")
    private UserResponse data;

    public UserResponse getData() {
        return data;
    }
}


