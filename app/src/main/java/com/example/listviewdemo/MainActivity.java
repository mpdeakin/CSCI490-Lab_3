package com.example.listviewdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ArrayAdapter<String> container;
    ListView test;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        test = findViewById(R.id.class_schedule);
        container = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1);
        String test2[] = getResources().getStringArray(R.array.classes);
        container.addAll(test2);

        setContentView(R.layout.activity_main);
    }
}
