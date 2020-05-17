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

public class JogActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jog);
        Button jog = (Button) findViewById(R.id.jog);
        jog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(JogActivity.this,"If new to running, there has been a lengthy separation from the sport, or managing a health condition, make sure to check with your doctor for medical clearance. ", Toast.LENGTH_SHORT).show();
            }
        });
        Button jog1 = (Button) findViewById(R.id.jog1);
        jog1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(JogActivity.this,"Jogging is a fairly convenient exercise, as it can be completed virtually anywhere without required equipment. However, it is important to wear the appropriate attire, especially when it comes to choosing the right type of shoe.", Toast.LENGTH_SHORT).show();
            }
        });
        Button jog2 = (Button) findViewById(R.id.jog2);
        jog2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(JogActivity.this,"While you might be eager to start your running program, easy does it when it comes to gearing into any type of exercise regimen.  ", Toast.LENGTH_SHORT).show();
            }
        });
        Button jog3 = (Button) findViewById(R.id.jog3);
        jog3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(JogActivity.this,"Warm up for approximately five to 10 minutes, or enough time to get the blood and oxygen flowing to warm the muscles. After a run, a light, 10-minute cool-down allows heart rate to decline back to normal, along with encouraging blood flow and removing lactic acid from your body.  ", Toast.LENGTH_SHORT).show();
            }
        });
        Button jog4 = (Button) findViewById(R.id.jog4);
        jog4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(JogActivity.this,"Keeping your knees stable can help you gain more power in your pedal stroke and prevent them from aching when you’ve finished your ride.", Toast.LENGTH_SHORT).show();
            }
        });
        @SuppressLint("WrongViewCast") ImageButton back = (ImageButton) findViewById(R.id.back2);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(JogActivity.this, SuggestionActivity.class);
                startActivity(intent);
            }
        });
    }
}
