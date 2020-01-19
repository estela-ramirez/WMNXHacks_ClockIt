package com.example.appinjava;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;

import android.os.CountDownTimer;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    private TextView mTextViewCountDown;
    private Button mButtonGiveUp;
    // private Button mButtonSet;
    private TextView message;
    private TextView timeRemaining;

    private CountDownTimer mCountDownTimer;

    private boolean giveUp = false;

    private long startTimeInMillis = 20000; // set it to user's input
    private long mTimeLeftInMillis = startTimeInMillis;

       /* Calculate hour and min into miliseconds

    private double hour;
    private double min;
    private double sec;
    public NameClass(String hour, String min){
        double hourInMilliseconds = hour * 60 * 60000;
        double minInMilliseconds = min * 60000;
        startTimeInMillis = hourInMilliseconds + minInMilliseconds;
        }
    */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTextViewCountDown = findViewById(R.id.text_view_countdown);
        message = findViewById(R.id.messageDisplay);
        timeRemaining = findViewById(R.id.time_remaining_text);

        mButtonGiveUp = findViewById(R.id.button_giveup);
        //mButtonSet = findViewById(R.id.button_set);

        mButtonGiveUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    giveUp = true;
                    mCountDownTimer.cancel();
                    Intent intent = new Intent(MainActivity.this, BreakIn.class);
                    startActivity(intent);
            }
        });

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        startTimer();
    }

    private void startTimer() {
        mCountDownTimer = new CountDownTimer(mTimeLeftInMillis, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                mTimeLeftInMillis = millisUntilFinished;
                updateCountdownText();  // show the time left
            }
            @Override
            public void onFinish() {
                mButtonGiveUp.setVisibility(View.GONE);
                mTextViewCountDown.setVisibility(View.GONE);
                timeRemaining.setVisibility(View.GONE);
                message.setText("Time is Up!!");
                //mButtonSet.setVisibility(View.VISIBLE);
            }
        }.start();

        giveUp = true;
    }

//    mButtonSet.OnClickListener(new View.OnClickListener() {
//        @Override
//        public void onClick(View v){
//            Intent intent = new Intent(MainActivity.this, home.class);
//            startActivity(intent);
//        }
//    });



         private void updateCountdownText(){
                int min = (int) mTimeLeftInMillis / 60000;
                int sec = (int) mTimeLeftInMillis % 60000 / 1000;

                String timeLeft;

                timeLeft = "" + min;

                if (sec < 10){
                    timeLeft += ":0" + sec;
                }
                else {
                    timeLeft += ":" + sec;
                }
                mTextViewCountDown.setText(timeLeft);
         }
}
