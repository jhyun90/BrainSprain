package com.sourcey.materiallogindemo.YogaPoses;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

import com.sourcey.materiallogindemo.R;

public class SeatedForwardBend extends AppCompatActivity {

    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.seatedforwardbend);

        imageView = findViewById(R.id.imageView);

        String url = "https://firebasestorage.googleapis.com/v0/b/brainsprain-6696b.appspot.com/o/seated_forward_bend.png?alt=media&token=4112a6f4-3895-487a-b097-41d73a05d37a";

        Glide.with(getApplicationContext()).load(url).centerCrop().into(imageView);
    }
}