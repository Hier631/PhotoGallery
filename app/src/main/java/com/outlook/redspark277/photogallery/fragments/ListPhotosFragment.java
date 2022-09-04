package com.outlook.redspark277.photogallery.fragments;

import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.outlook.redspark277.photogallery.R;
import com.outlook.redspark277.photogallery.viewmodels.ListPhotosViewModel;

public class ListPhotosFragment extends Fragment {

    private ListPhotosViewModel mViewModel;

    public static ListPhotosFragment newInstance() {
        return new ListPhotosFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.list_photos_fragment, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(ListPhotosViewModel.class);
        // TODO: Use the ViewModel
    }

}