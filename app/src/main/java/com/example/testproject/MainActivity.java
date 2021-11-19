package com.example.testproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button start;
    TextView textView7;
    TextView textView8;

    SharedPreferences sharedPreferences;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         start = findViewById(R.id.button);
         textView7 = findViewById(R.id.textView7);
         textView8 = findViewById(R.id.textView8);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        sharedPreferences = getSharedPreferences("MyPref", MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        int q2 = sharedPreferences.getInt("4q", 0);
        editor.apply();
        if(q2 == 1){
            start.setText("Посмотреть \n ответы");
            textView7.setText("Вы уже прошли этот тест");
            textView8.setText("У вас была одна попытка");
        }

        start = findViewById(R.id.button);
    }

    public void click(View view) {
        sharedPreferences = getSharedPreferences("MyPref", MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        switch (view.getId()){
            case R.id.button:
                Intent intent;
                intent = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(intent);
                break;

        }
    }
}