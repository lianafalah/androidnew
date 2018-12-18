package com.example.testandroid.model;

import com.google.gson.annotations.SerializedName;

public class HomeResponse {

    @SerializedName("salam") public String salam;
    @SerializedName("beans") public int beans;
    @SerializedName("point") public int point;
    @SerializedName("balance") public int balance;
    @SerializedName("username") public String username;
    @SerializedName("primaryCard") public PrimaryCard primaryCard;
    @SerializedName("virtual_card") public int virtualCard;
    @SerializedName("email") public String email;
    @SerializedName("phone") public String phone;
    @SerializedName("referralCode") public String referralCode;
    @SerializedName("verifikasi_email") public String verifikasiEmail;
    @SerializedName("verifikasi_sms") public String verifikasiSms;
    @SerializedName("cardAmount") public int cardAmount;

    public class PrimaryCard {
        @SerializedName("id_card")public String idCard;
        @SerializedName("card_number")public String cardNumber;
        @SerializedName("card_name")public String cardName;
        @SerializedName("card_image")public String cardImage;
        @SerializedName("barcode")public String barcode;
        @SerializedName("distribution_id")public String distributionId;
        @SerializedName("card_pin")public String cardPin;
        @SerializedName("beans")public int beans;
        @SerializedName("expired_date")public String expiredDate;
        @SerializedName("balance")public int balance;
    }
}
