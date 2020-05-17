package com.example.ieapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class SuggestionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_suggestion);
        Button exercise1 = (Button) findViewById(R.id.btnexe1);
        exercise1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    Intent intent = new Intent(SuggestionActivity.this, Exe1Activity.class);
                startActivity(intent);
            }
        });
        Button exercise2 = (Button) findViewById(R.id.btnexe2);
        exercise2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SuggestionActivity.this, Exe2Activity.class);
                startActivity(intent);
            }
        });
        Button exercise3 = (Button) findViewById(R.id.btnexe3);
        exercise3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SuggestionActivity.this, Exe3Activity.class);
                startActivity(intent);
            }
        });
        Button exercise4 = (Button) findViewById(R.id.btnexe4);
        exercise4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SuggestionActivity.this, Exe4Activity.class);
                startActivity(intent);
            }
        });
        ImageButton return1=(ImageButton)findViewById(R.id.return6);
        return1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SuggestionActivity.this, TipActivity.class);
                startActivity(intent);
            }
        });
    }
}
