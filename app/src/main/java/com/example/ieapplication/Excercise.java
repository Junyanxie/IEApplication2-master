package com.example.ieapplication;

import android.icu.util.IndianCalendar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;

import com.warkiz.widget.IndicatorSeekBar;
import com.warkiz.widget.OnSeekChangeListener;
import com.warkiz.widget.SeekParams;
import android.widget.Toast;

public class Excercise extends AppCompatActivity {
    IndicatorSeekBar aerobic ;
    IndicatorSeekBar strenght;
    IndicatorSeekBar flexibility;
    IndicatorSeekBar balance;
    ImageButton exc_save;
    DatabaseHelper_exc databaseHelper_exc;
    private static  final String TAG="DataBaseHelper_Sleep";
    private static boolean EXCERCISE_UPDATED;
    int indicator_flexibility,indicator_strength,indicator_aerobic,indicator_balance;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        indicator_aerobic=0;
        indicator_balance=0;
        indicator_flexibility=0;
        indicator_strength=0;
        //EXCERCISE_UPDATED= false;
        if (savedInstanceState != null) {
            EXCERCISE_UPDATED=savedInstanceState.getBoolean("UpdateValue");
        }
        else {
            Log.d(TAG,"Here is false");
            EXCERCISE_UPDATED=false;
        }
        setContentView(R.layout.activity_excercise);
        databaseHelper_exc=new DatabaseHelper_exc(this);
        aerobic=findViewById(R.id.seekBar1_exc);
        aerobic.setMin(0);
        aerobic.setMax(60);
        strenght=findViewById(R.id.seekBar2_exc);
        strenght.setMax(60);
        strenght.setMin(0);
        flexibility=findViewById(R.id.seekbar3_exc);
        flexibility.setMax(60);
        flexibility.setMin(0);
        balance=findViewById(R.id.seekBar4_exc);
        balance.setMax(60);
        balance.setMin(0);
        exc_save=findViewById(R.id.savebutton_exc);
        exc_save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               if(!EXCERCISE_UPDATED) {
                   Log.d(TAG,"Excercise entered "+EXCERCISE_UPDATED);
                   databaseHelper_exc.insert_exc(indicator_aerobic, indicator_strength, indicator_flexibility, indicator_balance);
                   EXCERCISE_UPDATED= !EXCERCISE_UPDATED;
                   Log.d(TAG,"Excercise entered "+EXCERCISE_UPDATED);
               }
               else{
                   Log.d(TAG,"Excercise going to update");

                   Toast.makeText(getApplicationContext(), "This is my Toast message!",
                           Toast.LENGTH_LONG).show();
                   databaseHelper_exc.update(indicator_aerobic, indicator_strength, indicator_flexibility, indicator_balance);

               }


            }
        });
        aerobic.setOnSeekChangeListener(new OnSeekChangeListener() {
            @Override
            public void onSeeking(SeekParams seekParams) {

            }

            @Override
            public void onStartTrackingTouch(IndicatorSeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(IndicatorSeekBar seekBar) {
                indicator_aerobic=seekBar.getProgress();

            }

            @Override
            public void onDragging(float progress) {


            }
        });
        strenght.setOnSeekChangeListener(new OnSeekChangeListener() {
            @Override
            public void onSeeking(SeekParams seekParams) {

            }

            @Override
            public void onStartTrackingTouch(IndicatorSeekBar seekBar) {
                indicator_strength= seekBar.getProgress();

            }

            @Override
            public void onStopTrackingTouch(IndicatorSeekBar seekBar) {

            }

            @Override
            public void onDragging(float progress) {

            }
        });
        flexibility.setOnSeekChangeListener(new OnSeekChangeListener() {
            @Override
            public void onSeeking(SeekParams seekParams) {

            }

            @Override
            public void onStartTrackingTouch(IndicatorSeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(IndicatorSeekBar seekBar) {
                indicator_flexibility=seekBar.getProgress();

            }

            @Override
            public void onDragging(float progress) {

            }
        });
        balance.setOnSeekChangeListener(new OnSeekChangeListener() {
            @Override
            public void onSeeking(SeekParams seekParams) {

            }

            @Override
            public void onStartTrackingTouch(IndicatorSeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(IndicatorSeekBar seekBar) {
                indicator_balance=seekBar.getProgress();

            }

            @Override
            public void onDragging(float progress) {

            }
        });
    }
    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        super.onSaveInstanceState(savedInstanceState);
        // Save UI state changes to the savedInstanceState.
        // This bundle will be passed to onCreate if the process is
        // killed and restarted.
        Log.d(TAG,"Here is false 2");
        savedInstanceState.putBoolean("UpdateValue",EXCERCISE_UPDATED);
        //savedInstanceState.putDouble("myDouble", 1.9);
        //savedInstanceState.putInt("MyInt", 1);
        //savedInstanceState.putString("MyString", "Welcome back to Android");
        // etc.
    }
}
