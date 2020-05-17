package com.example.ieapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import com.example.ieapplication.subexe.BendActivity;
import com.example.ieapplication.subexe.FlodActivity;
import com.example.ieapplication.subexe.PoseActivity;
import com.example.ieapplication.subexe.SeatedActivity;
import com.example.ieapplication.subexe.StretchActivity;
import com.example.ieapplication.subexe.TriangleActivity;

public class Exe3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exe3);
        ImageView exercise1 = (ImageView) findViewById(R.id.btntriangle);
        exercise1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Exe3Activity.this, TriangleActivity.class);
                startActivity(intent);
            }
        });
        ImageView exercise2 = (ImageView) findViewById(R.id.btnseated);
        exercise2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Exe3Activity.this, SeatedActivity.class);
                startActivity(intent);
            }
        });
        ImageView exercise3 = (ImageView) findViewById(R.id.btnpose);
        exercise3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Exe3Activity.this, PoseActivity.class);
                startActivity(intent);
            }
        });
        ImageView exercise4 = (ImageView) findViewById(R.id.btnfold);
        exercise4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Exe3Activity.this, FlodActivity.class);
                startActivity(intent);
            }
        });
        ImageView exercise5 = (ImageView) findViewById(R.id.btnstretch);
        exercise5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Exe3Activity.this, StretchActivity.class);
                startActivity(intent);
            }
        });
        ImageView exercise6 = (ImageView) findViewById(R.id.btnbend);
        exercise6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Exe3Activity.this, BendActivity.class);
                startActivity(intent);
            }
        });
        ImageButton return1=(ImageButton)findViewById(R.id.return3);
        return1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Exe3Activity.this, SuggestionActivity.class);
                startActivity(intent);
            }
        });
    }
}
