package com.example.android.repeat;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass
 */
public class ListFragment extends Fragment {
    private ArrayList<Restaurant> restaurantList = new ArrayList<Restaurant>();

    public ListFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_list, container, false);

        restaurantList.add(new Restaurant("The Philly Tavern", "5 Philbeach Gd, Kensington", "Russian", R.drawable.philly));
        restaurantList.add(new Restaurant("The Chilly Tavern", "6 Philbeach Gd, Kensington", "Mexican", R.drawable.chilly));
        restaurantList.add(new Restaurant("The Hilly Tavern", "7 Philbeach Gd, Kensington", "Nepalese", R.drawable.hilly));
        restaurantList.add(new Restaurant("The Willy Tavern", "8 Philbeach Gd, Kensington", "German", R.drawable.willy));
        restaurantList.add(new Restaurant("The Trilly Tavern", "9 Philbeach Gd, Kensington", "Nigerian", R.drawable.chilly));
        restaurantList.add(new Restaurant("The Silly Tavern", "10 Philbeach Gd, Kensington", "English", R.drawable.hilly));

        // Create a RestaurantAdapter
        RestaurantAdapter adapter = new RestaurantAdapter(getActivity(), restaurantList);

        // Get reference to the listview and attach the adapter to it
        ListView listView = (ListView) view.findViewById(R.id.listview_restaurant);
        listView.setAdapter(adapter);

        return view;



    }

}
