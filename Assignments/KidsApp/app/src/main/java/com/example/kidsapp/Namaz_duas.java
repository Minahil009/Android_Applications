package com.example.kidsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Namaz_duas extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_namaz_duas);
    }

    public void snaa(View view) {
        Intent homeIntent = new Intent(Namaz_duas.this, Namaz_general.class);
        homeIntent.putExtra("WhichActivity","Snaa");
        startActivity(homeIntent);
    }

    public void ruku(View view) {
        Intent homeIntent = new Intent(Namaz_duas.this, Namaz_general.class);
        homeIntent.putExtra("WhichActivity","Ruku");
        startActivity(homeIntent);
    }

    public void after_ruku(View view) {
        Intent homeIntent = new Intent(Namaz_duas.this, Namaz_general.class);
        homeIntent.putExtra("WhichActivity","After_Ruku");
        startActivity(homeIntent);
    }

    public void sajda(View view) {
        Intent homeIntent = new Intent(Namaz_duas.this, Namaz_general.class);
        homeIntent.putExtra("WhichActivity","Sajda");
        startActivity(homeIntent);
    }

    public void tashhad(View view) {
        Intent homeIntent = new Intent(Namaz_duas.this,Namaz_general.class);
        homeIntent.putExtra("WhichActivity","Tashahud");
        startActivity(homeIntent);
    }

    public void darood_shareef(View view) {
        Intent homeIntent = new Intent(Namaz_duas.this, Namaz_general.class);
        homeIntent.putExtra("WhichActivity","Darood");
        startActivity(homeIntent);
    }

    public void after_darood_shareef(View view) {
        Intent homeIntent = new Intent(Namaz_duas.this, Namaz_general.class);
        homeIntent.putExtra("WhichActivity","After_Darood");
        startActivity(homeIntent);
    }

    public void salaam(View view) {
        Intent homeIntent = new Intent(Namaz_duas.this, Namaz_general.class);
        homeIntent.putExtra("WhichActivity","Salaam");
        startActivity(homeIntent);
    }

    public void qirat(View view) {
        Intent homeIntent = new Intent(Namaz_duas.this, Namaz_general.class);
        homeIntent.putExtra("WhichActivity","Qirat");
        startActivity(homeIntent);
    }
}