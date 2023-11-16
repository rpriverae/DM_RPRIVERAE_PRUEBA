package com.example.prueba_pre_15nov2023.connections;

import com.example.prueba_pre_15nov2023.models.DigimonModel;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {
    @GET("digimon")
    public Call<List<DigimonModel>> getDigimon();
}
