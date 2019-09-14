package com.sourcey.materiallogindemo.YogaPoses;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

import com.sourcey.materiallogindemo.R;

public class UpwardSalute extends AppCompatActivity {

    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.upwardsalute);

        imageView = findViewById(R.id.imageView);

        String url = "https://firebasestorage.googleapis.com/v0/b/brainsprain-6696b.appspot.com/o/upward_salute.png?alt=media&token=64c8eb44-ee3c-4f57-8c2a-f068639b14ed";

        Glide.with(getApplicationContext()).load(url).centerCrop().into(imageView);
    }
}