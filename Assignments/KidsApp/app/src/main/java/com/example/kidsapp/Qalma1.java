package com.example.kidsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;

import java.util.concurrent.TimeUnit;

public class Qalma1 extends AppCompatActivity {

    TextView playerPosition,playerDuration;
    SeekBar seekBar;
    ImageView btRew,btPlay,btPause,btFF;
    MediaPlayer mp;
    Handler handler=new Handler();
    Runnable runnable;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qalma1);

        playerPosition=findViewById(R.id.player_position);
        playerDuration=findViewById(R.id.player_duration);
        seekBar=findViewById(R.id.seek_bar);
        btPlay=findViewById(R.id.bt_play);
        btRew=findViewById(R.id.bt_rew);
        btPause=findViewById(R.id.bt_pause);
        btFF=findViewById(R.id.bt_ff);
        mp= MediaPlayer.create(this, R.raw.qalma1);
        runnable=new Runnable() {
            @Override
            public void run() {
                //set progress on seekbar
                seekBar.setProgress(mp.getCurrentPosition());
                handler.postDelayed(this,500);
            }
        };
        int duration=mp.getDuration();
        String sDuration=convertformat(duration);
        playerDuration.setText(sDuration);
        btPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btPlay.setVisibility(View.GONE);
                btPause.setVisibility(View.VISIBLE);
                mp.start();
                seekBar.setMax(mp.getDuration());
                handler.postDelayed(runnable,0);
            }
        });
        btPause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btPause.setVisibility(View.GONE);
                btPlay.setVisibility(View.VISIBLE);
                mp.pause();
                handler.removeCallbacks(runnable);
            }
        });
        btFF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int currentPosition=mp.getCurrentPosition();
                int duration=mp.getDuration();
                if(mp.isPlaying()&&duration!=currentPosition)
                {
                    currentPosition=currentPosition+500;
                    playerPosition.setText(convertformat(currentPosition));
                    mp.seekTo(currentPosition);
                }
            }
        });
        btRew.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int currentPosition=mp.getCurrentPosition();
                if(mp.isPlaying()&&currentPosition>500)
                {
                    currentPosition=currentPosition-500;
                    playerPosition.setText(convertformat(currentPosition));
                    mp.seekTo(currentPosition);
                }
            }
        });
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                if(fromUser){
                    mp.seekTo(progress);
                }
                playerPosition.setText(convertformat(mp.getCurrentPosition()));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {


            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                btPause.setVisibility(View.GONE);
                btPlay.setVisibility(View.VISIBLE);
                mp.seekTo(0);
            }
        });
    }
    @SuppressLint("DefaultLocale")
    private String convertformat(int duration) {
        return String.format("%02d:%02d",
                TimeUnit.MILLISECONDS.toMinutes(duration)
                ,TimeUnit.MILLISECONDS.toSeconds(duration),
                TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(duration)));
    }
    @Override
    protected void onPause() {
        super.onPause();
        mp.release();

    }

}