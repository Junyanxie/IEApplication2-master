package com.example.ieapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import com.example.ieapplication.subexe.LiftActivity;
import com.example.ieapplication.subexe.PlankActivity;
import com.example.ieapplication.subexe.PushActivity;

public class Exe2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exe2);
        ImageView exercise1 = (ImageView) findViewById(R.id.btnpush);
        exercise1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Exe2Activity.this, PushActivity.class);
                startActivity(intent);
            }
        });
        ImageView exercise2 = (ImageView) findViewById(R.id.btnplank);
        exercise2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Exe2Activity.this, PlankActivity.class);
                startActivity(intent);
            }
        });
        ImageView exercise3 = (ImageView) findViewById(R.id.btnlift);
        exercise3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Exe2Activity.this, LiftActivity.class);
                startActivity(intent);
            }
        });
        ImageButton return1=(ImageButton)findViewById(R.id.return2);
        return1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Exe2Activity.this, SuggestionActivity.class);
                startActivity(intent);
            }
        });
    }
}
