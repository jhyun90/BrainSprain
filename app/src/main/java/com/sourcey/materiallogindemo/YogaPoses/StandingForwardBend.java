package com.sourcey.materiallogindemo.YogaPoses;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

import com.sourcey.materiallogindemo.R;

public class StandingForwardBend extends AppCompatActivity {

    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.standingforwardbend);

        imageView = findViewById(R.id.imageView);

        String url = "https://firebasestorage.googleapis.com/v0/b/brainsprain-6696b.appspot.com/o/standing_forward_bend.png?alt=media&token=a2cff09e-e3aa-444e-9e0e-9815af95c90c";

        Glide.with(getApplicationContext()).load(url).centerCrop().into(imageView);
    }
}