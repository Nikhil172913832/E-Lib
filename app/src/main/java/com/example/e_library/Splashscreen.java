package com.example.e_library;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Handler;
import android.content.Intent;

import android.os.Bundle;
import android.widget.ImageView;
import android.window.SplashScreen;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

public class Splashscreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen);
        ImageView gifImageView = findViewById(R.id.idIVLogo);
        RequestOptions options = new RequestOptions()
                .centerCrop(); // You can adjust the options as needed

        Glide.with(this)
                .asGif() // Specify that you are loading a GIF
                .load(R.raw.splashscreen) // Replace with your GIF file name
                .apply(options)
                .into(gifImageView);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                // Start your main activity here
                Intent intent = new Intent(Splashscreen.this, MainActivity.class);
                startActivity(intent);
                finish(); // Close the splash screen activity
            }
        }, 3500);
    }
}