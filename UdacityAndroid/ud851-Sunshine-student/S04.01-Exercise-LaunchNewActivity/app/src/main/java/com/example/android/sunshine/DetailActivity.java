package com.example.android.sunshine;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by michael on 7/21/17.
 */

public class DetailActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        Button upBut = (Button) findViewById(R.id.upBut);
        upBut.setVisibility(upBut.VISIBLE);
        upBut.setOnClickListener(new upButton());
    }
    private class upButton implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            finish();
        }

    }

}
