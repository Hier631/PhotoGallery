package com.outlook.redspark277.photogallery.viewmodels;

import androidx.annotation.NonNull;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.outlook.redspark277.photogallery.activities.MainActivity;
import com.outlook.redspark277.photogallery.models.Photo;
import com.outlook.redspark277.photogallery.network.UnsplashApiAdapter;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ListPhotosViewModel extends ViewModel {

    private final MutableLiveData<String> _response = new MutableLiveData<>();
    public LiveData<String> response = _response;

    private final MutableLiveData<List<Photo>> _photos = new MutableLiveData<>();
    public LiveData<List<Photo>> photos = _photos;

    public void getResponse() {
        UnsplashApiAdapter.getApiService().getPhotos(
                MainActivity.ACCESS_KEY,
                "1",
                "30",
                "popular"
        )
                .enqueue(new Callback<List<Photo>>() {
                    @Override
                    public void onResponse(@NonNull Call<List<Photo>> call, @NonNull Response<List<Photo>> response) {
                        if (response.isSuccessful()) {
                            _photos.setValue(response.body());
                            if (response.body() != null) {
                                _response.setValue(String.valueOf(response.body().size()));
                            }
                        }
                        else {
                            _response.setValue("An error occurred while parsing the response: " + response.errorBody());
                        }
                    }

                    @Override
                    public void onFailure(@NonNull Call<List<Photo>> call, @NonNull Throwable t) {
                        _response.setValue("An error occurred while connecting to Unsplash API: " + t.getMessage());
                    }
                });
    }
}