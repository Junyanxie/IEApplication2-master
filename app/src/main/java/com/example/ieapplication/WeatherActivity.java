package com.example.ieapplication;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.example.ieapplication.connect.findweather;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import java.util.ArrayList;
import java.util.List;


public class WeatherActivity extends AppCompatActivity {
    private TextView t_city, t_temp, t_description, t_weather;
    private String city,temp,description,mainweather;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather);
        List<String> list = new ArrayList<String>();
        list.add("Ballarat");
        list.add("Benalla");
        list.add("Bendigo");
        list.add("Geelong");
        list.add("Horsham");
        list.add("Melbourne");
        list.add("Morwell");
        list.add("Sale");
        list.add("Shepparton");
        list.add("Swan Hill");
        list.add("Traralgon");
        list.add("Wangaratta");
        list.add("Warrnambool");
        list.add("Wodonga");
        final Spinner sMovie= findViewById(R.id.city_spinner);
        final ArrayAdapter<String> spinnerAdapter = new
                ArrayAdapter<String>(this ,android.R.layout.simple_spinner_item, list);
        sMovie.setAdapter(spinnerAdapter);
        t_city = (TextView) findViewById(R.id.tvweather);
        t_temp = (TextView) findViewById(R.id.tvweather2);
        t_description = (TextView) findViewById(R.id.tvweather3);
        t_weather = (TextView) findViewById(R.id.tvweather1);
        Button get = (Button) findViewById(R.id.btnget);
        get.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CoursesAsyncTask courses = new CoursesAsyncTask();
                courses.execute(sMovie.getSelectedItem().toString());

            }

        });
        ImageButton return1=(ImageButton)findViewById(R.id.return5);
        return1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(WeatherActivity.this, TipActivity.class);
                startActivity(intent);
            }
        });
    }

    private class CoursesAsyncTask extends AsyncTask<String, Void, String> {
        @Override
        protected String doInBackground(String... params) {
            return findweather.getweather(params[0]);
        }

        @Override
        protected void onPostExecute(String courses) {
            JSONObject main=JSONObject.fromObject(courses);
            String main2=main.getString("main");
            JSONObject main3=JSONObject.fromObject(main2);
            city=main.getString("name");
            temp=main3.getString("temp");
            String weather=main.getString("weather");
            JSONArray weather2=JSONArray.fromObject(weather);
            mainweather=weather2.getJSONObject(0).getString("main");
            description=weather2.getJSONObject(0).getString("description");
            double temp_int= Double.parseDouble(temp);
            double centi=(temp_int-32)/1.8000;
            centi= Math.round(centi);
            int i=(int)centi;
            t_city.setText(city);
            t_description.setText(description);
            t_temp.setText(String.valueOf(i));
            if(i<=15){
                Toast.makeText(WeatherActivity.this,"The Temp is too cold, please mention to keep warm", Toast.LENGTH_SHORT).show();
            }
            if(i>=20){
                Toast.makeText(WeatherActivity.this,"The Temp is warm. Today is a good day to go out for exercise", Toast.LENGTH_SHORT).show();
            }
            t_weather.setText(mainweather);
        }
    }

}