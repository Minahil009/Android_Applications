package com.example.kidsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    ImageView imageView;
    TextView textView;
    private static int SPLASH_TIME_OUT=3000;
    Animation topAnimation;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView =findViewById(R.id.imageView);
        textView =findViewById(R.id.LogoNameAnimation);
        //2circles completed on 720
        imageView.animate().rotation(720).setDuration(30000);
        //make a build in animation function
        topAnimation= AnimationUtils.loadAnimation(this,R.anim.top_animation);

        //set animation on it
        textView.setAnimation(topAnimation);
        // then make an handler for delay to move to next activity
        new Handler().postDelayed(new Runnable() {
            //then call run build in function to to move to next activity
            @Override
            public void run() {
                Intent homeIntent=new Intent(MainActivity.this,Dashboard.class);
                startActivity(homeIntent);
                finish();
            }
        },SPLASH_TIME_OUT);
    }

}