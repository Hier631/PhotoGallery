package com.outlook.redspark277.photogallery.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.outlook.redspark277.photogallery.R;

public class MainActivity extends AppCompatActivity {

    // Use your own API key.
    public static String API_KEY = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}