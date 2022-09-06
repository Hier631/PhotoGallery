package com.outlook.redspark277.photogallery.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import com.outlook.redspark277.photogallery.R;
import com.outlook.redspark277.photogallery.adapters.GridPhotosAdapter;
import com.outlook.redspark277.photogallery.databinding.ListPhotosFragmentBinding;
import com.outlook.redspark277.photogallery.models.Photo;
import com.outlook.redspark277.photogallery.viewmodels.ListPhotosViewModel;

import java.util.Objects;

public class ListPhotosFragment extends Fragment {

    private ListPhotosViewModel mViewModel;
    private ListPhotosFragmentBinding binding;

    public static ListPhotosFragment newInstance() {
        return new ListPhotosFragment();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.list_photos_fragment, container, false);
        mViewModel = new ViewModelProvider(this).get(ListPhotosViewModel.class);

        binding.setViewModel(mViewModel);
        binding.setLifecycleOwner(this);

        mViewModel.photos.observe(Objects.requireNonNull(binding.getLifecycleOwner()), photos -> {
            GridPhotosAdapter adapter = new GridPhotosAdapter(photos);
            binding.rcyPhotos.setAdapter(adapter);
            adapter.setOnClickListener(v -> {
                int position = binding.rcyPhotos.getChildAdapterPosition(v);
                Photo photo = Objects.requireNonNull(mViewModel.photos.getValue()).get(position);
                NavController navController = Navigation.findNavController(requireView());
                navController.navigate(ListPhotosFragmentDirections
                        .actionListPhotosFragmentToPhotoFragment(photo));
            });
        });

        mViewModel.getResponse();

        return binding.getRoot();
    }
}