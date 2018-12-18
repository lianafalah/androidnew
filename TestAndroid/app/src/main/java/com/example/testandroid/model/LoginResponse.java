package com.example.testandroid.model;

import com.google.gson.annotations.SerializedName;

public class LoginResponse {
    @SerializedName("status") public String status;
    @SerializedName("remember") public Object remember;
    @SerializedName("token") public String token;
    @SerializedName("username") public String username;
    @SerializedName("mobile_phone_user") public String mobilePhoneUser;
    @SerializedName("virtual_card") public String virtualCard;
    @SerializedName("foto") public String foto;
    @SerializedName("level_akses") public String levelAkses;
    @SerializedName("greeting") public String greeting;
    @SerializedName("balance_total") public int balanceTotal;
    @SerializedName("beans") public int beans;
}