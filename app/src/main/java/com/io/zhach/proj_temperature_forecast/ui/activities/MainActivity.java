package com.io.zhach.proj_temperature_forecast.ui.activities;

import android.os.Bundle;

import com.io.zhach.proj_temperature_forecast.R;
import com.io.zhach.proj_temperature_forecast.ui.fragments.ForecastMasterFragment;

import androidx.appcompat.app.AppCompatActivity;

import static com.io.zhach.proj_temperature_forecast.utilities.FragmentHelper.pushToFragmentManager;
public class MainActivity extends AppCompatActivity {
    private double longitude = 0;
    private double latitude = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // This app doesn't use the action bar, so it is being hidden.
        getSupportActionBar().hide();

        // Setup the content view.
        setContentView(R.layout.activity_main);

        // Since this is just a blank activity, we must push ForecastMasterFragment onto the content_frame.

        pushToFragmentManager(getFragmentManager(), R.id.content_frame, new ForecastMasterFragment(), false);
    }
}
