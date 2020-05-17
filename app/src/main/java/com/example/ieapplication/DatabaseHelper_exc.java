package com.example.ieapplication;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import java.text.DateFormat;
import java.util.Calendar;

public class DatabaseHelper_exc extends SQLiteOpenHelper {
    private static  final String TAG="DataBaseHelper_Sleep";
    private  static final String Table_name= "user_exc";
    private  static final String PROCESS_DATE= "date";
    private  static final String PROCESS_DAY= "id";
    private static  final String Aerobic = "aerobic";
    private static  final String Strength= "strength";
    private  static  final  String Flexibility ="flexibility";
    private  static  final  String Balance= "balance";
    private  static  final String col5="sleep_wake_up_times";
    //private static int EXC_UPDATE=0;
    DataBaseHelper_Sleep dataBaseHelper_sleep;


    public DatabaseHelper_exc(Context context) {
        super(context,Table_name,null,1);
    }


    @Override
    public void onCreate(SQLiteDatabase db) {

        String DB_PROCESS_CREATE = "create table "
                + Table_name + "("  //+ PROCESS_DAY +" INTEGER PRIMARY KEY AUTOINCREMENT ,"
                + PROCESS_DATE
                + " date PRIMARY KEY, "
                + Aerobic + " INTEGER NOT NULL,"
                + Strength+" INTEGER NOT NULL,"
                + Flexibility+" INTEGER NOT NULL,"
                + Balance+" INTEGER NOT NULL"+")";
        Log.d(TAG,DB_PROCESS_CREATE);
        db.execSQL(DB_PROCESS_CREATE);


    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS contacts");
        onCreate(db);


    }
    public boolean insert_exc (int aerobic ,int strength,int flexibility,int balance) {
        Calendar calendar = Calendar.getInstance();
        String current_date= DateFormat.getDateInstance(DateFormat.FULL).format(calendar.getTime());
        try (SQLiteDatabase db = this.getWritableDatabase()) {


            ContentValues contentValues = new ContentValues();
            contentValues.put(Aerobic, aerobic);
            contentValues.put(Flexibility,flexibility);
            contentValues.put(Strength,strength);
            contentValues.put(Balance,balance);
            contentValues.put(PROCESS_DATE,current_date);
            Log.d(TAG, "MyClass.getView() — get item number ");
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
                Log.d(TAG,"caught in exc");
            }
        }
        return true;

    }
    public boolean update (int aerobic ,int strength,int flexibility,int balance) {
        Calendar calendar = Calendar.getInstance();
        String current_date= DateFormat.getDateInstance(DateFormat.FULL).format(calendar.getTime());
        try (SQLiteDatabase db = this.getWritableDatabase()) {


            ContentValues contentValues = new ContentValues();
            contentValues.put(Aerobic, aerobic);
            contentValues.put(Flexibility,flexibility);
            contentValues.put(Strength,strength);
            contentValues.put(Balance,balance);
            contentValues.put(PROCESS_DATE,current_date);
            Log.d(TAG, "MyClass.getView() — get item number ");
            //Cursor dbcursor= (Cursor) db.query(Table_name, null, null, null, null, null, null);
            //String[] columnNames = dbcursor.getColumnNames();
            //Log.d(TAG, "MyClass.getView() — get item number "+columnNames[1]);
            long result=db.update(Table_name,contentValues,"date="+current_date,null);
            if(result==-1){
                return false;
            }
            else {
                return true;
            }
        }

    }
    public Cursor getData() {
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor res =  db.rawQuery( "select * from user_exc"+"", null );
        return res;
    }
}
