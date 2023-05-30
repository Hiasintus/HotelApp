package com.sintus.hotelapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    private ImageView _imageView1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        _imageView1=findViewById(R.id.imageView1);
        String imageUrl = "https://www.pexels.com/photo/grayscale-photo-of-people-on-beach-5598508/";
        Picasso.with(this).load(imageUrl).into(_imageView1);
    }
}