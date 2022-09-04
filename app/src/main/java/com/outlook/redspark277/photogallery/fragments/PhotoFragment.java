package com.outlook.redspark277.photogallery.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;

import com.outlook.redspark277.photogallery.R;
import com.outlook.redspark277.photogallery.databinding.FragmentPhotoBinding;
import com.outlook.redspark277.photogallery.models.Photo;

public class PhotoFragment extends Fragment {

    FragmentPhotoBinding binding;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = DataBindingUtil
                .inflate(inflater, R.layout.fragment_photo, container, false);

        Photo photo = PhotoFragmentArgs.fromBundle(getArguments()).getPhoto();
        binding.setPhoto(photo);

        return binding.getRoot();
    }
}