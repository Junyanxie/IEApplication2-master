package com.example.ieapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import com.example.ieapplication.subexe.TaichiActivity;
import com.example.ieapplication.subexe.YogaActivity;

public class Exe4Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exe4);
        ImageView exercise1 = (ImageView) findViewById(R.id.btnyoga);
        exercise1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Exe4Activity.this, YogaActivity.class);
                startActivity(intent);
            }
        });
        ImageView exercise = (ImageView) findViewById(R.id.btntaichi);
        exercise.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Exe4Activity.this, TaichiActivity.class);
                startActivity(intent);
            }
        });
        ImageButton return1=(ImageButton)findViewById(R.id.return4);
        return1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Exe4Activity.this, SuggestionActivity.class);
                startActivity(intent);
            }
        });
    }
}
