package com.example.maps;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.example.maps.databinding.ActivityMapsBinding;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private ActivityMapsBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMapsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

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

        LatLng unpam = new LatLng(-6.345965506120672, 106.69162610990126);
        mMap.addMarker(new MarkerOptions().position(unpam).title("Universitas Pamulang, Viktor"));
        mMap.setMaxZoomPreference(1000);
        mMap.setMinZoomPreference(10);
        mMap.moveCamera(CameraUpdateFactory.newLatLng(unpam));

        LatLng karawaci = new LatLng(-6.215882092776268, 106.61927051206477);
        mMap.addMarker(new MarkerOptions().position(unpam).title("Karawaci, Kelapa dua"));
        mMap.setMaxZoomPreference(1000);
        mMap.setMinZoomPreference(10);
        mMap.moveCamera(CameraUpdateFactory.newLatLng(karawaci));

        LatLng serpong = new LatLng(-6.223677604346334, 106.63637643794492);
        mMap.addMarker(new MarkerOptions().position(unpam).title("Tempat bekerja, serpong"));
        mMap.setMaxZoomPreference(1000);
        mMap.setMinZoomPreference(10);
        mMap.moveCamera(CameraUpdateFactory.newLatLng(serpong));
    }
}