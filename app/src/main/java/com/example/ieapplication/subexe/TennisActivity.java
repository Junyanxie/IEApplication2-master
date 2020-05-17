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

public class TennisActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tennis);
        Button ten = (Button) findViewById(R.id.ten);
        ten.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(TennisActivity.this,"If you prefer playing in the mornings, allow plenty of time for a light breakfast and to get to the courts early for a good warm-up. ", Toast.LENGTH_SHORT).show();
            }
        });
        Button ten1 = (Button) findViewById(R.id.ten1);
        ten1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(TennisActivity.this,"Sometimes your opponents will use you as their target rather than the baseline and they will gauge the depth of their shots based on where you are standing. ", Toast.LENGTH_SHORT).show();
            }
        });
        Button ten2 = (Button) findViewById(R.id.ten2);
        ten2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(TennisActivity.this,"Your serve and returns become even more important as we get older. Body serves work well against senior players but mix it up to their backhand as well. ", Toast.LENGTH_SHORT).show();
            }
        });
        Button ten3 = (Button) findViewById(R.id.ten3);
        ten.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(TennisActivity.this,"Stationary/recumbent bike, pilates, yoga and stretching will greatly payoff and add to your tennis longevity", Toast.LENGTH_SHORT).show();
            }
        });
        @SuppressLint("WrongViewCast") ImageButton back = (ImageButton) findViewById(R.id.back7);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TennisActivity.this, SuggestionActivity.class);
                startActivity(intent);
            }
        });

    }
}
