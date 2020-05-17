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

public class CycActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cyc);
        Button cyc = (Button) findViewById(R.id.cyc);
        cyc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(CycActivity.this,"While you might be ambitious to stay consistent, it is still important to allow your body the rest it needs for proper recovery.", Toast.LENGTH_SHORT).show();
            }
        });
        Button cyc1 = (Button) findViewById(R.id.cyc1);
        cyc1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(CycActivity.this,"Make sure that it’s in top condition when you ride. Having it examined and maintained by a professional will help prevent accidents from equipment malfunction", Toast.LENGTH_SHORT).show();
            }
        });
        Button cyc2 = (Button) findViewById(R.id.cyc2);
        cyc2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(CycActivity.this,"Don’t push yourself too hard while you’re cycling. Choose a route that’s not too strenuous, and don’t ignore the pain.  ", Toast.LENGTH_SHORT).show();
            }
        });
        Button cyc3 = (Button) findViewById(R.id.cyc3);
        cyc3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(CycActivity.this,"If balance is an issue, consider taking a spinning class or riding a stationary bike in a gym, a fitness center or your own living room. Ask for help mounting and dismounting the bicycle if you need it. ", Toast.LENGTH_SHORT).show();
            }
        });
        Button cyc4 = (Button) findViewById(R.id.cyc4);
        cyc4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(CycActivity.this,"Your body will perform better when you’re getting enough rest. This means that you should be taking care to get plenty of high-quality sleep. If you’re cycling hard a few days a week, make sure that you take some days off. ", Toast.LENGTH_SHORT).show();
            }
        });
        @SuppressLint("WrongViewCast") ImageButton back = (ImageButton) findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CycActivity.this, SuggestionActivity.class);
                startActivity(intent);
            }
        });
    }
}
