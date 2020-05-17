package com.example.ieapplication;
import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteConstraintException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.Cursor;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import android.util.Log;
import java.sql.SQLIntegrityConstraintViolationException;
public class DataBaseHelper_Sleep extends SQLiteOpenHelper {

    private static  final String TAG="DataBaseHelper_Sleep";
    private  static final String Table_name= "user_sleep_table";
    private  static final String PROCESS_DAY= "id";
    private  static final String PROCESS_DATE= "date";
    private static  final String col1= "sleep_duration";
    private static  final String col2= "sleep_falling_asleep";
    private  static  final  String col3="sleep_staying_asleep";
    private  static  final  String col4="sleep_next_morning";
    private  static  final String col5="sleep_wake_up_times";
    DataBaseHelper_Sleep dataBaseHelper_sleep;

    public DataBaseHelper_Sleep(Context context) {
        super(context,Table_name,null,1);
    }


    @Override
    public void onCreate(SQLiteDatabase db) {

         String DB_PROCESS_CREATE = "create table "
                + Table_name + "(" // + PROCESS_DAY +" INTEGER PRIMARY KEY AUTOINCREMENT ,"
                 + PROCESS_DATE
                + " date PRIMARY KEY, "
                +col1+ " INTEGER NOT NULL)";
         Log.d(TAG,DB_PROCESS_CREATE);
         db.execSQL(DB_PROCESS_CREATE);


    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS contacts");
        onCreate(db);


    }
    public void insert_sleep (int hours) {
        Calendar calendar = Calendar.getInstance();
        String current_date= DateFormat.getDateInstance(DateFormat.FULL).format(calendar.getTime());
        try (SQLiteDatabase db = this.getWritableDatabase()) {


           ContentValues contentValues = new ContentValues();
           contentValues.put(col1, hours);
           contentValues.put(PROCESS_DATE,current_date);
           Log.d(TAG, "MyClass.getView() — get item number ");
           Cursor dbcursor= (Cursor) db.query(Table_name, null, null, null, null, null, null);
           String[] columnNames = dbcursor.getColumnNames();
           Log.d(TAG, "MyClass.getView() — get item number "+columnNames[1]);
           try {
               long result = db.insertOrThrow(Table_name, null, contentValues);
           }catch (Exception e){
               db.update(Table_name,contentValues,PROCESS_DATE+"="+"'"+current_date+"'",null);
               Log.d(TAG,"caught in sleep");
           }
        }

    }
    public Cursor getData() {
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor res =  db.rawQuery( "select * from user_sleep_table"+"", null );
        return res;
    }
}
