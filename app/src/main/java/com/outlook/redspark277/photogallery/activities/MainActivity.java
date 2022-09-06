package com.outlook.redspark277.photogallery.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.outlook.redspark277.photogallery.R;

public class MainActivity extends AppCompatActivity {

    // Use your own Unsplash Client ID.
    public static String CLIENT_ID = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}