package com.example.ieapplication.subexe;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

import com.example.ieapplication.R;
import com.example.ieapplication.SuggestionActivity;

public class FlodActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flod);
        ImageButton back = (ImageButton) findViewById(R.id.back14);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FlodActivity.this, SuggestionActivity.class);
                startActivity(intent);
            }
        });
    }
}
