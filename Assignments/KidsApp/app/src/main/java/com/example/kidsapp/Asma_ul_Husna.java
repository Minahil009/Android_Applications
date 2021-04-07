package com.example.kidsapp;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

import java.util.concurrent.TimeUnit;

public class Asma_ul_Husna extends AppCompatActivity {

    VideoView videoView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_asma_ul_husna);
        videoView=findViewById(R.id.videoView1);
        videoView.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.asma_ul_husna);
        MediaController mediaController=new MediaController(this);
        mediaController.setAnchorView(videoView);
        videoView.setMediaController(mediaController);
        videoView.start();


    }
}