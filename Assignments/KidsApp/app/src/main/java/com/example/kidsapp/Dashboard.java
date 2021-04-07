package com.example.kidsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class Dashboard extends AppCompatActivity {

    ImageView imageView;
    Animation topAnimation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        imageView = findViewById(R.id.titleImage);
        //imageView.animate().translationXBy(-500).translationYBy(500).setDuration(2000);
        // imageView.animate().scaleY(0.7f).scaleX(0.7f).setDuration(1000);
        //make a build in animation function
        //topAnimation= AnimationUtils.loadAnimation(this,R.anim.top_animation);


    }

    public void qalma_category(View view) {
        Intent homeIntent = new Intent(Dashboard.this, sub_kalma.class);
        startActivity(homeIntent);
    }

    public void programs(View view) {
        Intent homeIntent = new Intent(Dashboard.this, programs.class);
        startActivity(homeIntent);
    }

    public void Namaz_duas(View view) {
        Intent homeIntent = new Intent(Dashboard.this, Namaz_duas.class);
        startActivity(homeIntent);
    }

    public void Quran(View view) {
        Intent homeIntent = new Intent(Dashboard.this, Quran.class);
        startActivity(homeIntent);
    }

    public void Asma_ul_Husna(View view) {
        Intent homeIntent = new Intent(Dashboard.this, Asma_ul_Husna.class);
        startActivity(homeIntent);
    }
}