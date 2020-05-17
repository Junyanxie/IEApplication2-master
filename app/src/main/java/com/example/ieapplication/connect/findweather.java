package com.example.ieapplication.connect;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class findweather  {


    public static String getweather(String city) {
        String data="";
        URL url = null;
        try {
            url = new URL("http://api.openweathermap.org/data/2.5/weather?q="+city+",AU&APPID=6fe8f2792d75da61aa76b332580b9f05&units=Imperial");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        HttpURLConnection http = null;
        try {
            http = (HttpURLConnection) url.openConnection();
            Scanner inStream = new Scanner(http.getInputStream());
//read the input steream and store it as string
            while (inStream.hasNextLine()) {
                data += inStream.nextLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return data;
    }





}
