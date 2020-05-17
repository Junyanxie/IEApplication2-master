package com.example.ieapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import com.example.ieapplication.subexe.CycActivity;
import com.example.ieapplication.subexe.GolfActivity;
import com.example.ieapplication.subexe.JogActivity;
import com.example.ieapplication.subexe.SwimActivity;
import com.example.ieapplication.subexe.TennisActivity;
import com.example.ieapplication.subexe.WalkActivity;

public class Exe1Activity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exe1);
        ImageView exercise1 = (ImageView) findViewById(R.id.btnwalk);
        exercise1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Exe1Activity.this, WalkActivity.class);
                startActivity(intent);
            }
        });
        ImageView exercise2 = (ImageView) findViewById(R.id.btnswim);
        exercise2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Exe1Activity.this, SwimActivity.class);
                startActivity(intent);
            }
        });
        ImageView exercise3 = (ImageView) findViewById(R.id.btnjog);
        exercise3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Exe1Activity.this, JogActivity.class);
                startActivity(intent);
            }
        });
        ImageView exercise4 = (ImageView) findViewById(R.id.btncyc);
        exercise4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Exe1Activity.this, CycActivity.class);
                startActivity(intent);
            }
        });
        ImageView exercise5 = (ImageView) findViewById(R.id.btnten);
        exercise5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Exe1Activity.this, TennisActivity.class);
                startActivity(intent);
            }
        });
        ImageView exercise6 = (ImageView) findViewById(R.id.btngolf);
        exercise6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Exe1Activity.this, GolfActivity.class);
                startActivity(intent);
            }
        });
        ImageButton return1=(ImageButton)findViewById(R.id.return1);
        return1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Exe1Activity.this, SuggestionActivity.class);
                startActivity(intent);
            }
        });
    }
}
