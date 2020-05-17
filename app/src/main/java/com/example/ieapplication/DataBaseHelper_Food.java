package com.example.ieapplication;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import java.text.DateFormat;
import java.util.Calendar;

public class DataBaseHelper_Food extends SQLiteOpenHelper {
    private static  final String TAG="DataBaseHelper_Sleep";
    private  static final String Table_name= "user_food";
    private  static final String PROCESS_DATE= "date";
    private  static final String PROCESS_DAY= "id";
    private static  final String Fruits= "fruits";
    private static  final String Meat= "meat";
    private  static  final  String Vegetable ="veg";
    private  static  final  String Diary="diary";
    private  static  final String col5="sleep_wake_up_times";
    DataBaseHelper_Sleep dataBaseHelper_sleep;

    public DataBaseHelper_Food(Context context) {
        super(context,Table_name,null,1);
    }


    @Override
    public void onCreate(SQLiteDatabase db) {

        String DB_PROCESS_CREATE = "create table "
                + Table_name + "("       //+ PROCESS_DAY +" INTEGER PRIMARY KEY AUTOINCREMENT ,"
                + PROCESS_DATE
                + " date PRIMARY KEY, "
                +Fruits+ " INTEGER NOT NULL,"
                + Meat+" INTEGER NOT NULL,"
                + Vegetable+" INTEGER NOT NULL,"
                + Diary+" INTEGER NOT NULL"+")";
        Log.d(TAG,DB_PROCESS_CREATE);
        db.execSQL(DB_PROCESS_CREATE);


    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS contacts");
        onCreate(db);


    }
    public Boolean insert_food (int fruits,int vegetable,int diary,int meat) {
        Calendar calendar = Calendar.getInstance();
        String current_date= DateFormat.getDateInstance(DateFormat.FULL).format(calendar.getTime());
        try (SQLiteDatabase db = this.getWritableDatabase()) {

            ContentValues contentValues = new ContentValues();
            contentValues.put(Fruits, fruits);
            contentValues.put(Vegetable,vegetable);
            contentValues.put(Meat,meat);
            contentValues.put(Diary,diary);
            contentValues.put(PROCESS_DATE,current_date);
            Log.d(TAG, "MyClass.getView() — get item number in food ");
            Cursor dbcursor= (Cursor) db.query(Table_name, null, null, null, null, null, null);
            String[] columnNames = dbcursor.getColumnNames();
            Log.d(TAG, "MyClass.getView() — get item number "+columnNames[1]);
            try {
                long result = db.insertOrThrow(Table_name, null, contentValues);
                if (result == -1) {
                    return false;
                } else {
                    return true;
                }
            }catch (Exception e){
                db.update(Table_name,contentValues,PROCESS_DATE+"="+"'"+current_date+"'",null);
                Log.d(TAG,"caught in food");
            }
        }

        return true;
    }
    public Cursor getData() {
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor res =  db.rawQuery( "select * from user_food"+"", null );
        return res;
    }
}
