package com.example.testandroid.model;

import com.google.gson.annotations.SerializedName;

public class First {
    private  String client_secret= "";
    private String client_id="";
    private String grant_type = "password";
    private String username;
    private String password;

    public First(){}

    public First(String username, String password) {

        this.username= username;
        this.password = password;
    }

}
