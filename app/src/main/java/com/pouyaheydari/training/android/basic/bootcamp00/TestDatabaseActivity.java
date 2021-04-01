package com.pouyaheydari.training.android.basic.bootcamp00;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

public class TestDatabaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_database);

        TestSQLite db = new TestSQLite(TestDatabaseActivity.this, "sematec", null, 1);

        db.insertStudent("Pouya", "Heydari", 18.50);
        db.insertStudent("Qoli", "Qolizade", 12.68);

        double grade = db.getGradeByStudentName("Pouya");
        Log.d("TAG", "Pouya's grade is: " + grade);
    }
}