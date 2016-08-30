package com.example.abhi.timerthread;

import android.os.CountDownTimer;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.concurrent.SynchronousQueue;

public class MainActivity extends AppCompatActivity {
    TextView tvTime;
    Button btShowtime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvTime = (TextView) findViewById(R.id.tv1);
        btShowtime=(Button) findViewById(R.id.btn1);
        btShowtime.setOnClickListener(new View.OnClickListener()
        {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                startTimer(200000);
            }

        });
    }
    private void startTimer(long time){
        CountDownTimer counter = new CountDownTimer(30000, 1000){
            public void onTick(long millisUntilDone){

                Log.d("counter_label", "Counter text should be changed");
                getCurrentTime();


            }

            public void onFinish() {
                tvTime.setText("DONE!");

            }
        }.start();
    }


    public void getCurrentTime() {

        DateFormat df = new SimpleDateFormat("HH:mm:ss");
        String date = df.format(Calendar.getInstance().getTime());
        tvTime.setText(date);

    }
    }

