package com.example.ieapplication.subexe;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import com.example.ieapplication.R;
import com.example.ieapplication.SuggestionActivity;

public class SwimActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_swim);
        Button swim = (Button) findViewById(R.id.swim);
        swim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(SwimActivity.this,"One could easily argue that enjoying swimming needs to be the first tip in becoming a better swimmer. If you have negative feelings prior to a swim workout, then you are much less likely to get as much from the experience. ", Toast.LENGTH_SHORT).show();
            }
        });
        Button swim1 = (Button) findViewById(R.id.swim1);
        swim1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(SwimActivity.this,"If new to running, there has been a lengthy separation from the sport, or managing a health condition, make sure to check with your doctor for medical clearance.  ", Toast.LENGTH_SHORT).show();
            }
        });
        Button swim2 = (Button) findViewById(R.id.swim2);
        swim2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(SwimActivity.this,"None of you are getting younger, and as you age, you inherently lose muscle mass, energy and speed.Refining one’s technique is so important to improve your efficiency and combat your natural loss of physical ability.", Toast.LENGTH_SHORT).show();
            }
        });
        Button swim3 = (Button) findViewById(R.id.swim3);
        swim3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(SwimActivity.this,"While it can be advantageous to swim with others to push you harder than you can yourself, it is necessary to not be overly critical of your skill or speed. ", Toast.LENGTH_SHORT).show();
            }
        });
        Button swim4 = (Button) findViewById(R.id.swim4);
        swim4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(SwimActivity.this,"It is equally important to prepare yourself for the pool physically as it is to prepare your self psychologically", Toast.LENGTH_SHORT).show();
            }
        });
        Button swim5 = (Button) findViewById(R.id.swim5);
        swim5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(SwimActivity.this,"One could easily argue that enjoying swimming needs to be the first tip in becoming a better swimmer. If you have negative feelings prior to a swim workout, then you are much less likely to get as much from the experience ", Toast.LENGTH_SHORT).show();
            }
        });
        @SuppressLint("WrongViewCast") ImageButton back = (ImageButton) findViewById(R.id.back6);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SwimActivity.this, SuggestionActivity.class);
                startActivity(intent);
            }
        });
    }
}
