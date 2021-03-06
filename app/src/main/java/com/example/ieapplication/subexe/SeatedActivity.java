package com.example.ieapplication.subexe;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

import com.example.ieapplication.R;
import com.example.ieapplication.SuggestionActivity;

public class SeatedActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seated);
        ImageButton back = (ImageButton) findViewById(R.id.back12);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SeatedActivity.this, SuggestionActivity.class);
                startActivity(intent);
            }
        });
    }
}
