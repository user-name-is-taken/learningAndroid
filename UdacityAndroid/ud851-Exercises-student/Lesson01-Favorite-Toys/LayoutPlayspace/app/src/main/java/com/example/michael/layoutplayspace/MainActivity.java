package com.example.michael.layoutplayspace;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    android.widget.Switch thisSwitch=(android.widget.Switch) findViewById(R.id.switch1);
    //thisSwitch.
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
