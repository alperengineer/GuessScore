package com.aok.guessscore.retrofit;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

// Bu arayüzde API ile iletişim için gerekli endpoint'i tanımlıyoruz
public interface ApiService {
    @POST("/predict")  // Flask API'deki /predict endpoint'ine POST isteği gönderiyoruz
    Call<PredictionResponse> getPrediction(@Body PredictionRequest request);
}
