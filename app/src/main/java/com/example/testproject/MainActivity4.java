package com.example.testproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.graphics.Color;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity4 extends AppCompatActivity implements View.OnTouchListener{
    Button button1;
    Button button2;
    Button button3;
    Button button4;
    Button button6;
    Button button7;
    Button button8;
    Button button9;
    Button button10;
    ImageView button14;
    ImageView button14_2;
    ImageButton imageButton1;
    ImageButton imageButton2;
    LinearLayout linearLayout1;
    LinearLayout linearLayout2;
    ConstraintLayout constraintLayout;
    TextView textView6;
    TextView textView;
    public boolean _3_ = false;
    SharedPreferences sharedPreferences;
    TextView tv;
    ImageButton bg2;
    int st = 0;
    int st2 = 0;
    int st3 = 0;
    int st4 = 0;
    int st5 = 0;
    int st6 = 0;
    boolean g = false;
    EditText editText;
    String q = "toast";
    String q2 = "Ведите текст";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
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

        button3.setTextColor(Color.RED);
        button1.setTextColor(Color.WHITE);
        button2.setTextColor(Color.WHITE);
        button4.setTextColor(Color.WHITE);
        button6.setTextColor(Color.WHITE);
        button14.setVisibility(View.VISIBLE);
        button14_2.setVisibility(View.GONE);
        textView6.setVisibility(View.GONE);
        editText = findViewById(R.id.editTextTextPersonName);

        sharedPreferences = getSharedPreferences("MyPref", MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
//        editor.remove("nas");
//        editor.apply();
//        editor.remove("nas1");
//        editor.apply();

        if(sharedPreferences.getInt("nas3", 0) == 1){
            editText.setText(q);
            Button();
        }



    }

    public void click(View view) {
        sharedPreferences = getSharedPreferences("MyPref", MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
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
                editor.putInt("nas3", 1);
                editor.apply();
                if(editText.getText().toString().equals(q2)){
                    Toast.makeText(this, "Введите текст", Toast.LENGTH_SHORT).show();
                }else if(editText.getText().toString().toLowerCase().equals(q)){
                    Button();
                    _3_ = true;
                    Toast.makeText(this, "правильно!!!", Toast.LENGTH_SHORT).show();
                }else{
                    _3_ = false;
                    Button();
                    Toast.makeText(this, "неправильно!!!", Toast.LENGTH_SHORT).show();
                }
                if(_3_ == true){
                    editor.putInt("3q", 1);
                    editor.apply();
                }else{
                    editor.putInt("3q", 0);
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

                Intent intent1 = new Intent(MainActivity4.this, MainActivity5.class);
                startActivity(intent1);
//                editor.remove("2q");
//                editor.remove("1q");
//                editor.apply();

                break;
            case R.id.button1:
                Intent inten1 = new Intent(MainActivity4.this, MainActivity2.class);
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
                Intent ntent1 = new Intent(this, MainActivity4.class);
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
//        .setClickable(false);
//        .setClickable(false);
//        .setClickable(false);
//        .setClickable(false);
//        .setClickable(false);
//        .setClickable(false);
//        .setBackgroundResource(R.drawable.fields2true);
//        .setBackgroundResource(R.drawable.fields3false);
//        .setBackgroundResource(R.drawable.fields3false);
//        .setBackgroundResource(R.drawable.fields2true);
//        .setChecked(false);
//        .setChecked(true);
//        .setChecked(false);
//        .setChecked(false);
//        .setChecked(false);
//        .setChecked(true);
//        .setBackgroundResource(R.drawable.fields3false);
//        .setBackgroundResource(R.drawable.fields3false);
        textView6.setVisibility(View.VISIBLE);
        button14_2.setVisibility(View.VISIBLE);
    }


}