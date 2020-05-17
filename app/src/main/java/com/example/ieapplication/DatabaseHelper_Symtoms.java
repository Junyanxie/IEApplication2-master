package com.example.ieapplication;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import java.text.DateFormat;
import java.util.Calendar;

public class DatabaseHelper_Symtoms extends SQLiteOpenHelper {
    private static  final String TAG="DataBaseHelper_Sleep";
    private  static final String Table_name= "user_symptoms";
    private  static final String PROCESS_DAY= "id";
    private  static final String PROCESS_DATE= "date";
    private static  final String Pain = "pain";
    private static  final String Stiffness = "stiffness";
    private  static  final  String Fatigue ="fatigue";
    private  static  final String col5="sleep_wake_up_times";
    DataBaseHelper_Sleep dataBaseHelper_sleep;

    public DatabaseHelper_Symtoms(Context context) {
        super(context,Table_name,null,1);
    }


    @Override
    public void onCreate(SQLiteDatabase db) {

        String DB_PROCESS_CREATE = "create table "
                + Table_name + "("    //+  PROCESS_DAY +" INTEGER PRIMARY KEY AUTOINCREMENT ,"
                + PROCESS_DATE
                + " date PRIMARY KEY, "
                + Pain + " INTEGER NOT NULL,"
                + Stiffness +" INTEGER NOT NULL,"
                + Fatigue+" INTEGER NOT NULL"
                +")";
        Log.d(TAG,DB_PROCESS_CREATE);
        db.execSQL(DB_PROCESS_CREATE);


    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS contacts");
        onCreate(db);


    }
    public boolean insert_food (int pain,int stiffness,int fatigue) {
        Calendar calendar = Calendar.getInstance();
        String current_date= DateFormat.getDateInstance(DateFormat.FULL).format(calendar.getTime());
        Log.d(TAG,current_date);
        try (SQLiteDatabase db = this.getWritableDatabase()) {

            ContentValues contentValues = new ContentValues();
            contentValues.put(PROCESS_DATE,current_date);
            contentValues.put(Pain, pain);
            contentValues.put(Fatigue, fatigue);
            contentValues.put(Stiffness, stiffness);
            contentValues.put(PROCESS_DATE, current_date);
            Log.d(TAG, "MyClass.getView() — get item number ");
            Cursor dbcursor = (Cursor) db.query(Table_name, null, null, null, null, null, null);
            String[] columnNames = dbcursor.getColumnNames();
            Log.d(TAG, "MyClass.getView() — get item number " + columnNames[0]);
            long result = db.insert(Table_name, null, contentValues);



            if (result == -1) {
                return false;
            } else {
                return true;
            }


        }


    }
    public Cursor getData() {
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor res =  db.rawQuery( "select * from user_symptoms"+"", null );
        return res;
    }
}
