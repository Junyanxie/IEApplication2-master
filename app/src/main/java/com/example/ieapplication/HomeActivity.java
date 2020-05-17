package com.example.ieapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

public class HomeActivity extends AppCompatActivity {
    private ImageButton info_button;
    private ImageButton about_button;
    private ImageButton summary;
    private ImageButton tip;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        about_button=findViewById(R.id.imageButton6);
        info_button=findViewById(R.id.imageButton7);
        summary=findViewById(R.id.imageButton4);
        tip=findViewById(R.id.btntips);



        info_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity3();
            }
        });

        about_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity3();
            }
        });
        summary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity4();
            }
        });
        tip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity5();
            }
        });

    }
    public void openActivity3(){
        Intent intent= new Intent(this, About.class);
        startActivity(intent);
    }
    public void openActivity2(){
        Intent intent= new Intent(this, Info.class);
        startActivity(intent);
    }
    public void openActivity4(){
        Intent intent= new Intent(this, Analatics.class);
        startActivity(intent);
    }
    public void openActivity5(){
        Intent intent= new Intent(this, TipActivity.class);
        startActivity(intent);
    }
}
