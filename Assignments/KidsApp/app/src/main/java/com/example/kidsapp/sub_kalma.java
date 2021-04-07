package com.example.kidsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class sub_kalma extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub_kalma);
    }

    public void qalma1(View view) {
        Intent homeIntent=new Intent(sub_kalma.this,Qalma1.class);
        startActivity(homeIntent);
    }

    public void qalma2(View view) {
        Intent homeIntent=new Intent(sub_kalma.this,Qalma2.class);
        startActivity(homeIntent);
    }

    public void qalma3(View view) {
        Intent homeIntent=new Intent(sub_kalma.this,Qalma3.class);
        startActivity(homeIntent);
    }

    public void qalma4(View view) {
        Intent homeIntent=new Intent(sub_kalma.this,Qalma4.class);
        startActivity(homeIntent);
    }

    public void qalma5(View view) {
        Intent homeIntent=new Intent(sub_kalma.this,Qalma5.class);
        startActivity(homeIntent);
    }

    public void qalma6(View view) {
        Intent homeIntent=new Intent(sub_kalma.this,Qalma6.class);
        startActivity(homeIntent);
    }
}