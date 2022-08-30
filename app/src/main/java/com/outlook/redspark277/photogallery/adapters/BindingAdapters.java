package com.outlook.redspark277.photogallery.adapters;

import android.net.Uri;
import android.widget.ImageView;

import androidx.databinding.BindingAdapter;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

public class BindingAdapters {
    @BindingAdapter("photoUrl")
    public static void loadPhoto(ImageView ivPhoto, String url) {
        Uri photoUri = Uri
                .parse(url)
                .buildUpon()
                .scheme("https")
                .build();

        Glide.with(ivPhoto.getContext())
                .load(photoUri)
                .apply(new RequestOptions())
                .placeholder(android.R.drawable.ic_menu_search)
                .error(android.R.drawable.ic_dialog_alert)
                .into(ivPhoto);
    }
}
