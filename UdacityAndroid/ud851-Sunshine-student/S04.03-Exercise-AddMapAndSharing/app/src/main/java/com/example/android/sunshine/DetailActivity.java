package com.example.android.sunshine;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.ShareCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    private static final String FORECAST_SHARE_HASHTAG = " #SunshineApp";

    private String mForecast;
    private TextView mWeatherDisplay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        mWeatherDisplay = (TextView) findViewById(R.id.tv_display_weather);
        Intent intentThatStartedThisActivity = getIntent();

        if (intentThatStartedThisActivity != null) {
            if (intentThatStartedThisActivity.hasExtra(Intent.EXTRA_TEXT)) {
                mForecast = intentThatStartedThisActivity.getStringExtra(Intent.EXTRA_TEXT);
                mWeatherDisplay.setText(mForecast);
            }
        }
    }

    // TODO (3) Create a menu with an item with id of action_share
    // TODO (4) Display the menu and implement the forecast sharing functionality

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        getMenuInflater().inflate(R.menu.detail,menu);
        MenuItem menuItem = menu.findItem(R.id.action_share);
        menuItem.setIntent(createShareForecastIntent());
        return true;
    }


    public Intent createShareForecastIntent(){
        // Do steps 2 - 4 within the shareText method
        String mimeType = "text/plain";

        // ODO (2) Create a String variable called mimeType and set it to "text/plain"

        String title = "chooser title";
        // ODO (3) Create a title for the chooser window that will pop up

        // ODO (4) Use ShareCompat.IntentBuilder to build the Intent and start the chooser
        Intent it = ShareCompat.IntentBuilder.from(this)
                .setText("text to share")
                .setType(mimeType)
                .setChooserTitle(title)
                .getIntent();
        return it;
    }


}