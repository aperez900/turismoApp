package com.example.loginsabado;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class maps extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        LatLng coor1 = new LatLng(5.599372, -75.819404);
        LatLng coor2 = new LatLng(5.594469, -75.818784);
        LatLng coor3 = new LatLng(5.598116275673166, -75.81439641818616);
        LatLng coor4 = new LatLng(5.618620787189339, -75.7860732324324);

        mMap.addMarker(new MarkerOptions()
                .position(coor1)
                .title("Parque principal de jardin")
                .draggable(true));

        mMap.addMarker(new MarkerOptions()
                .position(coor2)
                .title("Telesferico")
                .draggable(true));

        mMap.addMarker(new MarkerOptions()
                .position(coor3)
                .title("Cueva del esplendor")
                .draggable(true));

        mMap.addMarker(new MarkerOptions()
                .position(coor4)
                .title("Cueva de los guacharos")
                .draggable(true));

        mMap.moveCamera(CameraUpdateFactory.newLatLng(coor1));
        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(coor1, 16));
    }
}