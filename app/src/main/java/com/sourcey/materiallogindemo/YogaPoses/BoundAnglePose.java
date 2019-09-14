package com.sourcey.materiallogindemo.YogaPoses;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

import com.sourcey.materiallogindemo.R;

public class BoundAnglePose extends AppCompatActivity {

    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.boundanglepose);

        imageView = findViewById(R.id.imageView);

        String url = "https://firebasestorage.googleapis.com/v0/b/brainsprain-6696b.appspot.com/o/bound_angle_pose.png?alt=media&token=457b8614-f636-425e-a255-1a9cd9b74a3b";

        Glide.with(getApplicationContext()).load(url).centerCrop().into(imageView);
    }
}