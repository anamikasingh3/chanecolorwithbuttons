package com.example.changeshapemyapp;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
Button c1;
Button c2;
Button c3;
Button c4;
Button c5;
Button c6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        c2=findViewById(R.id.c2);
        c3=findViewById(R.id.c3);
        c1=findViewById(R.id.c1);
        c4=findViewById(R.id.c4);
        c5=findViewById(R.id.c5);
        c6=findViewById(R.id.c6);

        c2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int color = ((ColorDrawable)c2.getBackground()).getColor();
                int  colorm=-color*40/100+color;
                getWindow().setNavigationBarColor(colorm); // Navigation bar the soft bottom of some phones like nexus and some Samsung note series
                getWindow().setStatusBarColor(colorm);
                ActionBar bar = getSupportActionBar();
                bar.setBackgroundDrawable(new ColorDrawable(color));
            }
        });
        c3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int color = ((ColorDrawable)c3.getBackground()).getColor();
                int  colorm=-color*40/100+color;
                getWindow().setNavigationBarColor(colorm); // Navigation bar the soft bottom of some phones like nexus and some Samsung note series
                getWindow().setStatusBarColor(colorm);
                ActionBar bar = getSupportActionBar();
                bar.setBackgroundDrawable(new ColorDrawable(color));
            }
        });
        c1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int color = ((ColorDrawable)c1.getBackground()).getColor();
                int  colorm=-color*40/100+color;
                getWindow().setNavigationBarColor(colorm); // Navigation bar the soft bottom of some phones like nexus and some Samsung note series
                getWindow().setStatusBarColor(colorm);
                ActionBar bar = getSupportActionBar();
                bar.setBackgroundDrawable(new ColorDrawable(color));
            }
        });

    }
}
