package com.example.testandroid.model;
import com.google.gson.annotations.SerializedName;
public class Login {
    @SerializedName("email")
    private String email;
    @SerializedName("password")
    private String password;
    public Login()
    {

    }
    public Login(String email, String password) {
        this.email = email;
        this.password = password;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String id) {
        this.email = email;
    }
    public String getPassword() {
        return password;
    }
    public void setNama(String nama) {
        this.password = password;
    }
}
