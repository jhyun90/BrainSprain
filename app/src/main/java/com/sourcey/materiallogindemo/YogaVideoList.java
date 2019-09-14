package com.sourcey.materiallogindemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

import com.bumptech.glide.Glide;
import com.sourcey.materiallogindemo.SoothingSounds.SoothingSoundsTrack2;
import com.sourcey.materiallogindemo.SoothingSounds.SoothingSoundsTrack3;
import com.sourcey.materiallogindemo.SoothingSounds.SoothingSoundsTrack5;
import com.sourcey.materiallogindemo.YogaPoses.BigToePose;
import com.sourcey.materiallogindemo.YogaPoses.EasyPose;
import com.sourcey.materiallogindemo.YogaPoses.StandingForwardBend;
import com.sourcey.materiallogindemo.YogaPoses.UpwardSalute;
import com.sourcey.materiallogindemo.YogaVideos.Funny_1;
import com.sourcey.materiallogindemo.YogaVideos.Funny_2;
import com.sourcey.materiallogindemo.YogaVideos.Funny_3;
import com.sourcey.materiallogindemo.YogaVideos.Funny_4;
import com.sourcey.materiallogindemo.YogaVideos.YogaChill;
import com.sourcey.materiallogindemo.YogaVideos.YogaForAnxietyAndStress;
import com.sourcey.materiallogindemo.YogaVideos.YogaForConcentrationAndMentalFocus;
import com.sourcey.materiallogindemo.YogaVideos.YogaForRelaxation;
import com.sourcey.materiallogindemo.YogaVideos.YogaForSelfCare;
import com.sourcey.materiallogindemo.YogaVideos.YogaForStressManagement;
import com.sourcey.materiallogindemo.YogaVideos.YogaMeditationForInnerPeace;
import com.sourcey.materiallogindemo.YogaVideos.YogaMovementMedicineCalmingPractice;
import com.sourcey.materiallogindemo.YogaVideos.YogaQuickStressFix;
import com.sourcey.materiallogindemo.YogaVideos.YogaToCalmYourNerves;

public class YogaVideoList extends AppCompatActivity {

