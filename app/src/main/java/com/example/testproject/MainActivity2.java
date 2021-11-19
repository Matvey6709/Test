package com.example.testproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity2 extends AppCompatActivity implements View.OnTouchListener {
    Button button1;
    Button button2;
    Button button3;
    Button button4;
    Button button6;
    Button button7;
    Button button8;
    Button button9;
    Button button91;
    Button button10;
    ImageButton button11;
    ImageButton button12;
    ImageButton button13;
    ImageView button14;
    ImageView button14_2;
    ImageButton imageButton1;
    ImageButton imageButton2;
    ImageButton imageButto2;
    LinearLayout linearLayout1;
    LinearLayout linearLayout2;
    ConstraintLayout constraintLayout;
    TextView textView6;
    TextView textView;
    TextView textView9;
    public boolean _1_ = false;
    SharedPreferences sharedPreferences;
    TextView tv;
    ImageButton bg2;
    int st = 0;
    boolean g = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
       button1 = findViewById(R.id.button1);
       button2 = findViewById(R.id.button2);
       button3 = findViewById(R.id.button3);
       button4 = findViewById(R.id.button4);
       button6 = findViewById(R.id.button6);
       button7 = findViewById(R.id.button7);
       button8 = findViewById(R.id.button8);
       button9 = findViewById(R.id.button9);
       button10 = findViewById(R.id.button10);
       button11 = findViewById(R.id.button11);
       button12 = findViewById(R.id.button12);
       button13 = findViewById(R.id.button13);
       button14 = findViewById(R.id.button14);
       button14_2 = findViewById(R.id.button14_2);
       textView = findViewById(R.id.textView);
       imageButton1 = findViewById(R.id.imageButton1);
       imageButton2 = findViewById(R.id.imageButton2);
       imageButto2 = findViewById(R.id.imageButto2);
       linearLayout1 = findViewById(R.id.linearLayout1);
       constraintLayout = findViewById(R.id.bac);
       constraintLayout.setVisibility(View.GONE);
       textView6 = findViewById(R.id.textView6);
       textView9 = findViewById(R.id.textView9);
        sharedPreferences = getSharedPreferences("MyPref", MODE_PRIVATE);
       SharedPreferences.Editor editor = sharedPreferences.edit();
       bg2 = findViewById(R.id.bvg2);
       tv = findViewById(R.id.textTv);
       tv.setOnTouchListener(this);

        button1.setTextColor(Color.RED);
        button2.setTextColor(Color.WHITE);
        button3.setTextColor(Color.WHITE);
        button4.setTextColor(Color.WHITE);
        button6.setTextColor(Color.WHITE);
        button14.setVisibility(View.VISIBLE);
        button14_2.setVisibility(View.GONE);
        textView6.setVisibility(View.GONE);

        if(sharedPreferences.getInt("nas1", 0) == 1){
            Button();
        }

    }
    public void click(View view) {
        sharedPreferences = getSharedPreferences("MyPref", MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        Intent inten = new Intent(MainActivity2.this, MainActivity3.class);
        switch (view.getId()){
            case R.id.imageButton1:
                    textView9.setVisibility(View.VISIBLE);
                    imageButton1.setVisibility(View.GONE);
                    imageButto2.setVisibility(View.VISIBLE);
                break;
            case R.id.imageButto2:
                textView9.setVisibility(View.GONE);
                imageButton1.setVisibility(View.VISIBLE);
                imageButto2.setVisibility(View.GONE);
                break;
            case R.id.imageButton2:
                Intent intent = new Intent(this, MainActivity.class);
                startActivity(intent);
                break;
            case R.id.bvg2:
            case R.id.close:
                    constraintLayout.setVisibility(View.GONE);
//                    Animation animation = AnimationUtils.loadAnimation(this, R.anim.trans);
//                    constraintLayout.startAnimation(animation);
                    bg2.setVisibility(View.GONE);
                    tv.setVisibility(View.VISIBLE);
                break;
            case  R.id.button11:
                st = 1;
                a(1);
                break;
            case  R.id.button12:
                st = 2;
                a(2);
                break;
            case  R.id.button13:
                st = 3;
                a(3);
                break;
            case  R.id.button14:
                editor.putInt("nas1", 1);
                editor.apply();
                switch (st){
                    case 2:
                        Button();
                        _1_ = true;
                        Toast.makeText(MainActivity2.this, "правильно!!!", Toast.LENGTH_SHORT).show();

                        break;
                    case 1:
                    case 3:
                        _1_ = false;
                        Button();
                        Toast.makeText(MainActivity2.this, "неправильно!!!", Toast.LENGTH_SHORT).show();
                        break;
                    case 0:
                        Toast.makeText(MainActivity2.this, "Выбери вариант ответа", Toast.LENGTH_SHORT).show();
                        break;
                }
                if(_1_ == true){
                    editor.putInt("1q", 1);
                    editor.apply();
                }else{
                    editor.putInt("1q", 0);
                    editor.apply();
                }


                break;
            case  R.id.button14_2:
                startActivity(inten);

                break;

            case R.id.button1:
                Intent intent1 = new Intent(this, MainActivity2.class);
                startActivity(intent1);
                break;
            case  R.id.button2:
                Intent intent2 = new Intent(this, MainActivity3.class);
                startActivity(intent2);
                break;
            case R.id.button3:
                Intent intent3 = new Intent(this, MainActivity4.class);
                startActivity(intent3);
                break;
            case R.id.button4:
                Intent intent4 = new Intent(this, MainActivity5.class);
                startActivity(intent4);
                break;
            case R.id.button16:
                Intent ntent1 = new Intent(this, MainActivity2.class);
                startActivity(ntent1);

                editor.remove("nas");
                editor.apply();
                editor.remove("nas1");
                editor.apply();
                editor.remove("nas3");
                editor.apply();
                editor.remove("nas4");
                editor.apply();
                editor.remove("1q");
                editor.apply();
                editor.remove("2q");
                editor.apply();
                editor.remove("3q");
                editor.apply();
                editor.remove("4q");
                editor.apply();
                editor.remove("5q");
                editor.apply();
                break;
        }
    }

    @Override
    public boolean onTouch(View v, MotionEvent event) {
        switch (event.getAction()) {
//            case MotionEvent.ACTION_DOWN: // нажатие
//                sDown = "Down: " + x + "," + y;
//                sMove = ""; sUp = "";
//                break;
            case MotionEvent.ACTION_MOVE:
                // движение
                    constraintLayout.setVisibility(View.VISIBLE);
                    Animation animation = AnimationUtils.loadAnimation(this, R.anim.trans);
                    constraintLayout.startAnimation(animation);
                    bg2.setVisibility(View.VISIBLE);
                    tv.setVisibility(View.GONE);
                break;
//            case MotionEvent.ACTION_UP:
                // отпускание
//            case MotionEvent.ACTION_CANCEL:
//                sMove = "";
//                sUp = "Up: " + x + "," + y;
//                break;
        }
        //tv.setText(sDown + "\n" + sMove + "\n" + sUp);
        return true;
    }

    public void Button(){
        button11.setClickable(false);
        button12.setClickable(false);
        button13.setClickable(false);
        button12.setBackgroundResource(R.drawable.fields2true);
        button11.setBackgroundResource(R.drawable.fields3false);
        button13.setBackgroundResource(R.drawable.fields3false);
        textView6.setVisibility(View.VISIBLE);
        button14_2.setVisibility(View.VISIBLE);
    }

    public void  a(int a){
        switch (a){
                case 1:
                    button11.setBackgroundResource(R.drawable.fields2);
                    button12.setBackgroundResource(R.drawable.fields3);
                    button13.setBackgroundResource(R.drawable.fields3);
                break;
                case 2:
                    button12.setBackgroundResource(R.drawable.fields2);
                    button11.setBackgroundResource(R.drawable.fields3);
                    button13.setBackgroundResource(R.drawable.fields3);
                break;
                case 3:
                    button13.setBackgroundResource(R.drawable.fields2);
                    button11.setBackgroundResource(R.drawable.fields3);
                    button12.setBackgroundResource(R.drawable.fields3);
                break;
        }
    }


}