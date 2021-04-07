package com.example.kidsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.MediaController;
import android.widget.VideoView;

//import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView;

public class programs extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_programs);

    }





    public void first_video(View view) {
        Intent homeIntent = new Intent(programs.this, Videos.class);
        homeIntent.putExtra("intentVideo","first");
        startActivity(homeIntent);
    }

    public void second_video(View view) {
        Intent homeIntent = new Intent(programs.this, Videos.class);
        homeIntent.putExtra("intentVideo","second");
        startActivity(homeIntent);
    }

    public void Third_video(View view) {
        Intent homeIntent = new Intent(programs.this, Videos.class);
        homeIntent.putExtra("intentVideo","third");
        startActivity(homeIntent);
    }

    public void Forth_video(View view) {
        Intent homeIntent = new Intent(programs.this, Videos.class);
        homeIntent.putExtra("intentVideo","fourth");
        startActivity(homeIntent);
    }

    public void Fifth_video(View view) {
        Intent homeIntent = new Intent(programs.this, Videos.class);
        homeIntent.putExtra("intentVideo","fifth");
        startActivity(homeIntent);
    }

    public void Sixth_video(View view) {
        Intent homeIntent = new Intent(programs.this, Videos.class);
        homeIntent.putExtra("intentVideo","sixth");
        startActivity(homeIntent);
    }
}