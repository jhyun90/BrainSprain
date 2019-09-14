package com.sourcey.materiallogindemo.YogaPoses;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.sourcey.materiallogindemo.R;

public class BigToePose extends AppCompatActivity {

    private ImageView imageView;
    // private Context context;

/*
    private FirebaseDatabase database;
    private DatabaseReference mReference;
    private DatabaseReference childReference;
    */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bigtoepose);

        imageView = findViewById(R.id.imageView);

        String url = "https://firebasestorage.googleapis.com/v0/b/brainsprain-6696b.appspot.com/o/big_toe_pose.png?alt=media&token=43c7a9d2-cb12-4459-85e4-ebb15638dc31";

        Glide.with(getApplicationContext()).load(url).centerCrop().into(imageView);

        // context = this;
    /*
        database = FirebaseDatabase.getInstance();
        mReference = database.getReference("YogaPose");
        childReference = mReference.child("01").child("imageUrl");
        */
    }

/*
    @Override
    protected void onStart() {
        super.onStart();
        childReference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String url = dataSnapshot.getValue(String.class);
                imageView.setImageURI(Uri.parse(url));
                //Picasso.get()
                //        .load(url)
                //        .into(imageView);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
    }
    */
}