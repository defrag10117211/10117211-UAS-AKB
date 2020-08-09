package com.example.a10117211_uas;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.sql.SQLClientInfoException;

//Tanggal   :8-8-2020 - 12-08-2020
//Nim		:10117211
//Nama 	    :Defrag Muhammad Al'araaf Dasmana
//Kls		:IF-7
public class Database extends SQLiteOpenHelper {
    public static final String DATABASE_NAME = "datauas.db";
    public static final String TABLE_PROFILE = "profile";
    public static final String COL_1_1 = "NIM";
    public static final String COL_2_1 = "nama";
    public static final String COL_3_1 = "kelas";
    public static final String COL_4_1 = "description";
    private static final int DATABASE_VERSION = 1;
    private SQLiteDatabase readableDatabase;
    private SQLiteDatabase getWritableDatabase;
    public Database(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
        // TODO Auto-generated constructor stub
        SQLiteDatabase db = this.getWritableDatabase();
    }



    @Override
    public void onCreate(SQLiteDatabase db) {
        // TODO Auto-generated method stub
        db.execSQL("create table " + TABLE_PROFILE + "(NIM integer  not null, nama text not null, kelas text not null, " +
                "description text not null);");
    }
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // TODO Auto-generated method stub
        db.execSQL("DROP TABLE IF EXISTS "+TABLE_PROFILE);

        onCreate(db);
    }
    

    public void setReadableDatabase(SQLiteDatabase readableDatabase) {
        this.readableDatabase = readableDatabase;
    }



}
