package com.io.zhach.proj_temperature_forecast.ui.fragments;

import android.Manifest;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.location.Criteria;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Build;
import android.os.Bundle;
import android.provider.Settings;
import android.util.Log;
import android.widget.Button;

import com.io.zhach.proj_temperature_forecast.R;
import com.io.zhach.proj_temperature_forecast.utilities.FragmentHelper;
import com.io.zhach.proj_temperature_forecast.utilities.SharedPreferencesHelper;

import androidx.annotation.NonNull;
import androidx.core.app.ActivityCompat;

public class AddCityDialogFragment extends DialogFragment {
    Context context;
    private Button b;
    private double longitude = 0;
    private double latitude = 0;
    LocationListener listener;
    LocationManager locationManager;

    public static AddCityDialogFragment newInstance() {
        Bundle args = new Bundle();

        AddCityDialogFragment fragment = new AddCityDialogFragment();
        fragment.setArguments(args);

        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
        }

    }

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle("Get Current Location").setMessage("Please press button");

        locationManager = (LocationManager) getContext().getSystemService(context.LOCATION_SERVICE);
        Criteria criteria = new Criteria();
        String provider = locationManager.getBestProvider(criteria, false);
//        Location location = locationManager.getLastKnownLocation(LocationManager.NETWORK_PROVIDER);
        if (provider != null) {
            Location location = locationManager.getLastKnownLocation(provider);
            // Logic to handle location object
            latitude = location.getLatitude();
            longitude = location.getLongitude();

//            System.out.println("====================");
//            System.out.println("\n " + latitude + " " + longitude);
//            Log.v("11", "IN ON LOCATION CHANGE, lat=" + latitude + ", lon=" + longitude);aaa
//                SharedPreferencesHelper.CreateCityInSharedPrefs(getActivity(), location);
            SharedPreferencesHelper.CreateCityInSharedPrefs(getActivity(), latitude,longitude);
            FragmentHelper.pushToFragmentManager(getFragmentManager(), R.id.content_frame, new ForecastMasterFragment(), false);
        }else{
            listener = new LocationListener() {
                @Override
                public void onLocationChanged(Location location) {
//                    t.append("\n " + location.getLongitude() + " " + location.getLatitude());
                    latitude = location.getLatitude();
                    longitude = location.getLongitude();

                    System.out.println("====================");
                    System.out.println("\n " + latitude + " " + longitude);
                    Log.v("22", "IN ON LOCATION CHANGE, lat=" + latitude + ", lon=" + longitude);
                }

                @Override
                public void onStatusChanged(String s, int i, Bundle bundle) {

                }

                @Override
                public void onProviderEnabled(String s) {

                }

                @Override
                public void onProviderDisabled(String s) {

                    Intent i = new Intent(Settings.ACTION_LOCATION_SOURCE_SETTINGS);
                    startActivity(i);
                }
            };

            configure_button();
        }


        // Set up the input
//        final EditText input = new EditText(getActivity());
//        input.setInputType(InputType.TYPE_CLASS_TEXT);
//        builder.setView(input);

        builder.setPositiveButton("Set Location", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                locationManager.requestLocationUpdates("gps", 5000, 0, listener);
//                String location = input.getText().toString();
//                SharedPreferencesHelper.CreateCityInSharedPrefs(getActivity(), location);
                SharedPreferencesHelper.CreateCityInSharedPrefs(getActivity(), latitude,longitude);
                FragmentHelper.pushToFragmentManager(getFragmentManager(), R.id.content_frame, new ForecastMasterFragment(), false);

//                String location = input.getText().toString();
//                SharedPreferencesHelper.CreateCityInSharedPrefs(getActivity(), location);
//                FragmentHelper.pushToFragmentManager(getFragmentManager(), R.id.content_frame, new ForecastMasterFragment(), false);
            }
        });


        return builder.create();
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

        this.context = getActivity();
    }

    public boolean isActive() {
        return isAdded() && !isDetached() && !isRemoving();
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        switch (requestCode){
            case 10:
                configure_button();
                break;
            default:
                break;
        }
    }

    void configure_button(){
        // first check for permissions
        if (ActivityCompat.checkSelfPermission(getContext(), Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(getContext(), Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                requestPermissions(new String[]{Manifest.permission.ACCESS_COARSE_LOCATION,Manifest.permission.ACCESS_FINE_LOCATION,Manifest.permission.INTERNET}
                        ,10);
            }
            return;
        }
    }
}

