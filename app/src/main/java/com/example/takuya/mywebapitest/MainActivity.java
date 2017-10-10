package com.example.takuya.mywebapitest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.test.LocalData;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MyApp app = (MyApp)getApplication();

        app.testData = new LocalData();

        app.testData.address = "address test value";
        app.testData.name = "name test value";

    }
}
