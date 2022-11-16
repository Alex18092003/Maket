package com.example.maket;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.ViewTreeObserver;
import android.window.SplashScreen;

public class MainActivity extends AppCompatActivity {
    private final int SPLASH_DISPLAY_LENGHT = 5000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//заставка
        new Handler().postDelayed(new Runnable() {
                                      @Override
                                      public void run() {
                                          Intent mainIntent = new Intent(MainActivity.this, LogIn.class);
                                          MainActivity.this.startActivity(mainIntent);
                                          MainActivity.this.finish();
                                      }
                                  }, SPLASH_DISPLAY_LENGHT);
    }
}