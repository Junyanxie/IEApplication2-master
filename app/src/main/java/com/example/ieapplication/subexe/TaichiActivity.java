package com.example.ieapplication.subexe;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

import com.example.ieapplication.R;
import com.example.ieapplication.SuggestionActivity;

public class TaichiActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_taichi);
        @SuppressLint("WrongViewCast") ImageButton back = (ImageButton) findViewById(R.id.back10);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TaichiActivity.this, SuggestionActivity.class);
                startActivity(intent);
            }
        });
    }
}
