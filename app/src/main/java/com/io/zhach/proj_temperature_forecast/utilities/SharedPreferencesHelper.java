package com.io.zhach.proj_temperature_forecast.utilities;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.location.Geocoder;

public class SharedPreferencesHelper {

    /**
     * A helper function that sets a new string to SharedPreferences by using the key and string provided.
     * @param key
     * @param string
     */
    public static void setStringToSharedPrefs(String key, String string, Activity activity) {
        SharedPreferences sharedPrefs = activity.getPreferences(Context.MODE_PRIVATE);
        sharedPrefs
                .edit()
                .putString(key, string)
                .apply();
    }

    /**
     * A helper function that gets a string from SharedPreferences by using the key provided.
     * @param key
     * @return String
     */
    public static String getStringFromSharedPrefs(String key, Activity activity) {
        SharedPreferences sharedPrefs = activity.getPreferences(Context.MODE_PRIVATE);

        return sharedPrefs.getString(key, null);
    }


    public static void CreateCityInSharedPrefs(Activity activity, double latitude, double longitude) {
        Geocoder geocoder = new Geocoder(activity);

//            Address location = geocoder.getFromLocationName(providedLocation, 1).get(0);

        // Save the new city value to SharedPreferences.
//            setStringToSharedPrefs("city", location.getAddressLine(0), activity);
        setStringToSharedPrefs("city", "My city", activity);

        // Set the latitude and longitude in shared preferences.
        setStringToSharedPrefs("latitude", String.valueOf(latitude), activity);
        setStringToSharedPrefs("longitude", String.valueOf(longitude), activity);

    }
}
