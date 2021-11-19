package com.example.testproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import android.widget.TextView;

public class MainActivity6 extends AppCompatActivity {
    TextView textView12;
    ImageButton button15;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        button15 = findViewById(R.id.button15);
        textView12= findViewById(R.id.textView12);;


        SharedPreferences sharedPreferences = getSharedPreferences("MyPref", MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        int d = sharedPreferences.getInt("1q", 0);
        editor.apply();
        int c = sharedPreferences.getInt("2q", 0);
        editor.apply();
        int b = sharedPreferences.getInt("3q", 0);
        editor.apply();
        int a = sharedPreferences.getInt("4q", 0);
        editor.apply();
        System.out.println(d + " " + c + " " + b + " " + a);
        textView12.setText(((d+c+b+a)/4.0*100)+"%" + " правильно");

    }

    public void click(View view) {
        switch (view.getId()){
            case R.id.button15:
                SharedPreferences sharedPreferences = getSharedPreferences("MyPref", MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putInt("5q", 1);
                editor.apply();
                textView12.setVisibility(View.VISIBLE);
                break;
        }
    }
}