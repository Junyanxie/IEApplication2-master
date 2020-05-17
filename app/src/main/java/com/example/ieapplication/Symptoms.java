package com.example.ieapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.SeekBar;
import android.widget.Toast;

import com.warkiz.widget.IndicatorSeekBar;
import com.warkiz.widget.OnSeekChangeListener;
import com.warkiz.widget.SeekParams;
import com.xw.repo.BubbleSeekBar;


public class Symptoms extends AppCompatActivity {

    IndicatorSeekBar indicatorSeekBar_pain;
    IndicatorSeekBar indicatorSeekBar_stiffness;
    IndicatorSeekBar indicatorSeekBar_fatigue;
    ImageButton saveImage_symptoms;
    DatabaseHelper_Symtoms databaseHelperSymtoms;
    int indicator_pain,indicator_stiffness,indicator_fatigue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_symptoms);
        indicatorSeekBar_fatigue=findViewById(R.id.seekbar3_fatigue);
        indicatorSeekBar_pain=findViewById(R.id.seekBar1_pain);
        indicatorSeekBar_pain.setMax(10);
        indicatorSeekBar_pain.setMin(0);
        indicatorSeekBar_stiffness=findViewById(R.id.seekBar2_stiff);
        indicatorSeekBar_stiffness.setMax(10);
        indicatorSeekBar_stiffness.setMin(0);
        indicatorSeekBar_fatigue.setMin(0);
        indicatorSeekBar_fatigue.setMax(10);
        saveImage_symptoms=findViewById(R.id.savebutton_symptoms);
        databaseHelperSymtoms=new DatabaseHelper_Symtoms(this);
        indicatorSeekBar_pain.setOnSeekChangeListener(new OnSeekChangeListener() {
            @Override
            public void onSeeking(SeekParams seekParams) {

            }

            @Override
            public void onStartTrackingTouch(IndicatorSeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(IndicatorSeekBar seekBar) {
                indicator_pain=seekBar.getProgress();

            }

            @Override
            public void onDragging(float progress) {

            }
        });
        indicatorSeekBar_stiffness.setOnSeekChangeListener(new OnSeekChangeListener() {
            @Override
            public void onSeeking(SeekParams seekParams) {

            }

            @Override
            public void onStartTrackingTouch(IndicatorSeekBar seekBar) {
                indicator_stiffness=seekBar.getProgress();

            }

            @Override
            public void onStopTrackingTouch(IndicatorSeekBar seekBar) {

            }

            @Override
            public void onDragging(float progress) {

            }
        });
        indicatorSeekBar_fatigue.setOnSeekChangeListener(new OnSeekChangeListener() {
            @Override
            public void onSeeking(SeekParams seekParams) {

            }

            @Override
            public void onStartTrackingTouch(IndicatorSeekBar seekBar) {
                indicator_fatigue=seekBar.getProgress();

            }

            @Override
            public void onStopTrackingTouch(IndicatorSeekBar seekBar) {

            }

            @Override
            public void onDragging(float progress) {

            }
        });
        saveImage_symptoms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                databaseHelperSymtoms.insert_food(indicator_pain,indicator_stiffness,indicator_fatigue);

            }
        });




    }


}





