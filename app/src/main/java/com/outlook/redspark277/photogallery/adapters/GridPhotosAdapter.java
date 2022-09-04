package com.outlook.redspark277.photogallery.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

import com.outlook.redspark277.photogallery.R;
import com.outlook.redspark277.photogallery.databinding.GridViewItemBinding;
import com.outlook.redspark277.photogallery.models.Photo;

import java.util.List;

public class GridPhotosAdapter extends RecyclerView.Adapter<GridPhotosAdapter.PhotoContainer> {

    List<Photo> photos;
    View.OnClickListener listener;

    public void setOnClickListener(View.OnClickListener listener) {
        this.listener = listener;
    }

    public GridPhotosAdapter(List<Photo> photos) {
        this.photos = photos;
    }

    @NonNull
    @Override
    public PhotoContainer onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        GridViewItemBinding binding;
        binding = DataBindingUtil.inflate(
                LayoutInflater.from(parent.getContext()),
                R.layout.grid_view_item,
                parent,
                false
        );

        binding.getRoot().setOnClickListener(v -> {
            if (listener != null) {
                listener.onClick(v);
            }
        });

        return new PhotoContainer(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull PhotoContainer holder, int position) {
        holder.link(photos.get(position));
    }

    @Override
    public int getItemCount() {
        return photos.size();
    }

    static class PhotoContainer extends RecyclerView.ViewHolder {

        GridViewItemBinding binding;

        public PhotoContainer(@NonNull GridViewItemBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }

        public void link(Photo photo) {
            binding.setPhoto(photo);
        }
    }
}
