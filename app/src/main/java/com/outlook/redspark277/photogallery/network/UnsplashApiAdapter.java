package com.outlook.redspark277.photogallery.network;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class UnsplashApiAdapter {
    private static UnsplashApiService API_SERVICE;
    private static final String BASE_URL = "https://api.unsplash.com/";

    public static UnsplashApiService getApiService() {
        if (API_SERVICE == null) {
            Gson gson = new GsonBuilder()
                    .setLenient()
                    .create();

            Retrofit retrofit =
                    new Retrofit.Builder()
                    .addConverterFactory(GsonConverterFactory.create(gson))
                    .baseUrl(BASE_URL)
                    .build();
            API_SERVICE = retrofit.create(UnsplashApiService.class);
        }

        return API_SERVICE;
    }
}
