package com.io.zhach.proj_temperature_forecast.ui.adapters;

import android.view.View;
import android.widget.TextView;

import com.github.pwittchen.weathericonview.WeatherIconView;
import com.io.zhach.proj_temperature_forecast.R;

import androidx.recyclerview.widget.RecyclerView;

public class ForecastMasterViewHolder extends RecyclerView.ViewHolder {
    TextView day;
    TextView low;
    TextView high;
    WeatherIconView icon;

    public ForecastMasterViewHolder(View itemView) {
        super(itemView);

        day = (TextView) itemView.findViewById(R.id.tv_weekly_forecast_day);
        low = (TextView) itemView.findViewById(R.id.tv_weekly_forecast_low);
        high = (TextView) itemView.findViewById(R.id.tv_weekly_forecast_high);
        icon = (WeatherIconView) itemView.findViewById(R.id.weather_icon_item);
    }
}
