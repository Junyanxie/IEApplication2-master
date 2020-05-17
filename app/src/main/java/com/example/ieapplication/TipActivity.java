package com.example.ieapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class TipActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tip);
        ImageView suggest = (ImageView) findViewById(R.id.btnexercise);
        suggest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TipActivity.this, SuggestionActivity.class);
                startActivity(intent);
            }
        });
        ImageView weather = (ImageView) findViewById(R.id.btnweather);
        weather.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TipActivity.this, WeatherActivity.class);
                startActivity(intent);
            }
        });
        ImageButton home = (ImageButton) findViewById(R.id.home);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TipActivity.this, About.class);
                startActivity(intent);
            }
        });
        ImageButton home1 = (ImageButton) findViewById(R.id.home1);
        home1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TipActivity.this, HomeActivity.class);
                startActivity(intent);
            }
        });

        ImageButton home111 = (ImageButton) findViewById(R.id.home111);
        home111.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TipActivity.this, Info.class);
                startActivity(intent);
            }
        });
        ImageView food = (ImageView) findViewById(R.id.btnfood);
        food.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TipActivity.this, FoodActivity.class);
                startActivity(intent);
            }
        });
    }
}
