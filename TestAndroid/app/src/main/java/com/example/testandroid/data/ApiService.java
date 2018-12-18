package com.example.testandroid.data;

import com.example.testandroid.model.First;
import com.example.testandroid.model.FirstResponse;
import com.example.testandroid.model.HomeModel;
import com.example.testandroid.model.HomeResponse;
import com.example.testandroid.model.Login;
import com.example.testandroid.model.LoginResponse;
import com.example.testandroid.model.MainMenu;
import com.example.testandroid.model.MenuResponse;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;

public interface ApiService {
    @POST("api/login")
    Call<LoginResponse> postLoginData(@Body Login Body,
                                      @Header("Authorization") String authorization);



    @POST("api/v2/home")
    Call<HomeResponse> postHome(@Body HomeModel Body, @Header("Authorization") String authorization);

    @POST("oauth/access_token")
    Call<FirstResponse> postFirst(@Body First Body);

}
