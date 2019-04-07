 package com.example.map;


import android.app.FragmentTransaction;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;


 public class MainActivity extends FragmentActivity implements OnMapReadyCallback {

     

     GoogleMap map;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MapFragment mapFragment=(MapFragment)getFragmentManager().findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

    }

     @Override
     public void onMapReady(GoogleMap map) {
        map.addMarker(new MarkerOptions().position(new LatLng(0,0)).title("Marker"));
         map.setMapType(GoogleMap.MAP_TYPE_HYBRID);
         map.setTrafficEnabled(true);

     }
 }
