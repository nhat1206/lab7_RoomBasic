package com.example.myapplication4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

import android.os.Bundle;
import android.util.Log;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AppDatabase db = Room.databaseBuilder(getApplicationContext(),
                AppDatabase.class, "database-name").allowMainThreadQueries().build();

        StudentDAO studentDAO = db.studentDAO;
        List<Student> users = studentDAO.findAllStudent();

        Log.d("Tag","onCreate");

    }
}