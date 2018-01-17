package com.example.android.favoritetoys;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
//TODO-change me
   @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView myObj=(TextView) findViewById(R.id.textOut);
        myObj.setText(R.drawable.class.getName());

    }

}
