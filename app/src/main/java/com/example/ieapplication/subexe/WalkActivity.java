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

public class WalkActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_walk);
        Button walk = (Button) findViewById(R.id.walk1);
        walk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(WalkActivity.this,"It’s important not to go too hard, too fast. Remember, every little bit helps. A walk down the block can help, so don’t worry about briskly going three miles, at least not at first", Toast.LENGTH_SHORT).show();
            }
        });
        Button walk1 = (Button) findViewById(R.id.walk2);
        walk1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(WalkActivity.this,"Just as you don’t want to overestimate how far your loved one can walk, don’t feel like you need to push them to go extremely fast. Healthline recommends using the talk test.", Toast.LENGTH_SHORT).show();
            }
        });
        Button walk2 = (Button) findViewById(R.id.walk3);
        walk2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(WalkActivity.this,"As we get older, we may be more affected by particularly warm or cold days. For seniors, it may be important to find alternative options to get a walk in, even on days with bad weather. ", Toast.LENGTH_SHORT).show();
            }
        });
        Button walk3 = (Button) findViewById(R.id.walk4);
        walk3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(WalkActivity.this,"You could walk to a nearby park, go on an art walk in your community, bring around pets or grandkids, or find other ways to inspire your senior family to get up and moving.", Toast.LENGTH_SHORT).show();
            }
        });
        Button walk4 = (Button) findViewById(R.id.walk5);
        walk4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(WalkActivity.this,"Comfortable, safe walking shoes can help reduce the risk of suffering an injury or falling. Similarly, always make sure your senior dresses appropriately for the weather, wears sun protection, and always stays hydrated.", Toast.LENGTH_SHORT).show();
            }
        });
        @SuppressLint("WrongViewCast") ImageButton back = (ImageButton) findViewById(R.id.back8);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(WalkActivity.this, SuggestionActivity.class);
                startActivity(intent);
            }
        });
    }
}