    private ImageButton ib1, ib2, ib3, ib4, ib5,
                        ib6, ib7, ib8, ib9, ib10,
                        ib11, ib12, ib13, ib14;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.yoga_video_list);

        ib1 = (ImageButton) findViewById(R.id.ibVideo1);
        ib2 = (ImageButton) findViewById(R.id.ibVideo2);
        ib3 = (ImageButton) findViewById(R.id.ibVideo3);
        ib4 = (ImageButton) findViewById(R.id.ibVideo4);
        ib5 = (ImageButton) findViewById(R.id.ibVideo5);
        ib6 = (ImageButton) findViewById(R.id.ibVideo6);
        ib7 = (ImageButton) findViewById(R.id.ibVideo7);
        ib8 = (ImageButton) findViewById(R.id.ibVideo8);
        ib9 = (ImageButton) findViewById(R.id.ibVideo9);
        ib10 = (ImageButton) findViewById(R.id.ibVideo10);

        ib11 = (ImageButton) findViewById(R.id.ibVideo11);
        ib12 = (ImageButton) findViewById(R.id.ibVideo12);


        // yoga_chill
        String url1 = "https://firebasestorage.googleapis.com/v0/b/brainsprain-6696b.appspot.com/o/yoga_chill.png?alt=media&token=e4f4fc11-a992-4c07-9957-58f45bda64f2";

        Glide.with(getApplicationContext()).load(url1).fitCenter().into(ib1);

        // yoga_for_anxiety_and_stress
        String url2 = "https://firebasestorage.googleapis.com/v0/b/brainsprain-6696b.appspot.com/o/yoga_for_anxiety_and_stress.png?alt=media&token=64d807e8-2627-4d66-80b5-e56e3de6da24";

        Glide.with(getApplicationContext()).load(url2).fitCenter().into(ib2);

        // quick_stress_fix
        String url3 = "https://firebasestorage.googleapis.com/v0/b/brainsprain-6696b.appspot.com/o/yoga_quick_stress_fix.png?alt=media&token=7c7958d4-6b7e-4351-9eb4-583da56a198e";

        Glide.with(getApplicationContext()).load(url3).fitCenter().into(ib3);

        //CHANGE///////////////////////////////////
        // river
        String url4 = "https://firebasestorage.googleapis.com/v0/b/brainsprain-6696b.appspot.com/o/River.png?alt=media&token=819f519a-b071-4b92-83ad-70ac34538202";

        Glide.with(getApplicationContext()).load(url4).fitCenter().into(ib4);

        // rain
        String url5 = "https://firebasestorage.googleapis.com/v0/b/brainsprain-6696b.appspot.com/o/Rain.png?alt=media&token=9a08d36a-3e76-42a1-91ed-970973ca1f6c";

        Glide.with(getApplicationContext()).load(url5).fitCenter().into(ib5);

        // fireplace
        String url6 = "https://firebasestorage.googleapis.com/v0/b/brainsprain-6696b.appspot.com/o/Fireplace.png?alt=media&token=da841d8d-8af5-4803-86a4-842ffc3dc0a0";

        Glide.with(getApplicationContext()).load(url6).fitCenter().into(ib6);

        // funny2
        String url7 = "https://firebasestorage.googleapis.com/v0/b/brainsprain-6696b.appspot.com/o/funny_2.png?alt=media&token=68608705-c87a-4a1d-8e8d-4e2de11f2dea";

        Glide.with(getApplicationContext()).load(url7).fitCenter().into(ib7);

        // funny4
        String url8 = "https://firebasestorage.googleapis.com/v0/b/brainsprain-6696b.appspot.com/o/funny_4.png?alt=media&token=a4e167f3-2670-4262-96a1-c5d83db02666";

        Glide.with(getApplicationContext()).load(url8).fitCenter().into(ib8);


        // easy pose
        String url9  = "https://firebasestorage.googleapis.com/v0/b/brainsprain-6696b.appspot.com/o/easy_pose.png?alt=media&token=3380c13f-3634-4757-86ea-934339f1d8d8";

        Glide.with(getApplicationContext()).load(url9).fitCenter().into(ib9);


        // upward salute
        String url10 = "https://firebasestorage.googleapis.com/v0/b/brainsprain-6696b.appspot.com/o/upward_salute.png?alt=media&token=64c8eb44-ee3c-4f57-8c2a-f068639b14ed";

        Glide.with(getApplicationContext()).load(url10).fitCenter().into(ib10);

        // BigToePose
        String url11 = "https://firebasestorage.googleapis.com/v0/b/brainsprain-6696b.appspot.com/o/big_toe_pose.png?alt=media&token=43c7a9d2-cb12-4459-85e4-ebb15638dc31";

        Glide.with(getApplicationContext()).load(url11).fitCenter().into(ib11);

        // 4wardbend
        String url12 = "https://firebasestorage.googleapis.com/v0/b/brainsprain-6696b.appspot.com/o/standing_forward_bend.png?alt=media&token=a2cff09e-e3aa-444e-9e0e-9815af95c90c";

        Glide.with(getApplicationContext()).load(url12).fitCenter().into(ib12);

        ib1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(YogaVideoList.this, YogaChill.class);
                startActivity(intent);
            }
        });

        ib2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(YogaVideoList.this, YogaForAnxietyAndStress.class);
                startActivity(intent);
            }
        });

        ib3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(YogaVideoList.this, YogaQuickStressFix.class);
                startActivity(intent);
            }
        });

        ib4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(YogaVideoList.this, SoothingSoundsTrack2.class);
                startActivity(intent);
            }
        });

        ib5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(YogaVideoList.this, SoothingSoundsTrack5.class);
                startActivity(intent);
            }
        });


        ib6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(YogaVideoList.this, Funny_2.class);
                startActivity(intent);
            }
        });

        ib7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(YogaVideoList.this, Funny_4.class);
                startActivity(intent);
            }
        });


        ib8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(YogaVideoList.this, EasyPose.class);
                startActivity(intent);
            }
        });

        ib9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(YogaVideoList.this, UpwardSalute.class);
                startActivity(intent);
            }
        });

        ib10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(YogaVideoList.this, BigToePose.class);
                startActivity(intent);
            }
        });

        ib11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(YogaVideoList.this, StandingForwardBend.class);
                startActivity(intent);
            }
        });

    }
}