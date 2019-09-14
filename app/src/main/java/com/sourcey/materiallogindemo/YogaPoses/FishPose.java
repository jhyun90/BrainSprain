package com.sourcey.materiallogindemo.YogaPoses;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

import com.sourcey.materiallogindemo.R;

public class FishPose extends AppCompatActivity {

    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fishpose);

        imageView = findViewById(R.id.imageView);

        String url = "https://firebasestorage.googleapis.com/v0/b/brainsprain-6696b.appspot.com/o/fish_pose.png?alt=media&token=3d7fa32b-8cac-45d8-b5e8-54ae6fda0ba5";

        Glide.with(getApplicationContext()).load(url).centerCrop().into(imageView);
    }
}