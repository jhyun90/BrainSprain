package com.sourcey.materiallogindemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

import com.bumptech.glide.Glide;
import com.sourcey.materiallogindemo.YogaPoses.BigToePose;
import com.sourcey.materiallogindemo.YogaPoses.BoundAnglePose;
import com.sourcey.materiallogindemo.YogaPoses.BowPose;
import com.sourcey.materiallogindemo.YogaPoses.BridgePose;
import com.sourcey.materiallogindemo.YogaPoses.CamelPose;
import com.sourcey.materiallogindemo.YogaPoses.CatPose;
import com.sourcey.materiallogindemo.YogaPoses.ChannelCleaningBreath;
import com.sourcey.materiallogindemo.YogaPoses.CowPose;
import com.sourcey.materiallogindemo.YogaPoses.EasyPose;
import com.sourcey.materiallogindemo.YogaPoses.ExtendedPuppyPose;
import com.sourcey.materiallogindemo.YogaPoses.FishPose;
import com.sourcey.materiallogindemo.YogaPoses.SeatedForwardBend;
import com.sourcey.materiallogindemo.YogaPoses.StandingForwardBend;
import com.sourcey.materiallogindemo.YogaPoses.UpwardSalute;

public class YogaPosesList extends AppCompatActivity {

    private ImageButton ib1, ib2, ib3, ib4, ib5,
                        ib6, ib7, ib8, ib9, ib10,
                        ib11, ib12, ib13, ib14;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.yoga_poses_list);

        ib1 = (ImageButton) findViewById(R.id.ibBigToePose);
        ib2 = (ImageButton) findViewById(R.id.ibBoundAnglePose);
        ib3 = (ImageButton) findViewById(R.id.ibBowPose);
        ib4 = (ImageButton) findViewById(R.id.ibBridgePose);
        ib5 = (ImageButton) findViewById(R.id.ibCamelPose);
        ib6 = (ImageButton) findViewById(R.id.ibCatPose);
        ib7 = (ImageButton) findViewById(R.id.ibChannelCleaningBreath);
        ib8 = (ImageButton) findViewById(R.id.ibCowPose);
        ib9 = (ImageButton) findViewById(R.id.ibEasyPose);
        ib10 = (ImageButton) findViewById(R.id.ibExtendedPuppyPose);
        ib11 = (ImageButton) findViewById(R.id.ibFishPose);
        ib12 = (ImageButton) findViewById(R.id.ibSeatedForwardBend);
        ib13 = (ImageButton) findViewById(R.id.ibStandingForwardBend);
        ib14 = (ImageButton) findViewById(R.id.ibUpwardSalute);

        String url1 = "https://firebasestorage.googleapis.com/v0/b/brainsprain-6696b.appspot.com/o/big_toe_pose.png?alt=media&token=43c7a9d2-cb12-4459-85e4-ebb15638dc31";

        Glide.with(getApplicationContext()).load(url1).fitCenter().into(ib1);

        String url2 = "https://firebasestorage.googleapis.com/v0/b/brainsprain-6696b.appspot.com/o/bound_angle_pose.png?alt=media&token=457b8614-f636-425e-a255-1a9cd9b74a3b";

        Glide.with(getApplicationContext()).load(url2).fitCenter().into(ib2);

        String url3 = "https://firebasestorage.googleapis.com/v0/b/brainsprain-6696b.appspot.com/o/bow_pose.png?alt=media&token=18f413f8-7b78-4df4-b735-003544a0fdf3";

        Glide.with(getApplicationContext()).load(url3).fitCenter().into(ib3);

        String url4 = "https://firebasestorage.googleapis.com/v0/b/brainsprain-6696b.appspot.com/o/bridge_pose.png?alt=media&token=4e21f9a4-0b77-425a-b113-19745b0c7409";

        Glide.with(getApplicationContext()).load(url4).fitCenter().into(ib4);

        String url5 = "https://firebasestorage.googleapis.com/v0/b/brainsprain-6696b.appspot.com/o/camel_pose.png?alt=media&token=b2cab164-0058-43f6-8220-6e589f6bd6a4";

        Glide.with(getApplicationContext()).load(url5).fitCenter().into(ib5);

        String url6 = "https://firebasestorage.googleapis.com/v0/b/brainsprain-6696b.appspot.com/o/cat_pose.png?alt=media&token=26deabbd-c5aa-42ee-9a72-49d5ab26ecb2";

        Glide.with(getApplicationContext()).load(url6).fitCenter().into(ib6);

        String url7 = "https://firebasestorage.googleapis.com/v0/b/brainsprain-6696b.appspot.com/o/channel_cleaning_breath.png?alt=media&token=dab16abf-c11b-4ceb-b975-1c25037d4d58";

        Glide.with(getApplicationContext()).load(url7).fitCenter().into(ib7);

        String url8 = "https://firebasestorage.googleapis.com/v0/b/brainsprain-6696b.appspot.com/o/cow_pose.png?alt=media&token=5ce1ec0f-1f20-4a69-babb-68a859ef822e";

        Glide.with(getApplicationContext()).load(url8).fitCenter().into(ib8);

        String url9 = "https://firebasestorage.googleapis.com/v0/b/brainsprain-6696b.appspot.com/o/easy_pose.png?alt=media&token=3380c13f-3634-4757-86ea-934339f1d8d8";

        Glide.with(getApplicationContext()).load(url9).fitCenter().into(ib9);

        String url10 = "https://firebasestorage.googleapis.com/v0/b/brainsprain-6696b.appspot.com/o/extended_puppy_pose.png?alt=media&token=96206d89-d52c-48be-aa44-91f4731380e3";

        Glide.with(getApplicationContext()).load(url10).fitCenter().into(ib10);

        String url11 = "https://firebasestorage.googleapis.com/v0/b/brainsprain-6696b.appspot.com/o/fish_pose.png?alt=media&token=3d7fa32b-8cac-45d8-b5e8-54ae6fda0ba5";

        Glide.with(getApplicationContext()).load(url11).fitCenter().into(ib11);

        String url12 = "https://firebasestorage.googleapis.com/v0/b/brainsprain-6696b.appspot.com/o/seated_forward_bend.png?alt=media&token=4112a6f4-3895-487a-b097-41d73a05d37a";

        Glide.with(getApplicationContext()).load(url12).fitCenter().into(ib12);

        String url13 = "https://firebasestorage.googleapis.com/v0/b/brainsprain-6696b.appspot.com/o/standing_forward_bend.png?alt=media&token=a2cff09e-e3aa-444e-9e0e-9815af95c90c";

        Glide.with(getApplicationContext()).load(url13).fitCenter().into(ib13);

        String url14 = "https://firebasestorage.googleapis.com/v0/b/brainsprain-6696b.appspot.com/o/upward_salute.png?alt=media&token=64c8eb44-ee3c-4f57-8c2a-f068639b14ed";

        Glide.with(getApplicationContext()).load(url14).fitCenter().into(ib14);

        ib1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(YogaPosesList.this, BigToePose.class);
                startActivity(intent);
            }
        });

        ib2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(YogaPosesList.this, BoundAnglePose.class);
                startActivity(intent);
            }
        });

        ib3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(YogaPosesList.this, BowPose.class);
                startActivity(intent);
            }
        });

        ib4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(YogaPosesList.this, BridgePose.class);
                startActivity(intent);
            }
        });

        ib5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(YogaPosesList.this, CamelPose.class);
                startActivity(intent);
            }
        });

        ib6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(YogaPosesList.this, CatPose.class);
                startActivity(intent);
            }
        });

        ib7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(YogaPosesList.this, ChannelCleaningBreath.class);
                startActivity(intent);
            }
        });

        ib8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(YogaPosesList.this, CowPose.class);
                startActivity(intent);
            }
        });

        ib9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(YogaPosesList.this, EasyPose.class);
                startActivity(intent);
            }
        });

        ib10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(YogaPosesList.this, ExtendedPuppyPose.class);
                startActivity(intent);
            }
        });

        ib11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(YogaPosesList.this, FishPose.class);
                startActivity(intent);
            }
        });

        ib12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(YogaPosesList.this, SeatedForwardBend.class);
                startActivity(intent);
            }
        });

        ib13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(YogaPosesList.this, StandingForwardBend.class);
                startActivity(intent);
            }
        });

        ib14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(YogaPosesList.this, UpwardSalute.class);
                startActivity(intent);
            }
        });
    }
}