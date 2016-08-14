package com.example.srima.googlemaps;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

public class MainActivity extends AppCompatActivity {
    final LatLng ManipalPoints = new LatLng(12.9715987 ,77.59456269999998);
    GoogleMap googleMap;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       try{
        if (googleMap == null) {
            googleMap = ((MapFragment) getFragmentManager().
                    findFragmentById(R.id.fragment)).getMap();
        }
        googleMap.setMapType(GoogleMap.MAP_TYPE_NORMAL);
        Marker TP = googleMap.addMarker(new MarkerOptions().
                position(ManipalPoints).title("ManiPalGlobal"));


    }
    catch (Exception e) {
        e.printStackTrace();
    }

    }

}
