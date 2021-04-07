package com.example.kidsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Quran extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quran);
    }

    public void surah_yaseen(View view) {
        Intent homeIntent = new Intent(Quran.this, surah_rehman.class);
        startActivity(homeIntent);
    }

    public void Surah_Rehman(View view) {
        Intent homeIntent = new Intent(Quran.this, Surah_yaseen.class);
        startActivity(homeIntent);
    }

    public void surah_Ikhaas(View view) {
    }

    public void surah_Naas(View view) {
    }

    public void surah_Falaq(View view) {
    }

    public void surah_Kaafiroon(View view) {
    }
}