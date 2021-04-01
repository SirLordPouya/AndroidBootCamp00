package com.pouyaheydari.training.android.basic.bootcamp00;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class TestSQLite extends SQLiteOpenHelper {

    String TABLE_NAME = "students";

    public TestSQLite(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        String CREATE_TABLE_QUERY = "CREATE TABLE " + TABLE_NAME + "(_id INTEGER PRIMARY KEY AUTOINCREMENT, name TEXT, family TEXT, grade REAL)";
        db.execSQL(CREATE_TABLE_QUERY);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    // 'Pouya' ---> Text
    public void insertStudent(String name, String family, double grade) {
        String INSERT_STUDENT_QUERY = "INSERT INTO " + TABLE_NAME +
                "(name,family,grade) VALUES(" + "'" + name + "'" + "," + "'" + family + "'" + "," + grade + ")";
        SQLiteDatabase db = getWritableDatabase();
        db.execSQL(INSERT_STUDENT_QUERY);
        db.close();
    }


    public double getGradeByStudentName(String name) {
        String GRADE_BY_NAME_QUERY = "SELECT grade FROM " + TABLE_NAME + " WHERE name = " + "'" + name + "'";
        SQLiteDatabase db = getReadableDatabase();
        Cursor cursor = db.rawQuery(GRADE_BY_NAME_QUERY, null);
        double grade = 0.0;
        while (cursor.moveToNext()) {
            grade = cursor.getDouble(0);
        }
        db.close();
        return grade;
    }
}
