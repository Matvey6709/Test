package com.example.testproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.ActivityCompat;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.graphics.Color;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity3 extends AppCompatActivity implements View.OnTouchListener {
    Button button1;
    Button button2;
    Button button3;
    Button button4;
    Button button6;
    Button button7;
    Button button8;
    Button button9;
    Button button10;
    CheckBox CheckBox1;
    CheckBox CheckBox2;
    CheckBox CheckBox3;
    CheckBox CheckBox4;
    CheckBox CheckBox5;
    CheckBox CheckBox6;
    ImageView button14;
    ImageView button14_2;
    ImageButton imageButton1;
    ImageButton imageButton2;
    LinearLayout linearLayout1;
    LinearLayout linearLayout2;
    ConstraintLayout constraintLayout;
    TextView textView6;
    TextView textView;
    public boolean _2_ = false;
    SharedPreferences sharedPreferences;
    TextView tv;
    ImageButton bg2;
    int st = 0;
    int st2 = 0;
    int st3 = 0;
    int st4 = 0;
    int st5 = 0;
    int st6 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
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
        CheckBox1 = findViewById(R.id.CheckBox1);
        CheckBox2 = findViewById(R.id.CheckBox2);
        CheckBox3 = findViewById(R.id.CheckBox3);
        CheckBox4 = findViewById(R.id.CheckBox4);
        CheckBox5 = findViewById(R.id.CheckBox5);
        CheckBox6 = findViewById(R.id.CheckBox6);
        button14 = findViewById(R.id.button14);
        button14_2 = findViewById(R.id.button14_2);
        textView = findViewById(R.id.textView);
        imageButton1 = findViewById(R.id.imageButton1);
        imageButton2 = findViewById(R.id.imageButton2);
        linearLayout1 = findViewById(R.id.linearLayout1);
        constraintLayout = findViewById(R.id.bac);
        constraintLayout.setVisibility(View.GONE);
        textView6 = findViewById(R.id.textView6);
        bg2 = findViewById(R.id.bvg2);
        tv = findViewById(R.id.textTv);
        tv.setOnTouchListener(this);

        button2.setTextColor(Color.RED);
        button1.setTextColor(Color.WHITE);
        button3.setTextColor(Color.WHITE);
        button4.setTextColor(Color.WHITE);

        button6.setTextColor(Color.WHITE);
        button14.setVisibility(View.VISIBLE);
        button14_2.setVisibility(View.GONE);
        textView6.setVisibility(View.GONE);



        sharedPreferences = getSharedPreferences("MyPref", MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
//        editor.remove("nas");
//        editor.apply();
//        editor.remove("nas1");
//        editor.apply();

        if(sharedPreferences.getInt("nas", 0) == 1){
            Button();
        }

        CheckBox1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    //sharedPreferences = getPreferences(Context.MODE_PRIVATE);
                    sharedPreferences = getSharedPreferences("MyPref", MODE_PRIVATE);
                    SharedPreferences.Editor editor = sharedPreferences.edit();
                    editor.commit();
                    System.out.println(sharedPreferences.getInt("q1", 2));
                    editor.commit();
                    st = 1;
                }

                else
                    st = 0;

            }});
        CheckBox2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked)
                    st2 = 1;
                else
                    st2 = 0;

            }});
        CheckBox3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked)
                    st3 = 1;
                else
                    st3 = 0;

            }});
        CheckBox4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked)
                    st4 = 1;
                else
                    st4 = 0;
            }});
        CheckBox5.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked)
                    st5 = 1;
                else
                    st5 = 0;
            }});
        CheckBox6.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked)
                    st6 = 1;
                else
                    st6 = 0;

            }});


    }

    public void click(View view) {
        sharedPreferences = getSharedPreferences("MyPref", MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        Intent inten = new Intent(MainActivity3.this, MainActivity4.class);
        switch (view.getId()){
            case R.id.imageButton1:
                imageButton1.setVisibility(View.GONE);
                imageButton2.setVisibility(View.VISIBLE);
                linearLayout1.setVisibility(View.VISIBLE);
                linearLayout2.setVisibility(View.VISIBLE);
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
            case  R.id.button14:
                editor.putInt("nas", 1);
                editor.apply();
                if(st == 1 && st4 == 1 && st3 == 0 && st2 == 0 && st6 == 0 && st5 == 1){
                    Button();
                    _2_ = true;
                    Toast.makeText(this, "правильно!!!", Toast.LENGTH_SHORT).show();
                }else{
                    _2_ = false;
                    Button();

                    Toast.makeText(this, "неправильно!!!", Toast.LENGTH_SHORT).show();
                }
                if(_2_ == true){
                    editor.putInt("2q", 1);
                    editor.apply();
                }else{
                    editor.putInt("2q", 0);
                    editor.apply();
                }

//                switch (st){
//                    case 0:
//
//
//
//                        break;
//                    case 1:
//                    case 3:
//                        Button();
//
//
//                        break;
//                    case 2:
//                        Toast.makeText(this, "Выбери вариант ответа", Toast.LENGTH_SHORT).show();
//                        break;
//                }

//                String name = sharedPreferences.getString("name", "unknown");
//                int age = sharedPreferences.getInt("q1", 0);
//                textView.setText(name + age);
//                editor.remove("name");
//                editor.apply();
                break;
            case  R.id.button14_2:
                startActivity(inten);

                break;
            case R.id.button1:
                Intent inten1 = new Intent(MainActivity3.this, MainActivity2.class);
                startActivity(inten1);
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
                Intent ntent1 = new Intent(this, MainActivity3.class);
                startActivity(ntent1);
                editor.remove("nas");
                editor.apply();
                editor.remove("nas1");
                editor.apply();
                editor.remove("nas3");
                editor.apply();
                editor.remove("nas4");
                editor.apply();
                editor.remove("5q");
                editor.apply();
                editor.remove("4q");
                editor.apply();
                editor.remove("3q");
                editor.apply();
                editor.remove("2q");
                editor.apply();
                editor.remove("1q");
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
        CheckBox1.setClickable(false);
        CheckBox2.setClickable(false);
        CheckBox3.setClickable(false);
        CheckBox4.setClickable(false);
        CheckBox5.setClickable(false);
        CheckBox6.setClickable(false);
        CheckBox4.setBackgroundResource(R.drawable.fields2true);
        CheckBox5.setBackgroundResource(R.drawable.fields2true);
        CheckBox6.setBackgroundResource(R.drawable.fields3false);
        CheckBox1.setBackgroundResource(R.drawable.fields2true);
        CheckBox2.setChecked(false);
        CheckBox1.setChecked(true);
        CheckBox3.setChecked(false);
        CheckBox5.setChecked(true);
        CheckBox6.setChecked(false);
        CheckBox4.setChecked(true);
        CheckBox2.setBackgroundResource(R.drawable.fields3false);
        CheckBox3.setBackgroundResource(R.drawable.fields3false);
        textView6.setVisibility(View.VISIBLE);
        button14_2.setVisibility(View.VISIBLE);
    }
}