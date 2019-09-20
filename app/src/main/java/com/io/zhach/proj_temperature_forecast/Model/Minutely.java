package com.io.zhach.proj_temperature_forecast.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Minutely {


    @SerializedName("icon")
    @Expose
    private String icon;
    @SerializedName("summary")
    @Expose
    private String summary;



    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

}
