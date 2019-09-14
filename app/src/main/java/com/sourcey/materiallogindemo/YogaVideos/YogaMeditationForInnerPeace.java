package com.sourcey.materiallogindemo.YogaVideos;

import android.media.MediaPlayer;
import android.media.MediaPlayer.OnPreparedListener;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.MediaController;
import android.widget.VideoView;

import com.sourcey.materiallogindemo.R;

public class YogaMeditationForInnerPeace extends AppCompatActivity {

    private VideoView videoView;
    private int position = 0;
    private MediaController mediaController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.yoga_meditation_for_inner_peace);

        videoView = (VideoView) findViewById(R.id.videoView);

        String str = "https://firebasestorage.googleapis.com/v0/b/brainsprain-6696b.appspot.com/o/yoga_meditation_for_inner_peace.mp4?alt=media&token=8d5fd45d-4640-4866-91e4-51022eb22e6d";

        // Set the media controller buttons
        if (mediaController == null) {
            mediaController = new MediaController(YogaMeditationForInnerPeace.this);

            // Set the videoView that acts as the anchor for the MediaController.
            mediaController.setAnchorView(videoView);

            // Set MediaController for VideoView
            videoView.setMediaController(mediaController);
        }

        try {
            // ID of video file.
            // int id = this.getRawResIdByName("core");
            videoView.setVideoURI(Uri.parse(str));
            // videoView.requestFocus();
        } catch (Exception e) {
            Log.e("Error", e.getMessage());
            e.printStackTrace();
        }

        videoView.requestFocus();

        // When the video file ready for playback.
        videoView.setOnPreparedListener(new OnPreparedListener() {

            public void onPrepared(MediaPlayer mediaPlayer) {

                videoView.seekTo(position);
                if (position == 0) {
                    videoView.start();
                }

                // When video Screen change size.
                mediaPlayer.setOnVideoSizeChangedListener(new MediaPlayer.OnVideoSizeChangedListener() {
                    @Override
                    public void onVideoSizeChanged(MediaPlayer mp, int width, int height) {

                        // Re-Set the videoView that acts as the anchor for the MediaController
                        mediaController.setAnchorView(videoView);
                    }
                });
            }
        });
    }

/*
    // Find ID corresponding to the name of the resource (in the directory raw).
    public int getRawResIdByName(String resName) {
        String pkgName = this.getPackageName();
        // Return 0 if not found.
        int resID = this.getResources().getIdentifier(resName, "raw", pkgName);
        Log.i("newbrainsprain", "Res Name: " + resName + "==> Res ID = " + resID);
        return resID;
    }
*/

    // When you change direction of phone, this method will be called.
    // It store the state of video (Current position)
    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        super.onSaveInstanceState(savedInstanceState);

        // Store current position.
        savedInstanceState.putInt("CurrentPosition", videoView.getCurrentPosition());
        videoView.pause();
    }

    // After rotating the phone. This method is called.
    @Override
    public void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);

        // Get saved position.
        position = savedInstanceState.getInt("CurrentPosition");
        videoView.seekTo(position);
    }
}