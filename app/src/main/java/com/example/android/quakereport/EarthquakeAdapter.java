package com.example.android.quakereport;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class EarthquakeAdapter extends ArrayAdapter<Earthquake> {

    public EarthquakeAdapter(@NonNull Context context, ArrayList<Earthquake> earthquake) {

        super(context, 0, earthquake);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.earthquake_list_item, parent, false);
        }


        // Get the {@link AndroidFlavor} object located at this position in the list
        Earthquake currentEarthquake =  getItem(position);

        // Find the TextView in the earthquake_list_item.xml layout with the corresponding ID
        TextView magTextView = (TextView) listItemView.findViewById(R.id.txtMag);
        // set this text on the name TextView
        magTextView.setText(currentEarthquake.getmMag());

        // Find the TextView in the earthquake_list_item.xml layout with the corresponding ID
        TextView locationTextView = (TextView) listItemView.findViewById(R.id.txtLocation);
        // set this text on the name TextView
        locationTextView.setText(currentEarthquake.getmLocation());

        // Find the TextView in the earthquake_list_item.xml layout with the corresponding ID
        TextView dateOccuredTextView = (TextView) listItemView.findViewById(R.id.txtDateOccured);
        // set this text on the name TextView
        dateOccuredTextView.setText(currentEarthquake.getmDateOccured());



        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;

    }
}
