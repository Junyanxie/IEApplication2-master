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

public class GolfActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_golf);
        Button golf = (Button) findViewById(R.id.golf);
        golf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(GolfActivity.this,"The diminishing ability to turn back need not affect the power of your swing. As with throwing the ball, the power lies in the follow-through. Poor follow-throughs are often the consequence of what has gone before.  ", Toast.LENGTH_SHORT).show();
            }
        });
        Button golf1 = (Button) findViewById(R.id.golf1);
        golf1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(GolfActivity.this,"Loss of full movement causes a loss of turn and power. To overcome this, find a better way to transfer your weight. I like to refer to this as creating an extended circle of power. ", Toast.LENGTH_SHORT).show();
            }
        });
        Button golf2 = (Button) findViewById(R.id.golf2);
        golf2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(GolfActivity.this,"Unless you have an obstacle to go over, such as rough or a bunker, always take the easy option and run the ball in. It is so much easier to control. Personally, I use my hybrid as I find the shape of the head makes it so much easier to achieve a consistent strike. ", Toast.LENGTH_SHORT).show();
            }
        });
        Button golf3 = (Button) findViewById(R.id.golf3);
        golf3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(GolfActivity.this,"The idea here is very straightforward as it replicates the position you should be in when you strike the ball. Stand with your leading foot against the wall.  ", Toast.LENGTH_SHORT).show();
            }
        });
        Button golf4 = (Button) findViewById(R.id.golf4);
        golf4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(GolfActivity.this,"Take a wedge and extend the shaft with an alignment stick. Grip the club with the extension resting against your front side. Swing back and through ensuring that the shaft extension doesn’t leave your side. ", Toast.LENGTH_SHORT).show();
            }
        });
        @SuppressLint("WrongViewCast") ImageButton back = (ImageButton) findViewById(R.id.back1);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(GolfActivity.this, SuggestionActivity.class);
                startActivity(intent);
            }
        });
    }
}
