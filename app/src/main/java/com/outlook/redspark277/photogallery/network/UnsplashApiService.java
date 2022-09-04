package com.outlook.redspark277.photogallery.network;

import com.outlook.redspark277.photogallery.models.Photo;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface UnsplashApiService {
    @GET("photos")
    Call<List<Photo>> getPhotos(
            @Query("client_id")String clientId,
            @Query("page")String page,
            @Query("per_page")String perPage,
            @Query("order_by")String orderBy
    );
}
