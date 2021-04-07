package com.example.kidsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.MediaController;
import android.widget.VideoView;

public class Videos extends AppCompatActivity {

    VideoView videoView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_videos);
/*youTubePlayerView = findViewById(R.id.youtube_player_view);
        getLifecycle().addObserver(youTubePlayerView);*/
        videoView=findViewById(R.id.videoView1);
        //set path


        Intent intent=getIntent();
        String var=intent.getStringExtra("intentVideo");

        if(var.equals("first"))
        {
           // videoView.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.float_cartoon);
            MediaController mediaController=new MediaController(this);
            mediaController.setAnchorView(videoView);
            videoView.setMediaController(mediaController);
            videoView.start();
        }

        if(var.equals("second"))
        {
            videoView.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.umar_and_hana);
            MediaController mediaController=new MediaController(this);
            mediaController.setAnchorView(videoView);
            videoView.setMediaController(mediaController);
            videoView.start();
        }
        if(var.equals("third"))
        {
            //videoView.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.windd);
            MediaController mediaController=new MediaController(this);
            mediaController.setAnchorView(videoView);
            videoView.setMediaController(mediaController);
            videoView.start();
        }
        if(var.equals("fourth"))
        {
            videoView.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.the_lie);
            MediaController mediaController=new MediaController(this);
            mediaController.setAnchorView(videoView);
            videoView.setMediaController(mediaController);
            videoView.start();
        }
        if(var.equals("fifth"))
        {
           // videoView.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.windup);
            MediaController mediaController=new MediaController(this);
            mediaController.setAnchorView(videoView);
            videoView.setMediaController(mediaController);
            videoView.start();
        }
        if(var.equals("sixth"))
        {
            videoView.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.umbrella);
            MediaController mediaController=new MediaController(this);
            mediaController.setAnchorView(videoView);
            videoView.setMediaController(mediaController);
            videoView.start();
        }


    }

}