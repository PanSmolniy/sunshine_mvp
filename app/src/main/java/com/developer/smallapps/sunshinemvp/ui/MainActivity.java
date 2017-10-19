package com.developer.smallapps.sunshinemvp.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.developer.smallapps.sunshinemvp.R;

public class MainActivity extends AppCompatActivity implements MainActivityView {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void displayTodayForecastFragment() {

    }

    @Override
    public void displayListOfFutureForecasts() {

    }

    @Override
    public void openDetailedForecast() {

    }

    @Override
    public void openAppSettings() {

    }
}
