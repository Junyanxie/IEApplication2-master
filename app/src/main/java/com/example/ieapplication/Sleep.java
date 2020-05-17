package com.example.ieapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

import com.warkiz.widget.IndicatorSeekBar;
import com.warkiz.widget.OnSeekChangeListener;
import com.warkiz.widget.SeekParams;

import java.text.DateFormat;
import java.util.Calendar;

public class Sleep extends AppCompatActivity {
    IndicatorSeekBar indicator_sleep2,indicator_sleep1 , indicator_sleep3;
    TextView date_sleep;
    ImageButton save_button;
    int indicator_value=0,indicator_wakeup;
    DataBaseHelper_Sleep dataBaseHelper_sleep;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sleep);
        indicator_sleep2= (IndicatorSeekBar) findViewById(R.id.editText);
        indicator_sleep3=findViewById(R.id.seekbar4);
        indicator_sleep2.setMax(12);
        indicator_sleep2.setMin(0);
        indicator_sleep1=(IndicatorSeekBar) findViewById(R.id.editText2);
        indicator_sleep1.setMax(10);
        indicator_sleep1.setMin(0);
        indicator_sleep3.setMax(5);
        indicator_sleep3.setMin(0);
        dataBaseHelper_sleep=new DataBaseHelper_Sleep(this);
        save_button=(ImageButton) findViewById(R.id.imageButton8);
        date_sleep=(TextView) findViewById(R.id.textView29);
        Calendar calendar = Calendar.getInstance();
        String current_date= DateFormat.getDateInstance(DateFormat.FULL).format(calendar.getTime());
        date_sleep.setText(current_date);
        indicator_sleep1.setOnSeekChangeListener(new OnSeekChangeListener() {
            @Override
            public void onSeeking(SeekParams seekParams) {

            }

            @Override
            public void onStartTrackingTouch(IndicatorSeekBar seekBar) {


            }

            @Override
            public void onStopTrackingTouch(IndicatorSeekBar seekBar) {
                indicator_wakeup=seekBar.getProgress();

            }

            @Override
            public void onDragging(float progress) {

            }
        });
        indicator_sleep2.setOnSeekChangeListener(new OnSeekChangeListener() {
            @Override
            public void onSeeking(SeekParams seekParams) {

            }

            @Override
            public void onStartTrackingTouch(IndicatorSeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(IndicatorSeekBar seekBar) {

                indicator_value= seekBar.getProgress();

            }

            @Override
            public void onDragging(float progress) {

            }

        });
        save_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dataBaseHelper_sleep.insert_sleep(indicator_value);

            }
        });

    }

    protected void onPause() {
        super.onPause();

    }
}
