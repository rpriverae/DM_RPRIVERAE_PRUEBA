package com.example.prueba_pre_15nov2023.connections;

import static com.example.prueba_pre_15nov2023.MainActivity.apiUrl;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


public class RetroFitInstance {
    public static RetroFitInstance instance;
    private ApiInterface1 apiInterface;

    RetroFitInstance() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(apiUrl)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        apiInterface = retrofit.create(ApiInterface1.class);
    }

    public static RetroFitInstance getInstance() {
        if (instance == null) {
            instance = new RetroFitInstance();
        }
        return instance;
    }

    public ApiInterface1 getApiInterface() {
        return apiInterface;
    }



}
