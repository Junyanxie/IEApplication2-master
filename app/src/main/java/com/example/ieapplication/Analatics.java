package com.example.ieapplication;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import com.anychart.AnyChart;
import com.anychart.AnyChartView;
import com.anychart.charts.Cartesian;
import com.anychart.core.cartesian.series.Line;
import com.anychart.data.Mapping;
import com.anychart.chart.common.dataentry.DataEntry;
import com.anychart.chart.common.dataentry.ValueDataEntry;
import com.anychart.charts.Cartesian;
import com.anychart.core.cartesian.series.Line;
import com.anychart.data.Set;
import com.anychart.enums.Anchor;
import com.anychart.enums.MarkerType;
import com.anychart.enums.TooltipPositionMode;
import com.anychart.graphics.vector.Stroke;
import android.database.Cursor;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;
import java.util.Stack;


public class Analatics extends AppCompatActivity {

    DataBaseHelper_Sleep dataBaseHelper_sleep;
    DatabaseHelper_exc databaseHelper_exc;
    DatabaseHelper_Symtoms databaseHelper_symtoms;
    DataBaseHelper_Food dataBaseHelper_food;
    private List<DataEntry> values;
    private  AnyChartView anyChartView;
    private Cartesian cartesian;
    private Stack<Integer> scores;
    private static  final String TAG="DataBaseHelper_Sleep";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_analatics);
        FloatingActionButton fab = findViewById(R.id.fab);
        dataBaseHelper_sleep=new DataBaseHelper_Sleep(this);
        databaseHelper_exc=new DatabaseHelper_exc(this);
        databaseHelper_symtoms=new DatabaseHelper_Symtoms(this);
        dataBaseHelper_food=new DataBaseHelper_Food(this);
        values=new ArrayList<>();
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        anyChartView = findViewById(R.id.chart);
        anyChartView.setProgressBar(findViewById(R.id.progress_bar));
        cartesian = AnyChart.line();

        cartesian.animation(true);

        cartesian.padding(10d, 20d, 5d, 20d);

        cartesian.crosshair().enabled(true);
        cartesian.crosshair()
                .yLabel(true)
                // TODO ystroke
                .yStroke((Stroke) null, null, null, (String) null, (String) null);

        fetch_data();



    }

    public void fetch_data(){
        scores=new Stack<>();
        Log.d(TAG,"Fetching Started");
        Cursor fetched_data_sleep=dataBaseHelper_sleep.getData();
        Cursor fetched_data_exc=databaseHelper_exc.getData();
        Cursor fetched_data_sym=databaseHelper_symtoms.getData();
        Cursor fetched_data_food=dataBaseHelper_food.getData();
        Log.d(TAG,"Fetching Finished" + fetched_data_sleep.getCount());
        Stack<String> pain_day=new Stack<>();
        Stack<Integer> pain_level=new Stack<>();
        Stack<String> food_day=new Stack<>();
        Stack<Integer> aero_level=new Stack<>();
        Stack<Integer> stren_level=new Stack<>();
        Stack<Integer> flex_level=new Stack<>();
        Stack<Integer> bala_level=new Stack<>();
        Stack<String> exc_day=new Stack<>();
        Stack<Integer> meat_level=new Stack<>();
        Stack<Integer> veg_level=new Stack<>();
        Stack<Integer> diary_level=new Stack<>();
        Stack<Integer> fruit_level=new Stack<>();
        Stack<String> sleep_day=new Stack<>();
        Stack<Integer> hour_level=new Stack<>();
        fetched_data_sym.moveToFirst();
        Log.d(TAG,"Pain");
        while(!fetched_data_sym.isAfterLast()) {
            pain_day.push(fetched_data_sym.getString(fetched_data_sym.getColumnIndex("date")));
            pain_level.push(fetched_data_sym.getInt(fetched_data_sym.getColumnIndex("pain")));
            //Log.d(TAG, String.valueOf(value));
            //values.add(new ValueDataEntry(day,value));

            fetched_data_sym.moveToNext();
        }
        Log.d(TAG,"Pain finished "+pain_day.size());
        fetched_data_exc.moveToFirst();
        while(!fetched_data_exc.isAfterLast()) {
            exc_day.push(fetched_data_exc.getString(fetched_data_exc.getColumnIndex("date")));
            aero_level.push(fetched_data_exc.getInt(fetched_data_exc.getColumnIndex("aerobic")));
            stren_level.push(fetched_data_exc.getInt(fetched_data_exc.getColumnIndex("strength")));
            flex_level.push(fetched_data_exc.getInt(fetched_data_exc.getColumnIndex("flexibility")));
            bala_level.push(fetched_data_exc.getInt(fetched_data_exc.getColumnIndex("balance")));

            //Log.d(TAG, String.valueOf(value));
            //values.add(new ValueDataEntry(day,value));
            fetched_data_exc.moveToNext();
        }
        fetched_data_food.moveToFirst();
        while(!fetched_data_food.isAfterLast()) {
            food_day.push(fetched_data_food.getString(fetched_data_food.getColumnIndex("date")));
            meat_level.push(fetched_data_food.getInt(fetched_data_food.getColumnIndex("meat")));
            fruit_level.push(fetched_data_food.getInt(fetched_data_food.getColumnIndex("fruits")));
            diary_level.push(fetched_data_food.getInt(fetched_data_food.getColumnIndex("diary")));
            veg_level.push(fetched_data_food.getInt(fetched_data_food.getColumnIndex("veg")));

            //Log.d(TAG, String.valueOf(value));
            //values.add(new ValueDataEntry(day,value));
            fetched_data_food.moveToNext();
        }
        fetched_data_sleep.moveToFirst();
        while(!fetched_data_sleep.isAfterLast()) {
            sleep_day.push(fetched_data_sleep.getString(fetched_data_sleep.getColumnIndex("date")));
            hour_level.push(fetched_data_sleep.getInt(fetched_data_sleep.getColumnIndex("sleep_duration")));
            //Log.d(TAG, String.valueOf(value));
            //values.add(new ValueDataEntry(day,value));
            fetched_data_sleep.moveToNext();
        }
        Log.d(TAG,"Food finished "+ food_day.size());
        //cartesian.data(values);
        //anyChartView.setChart(cartesian);
        Iterator iterator=pain_day.iterator();
        Log.d(TAG,"Iterator");
        while(iterator.hasNext()){
            int sleep_score=0;
            int exc_score=0;
            int food_score=0;
            Log.d(TAG,"Iterator Inside");
            String date= (String) iterator.next();
            if(sleep_day.contains(date)){
                int x=hour_level.get(sleep_day.indexOf(date));
                Log.d(TAG,"Fetched Sleep "+ x+" "+date);

                 if(x>7 && x<=9){
                    sleep_score=100;
                }
                else{
                    sleep_score=x/7*100;
                }
            }
            if(exc_day.contains(date)){
                int flex=flex_level.get(exc_day.indexOf(date));
                int bal=bala_level.get(exc_day.indexOf(date));
                int stren=stren_level.get(exc_day.indexOf(date));
                int aero=aero_level.get(exc_day.indexOf(date));
                int total= flex+bal+stren+aero;
                if(total>30 && total<=45 ){
                    exc_score=100;
                }
                else{
                    exc_score=total/30*100;
                }
            }
            if(food_day.contains(date)){
                Log.d(TAG,"Iterator Inside food");
                int meat=meat_level.get(food_day.indexOf(date));
                int veg=veg_level.get(food_day.indexOf(date));
                int diary=stren_level.get(food_day.indexOf(date));
                int fruit=aero_level.get(food_day.indexOf(date));
                Log.d(TAG,"Fetched meat " +meat);
                int total=meat+veg+diary+fruit;
                if(total>11 && total<=16.5){
                    food_score=100;
                }
                else{
                    food_score=total/11*100;
                }
            }
            int total_score=food_score+exc_score+sleep_score;
            scores.push(food_score+exc_score+sleep_score);
            Log.d(TAG,"The total score is "+scores);



        }
        int i=scores.indexOf(scores.lastElement());
        int counter=0;
        while (i<=20 && counter<=scores.size()-1){
            int value=scores.get(i);
            Log.d(TAG,"The value is "+value);
            values.add(new ValueDataEntry(i+1,value));
            i=i+1;
            counter=counter+1;
        }
        values.add(new ValueDataEntry(1,400));
        values.add(new ValueDataEntry(2,500));
        Log.d(TAG,"The total score is "+values.toString());
        cartesian.data(values);
        anyChartView.setChart(cartesian);


    }



}
