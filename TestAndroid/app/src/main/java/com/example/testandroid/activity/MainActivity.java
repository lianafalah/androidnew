package com.example.testandroid.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.testandroid.R;
import com.example.testandroid.data.ApiClient;
import com.example.testandroid.data.ApiService;
import com.example.testandroid.model.First;
import com.example.testandroid.model.FirstResponse;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    ApiService apiService;
    private String token;
    String accessToken;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        apiService = ApiClient.getClient().create(ApiService.class);
        First body = new First("support@technopartner.id", "1234567");
        Call<FirstResponse> call = apiService.postFirst(body);
        call.enqueue(new Callback<FirstResponse>() {
            @Override
            public void onResponse(Call<FirstResponse> call, Response<FirstResponse> response) {
                token = response.body().accessToken;
            }
            @Override
            public void onFailure(Call<FirstResponse> call, Throwable t) {
            }
        });
    }
    public void login(View view){
        Intent intent= new Intent(MainActivity.this, LoginActivity.class);
        intent.putExtra("AccessToken", token);
        startActivity(intent);
        finish();
    }
    public void signup(View view){
        Intent intent= new Intent(MainActivity.this, SignUpActivity.class);
        startActivity(intent);
    }
}
