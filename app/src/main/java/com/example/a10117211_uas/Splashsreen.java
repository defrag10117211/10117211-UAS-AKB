package com.example.a10117211_uas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
//Tanggal   :8-8-2020 - 12-08-2020
//Nim		:10117211
//Nama 	    :Defrag Muhammad Al'araaf Dasmana
//Kls		:IF-7
public class Splashsreen extends AppCompatActivity {
    private int waktu=9000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splashsreen);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                //setelah loading maka akan langsung berpindah ke home activity
                Intent splashsreen=new Intent(Splashsreen.this, MainActivity.class);
                startActivity(splashsreen);
                finish();

            }
        },waktu);
    }
}