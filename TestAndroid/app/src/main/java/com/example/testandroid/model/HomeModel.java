package com.example.testandroid.model;

import com.google.gson.annotations.SerializedName;


public class HomeModel {
    @SerializedName("token")
    private String token;

    public HomeModel(String token) {
        this.token = token;
    }
}
