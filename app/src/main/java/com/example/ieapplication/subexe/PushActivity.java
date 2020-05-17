package com.example.ieapplication.subexe;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

import com.example.ieapplication.R;
import com.example.ieapplication.SuggestionActivity;

public class PushActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_push);
        @SuppressLint("WrongViewCast") ImageButton back = (ImageButton) findViewById(R.id.back5);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PushActivity.this, SuggestionActivity.class);
                startActivity(intent);
            }
        });
    }
}
