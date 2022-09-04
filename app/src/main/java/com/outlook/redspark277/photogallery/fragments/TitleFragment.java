package com.outlook.redspark277.photogallery.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import com.outlook.redspark277.photogallery.R;
import com.outlook.redspark277.photogallery.databinding.FragmentTitleBinding;

public class TitleFragment extends Fragment {

    FragmentTitleBinding binding;
    NavController navController;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = DataBindingUtil
                .inflate(inflater, R.layout.fragment_title, container, false);
        navController = Navigation.findNavController(requireActivity(), R.id.frgNavHostFragment);

        binding.btnLoadGallery.setOnClickListener(v -> {
            navController.navigate(R.id.action_titleFragment_to_listPhotosFragment);
        });

        return binding.getRoot();
    }
}