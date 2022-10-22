package com.mbairo.hospitalpequenoprincipe;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        getSupportActionBar().hide();
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {

            @Override
            public void run() {
                irParaFormLogin();
            }
        }, 2000);
    }
    private void irParaFormLogin () {
        Intent intent = new Intent(SplashScreen.this, FormLogin.class);
        startActivity(intent);
        finish();
    }
}