package com.example.android.repeat;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.Toast;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import static com.example.android.repeat.R.id.map;

/**
 * A simple {@link Fragment} subclass.
 */
public class MapFragment extends Fragment implements OnMapReadyCallback {
    private GoogleMap mMap;
    private MapView mMapView;

    public MapFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_map, container, false);

        // Set up listeners for main menu and filters button in toolbar
        MyLocationClickListener menuClickListener = new MyLocationClickListener();
        ImageButton myLocationButton = (ImageButton) view.findViewById(R.id.my_location_button);
        myLocationButton.setOnClickListener(menuClickListener);
        
        return view;

    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        mMapView = (MapView) view.findViewById(map);
        mMapView.onCreate(savedInstanceState);
        mMapView.onResume();
        mMapView.getMapAsync(this); //when you already implement OnMapReadyCallback in your fragment


    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Philbeach Gardens and move the camera
        LatLng london = new LatLng(51.490347, -0.197252);
        mMap.addMarker(new MarkerOptions().position(london).title("Marker in Sydney"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(london, 15));
    }

    // Click Listener for My Location button
    public class MyLocationClickListener implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            Toast.makeText(getActivity(), "my location", Toast.LENGTH_SHORT).show();

        }
    }


}
