package com.example.android.repeat;

import android.app.Activity;
import android.graphics.Typeface;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import static android.R.attr.name;
import static android.R.attr.x;

/**
 * Created by Luka Filipi on 19/02/2017.
 */

public class RestaurantAdapter extends ArrayAdapter<Restaurant> {




    public RestaurantAdapter(Activity context, ArrayList<Restaurant> restaurants) {
        super(context, 0, restaurants);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.restaurant_list_item, parent, false);
        }

        // Get the {@link AndroidFlavor} object located at this position in the list
        Restaurant currentRestaurant = getItem(position);

        // Find the TextView in the restaurant list_item.xml layout with the ID restaurant_name
        TextView nameTextView = (TextView) listItemView.findViewById(R.id.restaurant_name);
        Typeface ralewayMedium = Typeface.createFromAsset(getContext().getAssets(), "fonts/Raleway-Medium.ttf");
        nameTextView.setTypeface(ralewayMedium);
        nameTextView.setText(currentRestaurant.getName());

        // Find the TextView in the restaurant list_item.xml layout with the ID restaurant_address
        TextView addressTextView = (TextView) listItemView.findViewById(R.id.restaurant_address);
        Typeface ralewayThin = Typeface.createFromAsset(getContext().getAssets(), "fonts/Raleway-Thin.ttf");
        addressTextView.setTypeface(ralewayThin);
        addressTextView.setText(currentRestaurant.getAddress());

        // Find the TextView in the restaurant list_item.xml layout with the ID restaurant_cuisine
        TextView cuisineTextView = (TextView) listItemView.findViewById(R.id.restaurant_cuisine);
        Typeface ralewayExtraLight = Typeface.createFromAsset(getContext().getAssets(), "fonts/Raleway-ExtraLight.ttf");
        cuisineTextView.setTypeface(ralewayExtraLight);
        cuisineTextView.setText(currentRestaurant.getCuisine());

        // Find the ImageView in the list_item.xml layout with the ID restaurant_icon
        ImageView iconView = (ImageView) listItemView.findViewById(R.id.restaurant_icon);
        iconView.setImageResource(currentRestaurant.getImageResourceId());

        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;
    }
}
