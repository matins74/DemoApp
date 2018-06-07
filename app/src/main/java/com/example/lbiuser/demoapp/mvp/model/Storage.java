package com.example.lbiuser.demoapp.mvp.model;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

public class Storage {

    /*public static final String TAG = Storage.class.getName();
    @Inject
    public Storage(Context context) {
        super(context, "opticals_db", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        try

        {
            db.execSQL(CREATE_TABLE);
        }catch (SQLException e)
        {
            Log.d(TAG, e.getMessage());
        }
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL(DROPTABLE);
        onCreate(db);
    }

    private static final String TABLE_NAME = "tbl_optical";
    private static final String USER_ID = "user_id";
    private static final String NAME = "name";
    private static final String MOBILE = "mobile";
    private static final String EMAIL = "email";
    private static final String IMG_PATH = "img_path";
    private static final String GENDER = "gender";
    private static final String ADDRESS = "address";
    private static final String CITY = "city";
    private static final String AGE = "age";
    private static final String CREATED_AT = "created_at";
    private static final String NOTE = "note";

    private static final String DROPTABLE = "DROP TABLE IF EXISTS " + TABLE_NAME;
    private static final String SELECT_QUERY = "Select * from " + TABLE_NAME;


    public static final String CREATE_TABLE = "create table " + TABLE_NAME + "(" +
            USER_ID + " integer primary key autoincrement not null , " +
            NAME + " text not null ," +
            MOBILE + " text not null ," +
            EMAIL + " text ," +
            IMG_PATH + " text ," +
            GENDER + " text ," +
            ADDRESS + " text ," +
            CITY + " text ," +
            AGE + " text ," +
            CREATED_AT + " text ," +
            NOTE + " text )";



    public void addUSer(Optical optical)
    {
        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues contentValues = new ContentValues();
        contentValues.put(USER_ID, optical.getUser_id());
        contentValues.put(NAME, optical.getName());
        contentValues.put(MOBILE, optical.getMobile());
        contentValues.put(EMAIL, optical.getEmail());
        contentValues.put(IMG_PATH, optical.getImg_path());
        contentValues.put(GENDER, optical.getGender());
        contentValues.put(ADDRESS, optical.getAddress());
        contentValues.put(CITY, optical.getCity());
        contentValues.put(AGE, optical.getAge());
        contentValues.put(NOTE, optical.getNote());
        contentValues.put(CREATED_AT, optical.getCreated_at());

        try
        {
            db.insert(TABLE_NAME,null,contentValues);
        }catch (SQLException e)
        {
            Log.d(TAG, e.getMessage());
        }
        db.close();
    }

    public List<Optical> getList()
    {
        List<Optical> list = new ArrayList<>();

        SQLiteDatabase db = this.getWritableDatabase();

        Cursor cursor = db.rawQuery(SELECT_QUERY,null);
        if (cursor != null) {
            if(cursor.getCount() > 0)
            {
                if(cursor.moveToFirst())
                {
                    do {
                        Optical optical = new Optical();
                        optical.setUser_id(cursor.getString(cursor.getColumnIndex(USER_ID)));
                        optical.setName(cursor.getString(cursor.getColumnIndex(NAME)));
                        optical.setMobile(cursor.getString(cursor.getColumnIndex(MOBILE)));
                        optical.setEmail(cursor.getString(cursor.getColumnIndex(EMAIL)));
                        optical.setImg_path(cursor.getString(cursor.getColumnIndex(IMG_PATH)));
                        optical.setGender(cursor.getString(cursor.getColumnIndex(GENDER)));
                        optical.setAddress(cursor.getString(cursor.getColumnIndex(ADDRESS)));
                        optical.setCity(cursor.getString(cursor.getColumnIndex(CITY)));
                        optical.setAge(cursor.getString(cursor.getColumnIndex(AGE)));
                        optical.setNote(cursor.getString(cursor.getColumnIndex(NOTE)));
                        optical.setCreated_at(cursor.getString(cursor.getColumnIndex(CREATED_AT)));

                        list.add(optical);
                    }while (cursor.moveToNext());
                }
            }
        }

        return list;
    }*/
}
