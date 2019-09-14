package com.sourcey.materiallogindemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

import com.bumptech.glide.Glide;
import com.sourcey.materiallogindemo.SoothingSounds.SoothingSoundsTrack1;
import com.sourcey.materiallogindemo.SoothingSounds.SoothingSoundsTrack10;
import com.sourcey.materiallogindemo.SoothingSounds.SoothingSoundsTrack2;
import com.sourcey.materiallogindemo.SoothingSounds.SoothingSoundsTrack3;
import com.sourcey.materiallogindemo.SoothingSounds.SoothingSoundsTrack4;
import com.sourcey.materiallogindemo.SoothingSounds.SoothingSoundsTrack5;
import com.sourcey.materiallogindemo.SoothingSounds.SoothingSoundsTrack6;
import com.sourcey.materiallogindemo.SoothingSounds.SoothingSoundsTrack7;
import com.sourcey.materiallogindemo.SoothingSounds.SoothingSoundsTrack8;
import com.sourcey.materiallogindemo.SoothingSounds.SoothingSoundsTrack9;
import com.sourcey.materiallogindemo.R;

public class SoothingSoundsList extends AppCompatActivity {

    private ImageButton ib1, ib2, ib3, ib4, ib5,
                        ib6, ib7, ib8, ib9, ib10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.soothing_sounds_list);

        ib1 = (ImageButton) findViewById(R.id.ibSound1);
        ib2 = (ImageButton) findViewById(R.id.ibSound2);
        ib3 = (ImageButton) findViewById(R.id.ibSound3);
        ib4 = (ImageButton) findViewById(R.id.ibSound4);
        ib5 = (ImageButton) findViewById(R.id.ibSound5);
        ib6 = (ImageButton) findViewById(R.id.ibSound6);
        ib7 = (ImageButton) findViewById(R.id.ibSound7);
        ib8 = (ImageButton) findViewById(R.id.ibSound8);
        ib9 = (ImageButton) findViewById(R.id.ibSound9);
        ib10 = (ImageButton) findViewById(R.id.ibSound10);

        // Image

        // Bird
        String url1 = "https://firebasestorage.googleapis.com/v0/b/brainsprain-6696b.appspot.com/o/Brid.png?alt=media&token=35eb0939-78b6-4aff-b241-bb99f775bbbf";

        Glide.with(getApplicationContext()).load(url1).fitCenter().into(ib1);

        // River
        String url2 = "https://firebasestorage.googleapis.com/v0/b/brainsprain-6696b.appspot.com/o/River.png?alt=media&token=819f519a-b071-4b92-83ad-70ac34538202";

        Glide.with(getApplicationContext()).load(url2).fitCenter().into(ib2);

        // Rain
        String url3 = "https://firebasestorage.googleapis.com/v0/b/brainsprain-6696b.appspot.com/o/Rain.png?alt=media&token=9a08d36a-3e76-42a1-91ed-970973ca1f6c";

        Glide.with(getApplicationContext()).load(url3).fitCenter().into(ib3);

        // Campfire
        String url4 = "https://firebasestorage.googleapis.com/v0/b/brainsprain-6696b.appspot.com/o/Campfire.png?alt=media&token=b51ed77d-3e96-4f97-a4d2-1bb7dd60f691";

        Glide.with(getApplicationContext()).load(url4).fitCenter().into(ib4);

        // Fireplace
        String url5 = "https://firebasestorage.googleapis.com/v0/b/brainsprain-6696b.appspot.com/o/Fireplace.png?alt=media&token=da841d8d-8af5-4803-86a4-842ffc3dc0a0";

        Glide.with(getApplicationContext()).load(url5).fitCenter().into(ib5);

        // Piano1
        String url6 = "https://firebasestorage.googleapis.com/v0/b/brainsprain-6696b.appspot.com/o/Piano1.png?alt=media&token=6ebbfffa-4465-446d-a97c-c657482865af";

        Glide.with(getApplicationContext()).load(url6).fitCenter().into(ib6);

        // Piano2
        String url7 = "https://firebasestorage.googleapis.com/v0/b/brainsprain-6696b.appspot.com/o/Piano2.png?alt=media&token=d95ec55b-d743-4b6c-86d1-9b0cf46d8582";

        Glide.with(getApplicationContext()).load(url7).fitCenter().into(ib7);

        // Piano3
        String url8 = "https://firebasestorage.googleapis.com/v0/b/brainsprain-6696b.appspot.com/o/Piano3.png?alt=media&token=d84010ca-c300-400e-97fb-de3f5df6123a";

        Glide.with(getApplicationContext()).load(url8).fitCenter().into(ib8);

        //
        String url9 = "https://firebasestorage.googleapis.com/v0/b/brainsprain-6696b.appspot.com/o/blue_clean_close_up.jpg?alt=media&token=f1b7c072-a473-44d4-b2d7-a4c7bc73102e";

        Glide.with(getApplicationContext()).load(url9).fitCenter().into(ib9);

        //
        String url10 = "https://firebasestorage.googleapis.com/v0/b/brainsprain-6696b.appspot.com/o/clouds_daylight_environment.jpg?alt=media&token=1a363333-1e8d-4b17-bd1d-25634618847c";

        Glide.with(getApplicationContext()).load(url10).fitCenter().into(ib10);

        ib1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SoothingSoundsList.this, SoothingSoundsTrack1.class);
                startActivity(intent);
            }
        });

        ib2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SoothingSoundsList.this, SoothingSoundsTrack2.class);
                startActivity(intent);
            }
        });

        ib3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SoothingSoundsList.this, SoothingSoundsTrack3.class);
                startActivity(intent);
            }
        });

        ib4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SoothingSoundsList.this, SoothingSoundsTrack4.class);
                startActivity(intent);
            }
        });

        ib5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SoothingSoundsList.this, SoothingSoundsTrack5.class);
                startActivity(intent);
            }
        });

        ib6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SoothingSoundsList.this, SoothingSoundsTrack6.class);
                startActivity(intent);
            }
        });

        ib7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SoothingSoundsList.this, SoothingSoundsTrack7.class);
                startActivity(intent);
            }
        });

        ib8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SoothingSoundsList.this, SoothingSoundsTrack8.class);
                startActivity(intent);
            }
        });

        ib9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SoothingSoundsList.this, SoothingSoundsTrack9.class);
                startActivity(intent);
            }
        });

        ib10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SoothingSoundsList.this, SoothingSoundsTrack10.class);
                startActivity(intent);
            }
        });
    }
}