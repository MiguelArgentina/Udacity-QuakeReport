/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.quakereport;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class EarthquakeActivity extends AppCompatActivity {

    public static final String LOG_TAG = EarthquakeActivity.class.getName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.earthquake_activity);

        // Create a fake list of earthquake locations.
        ArrayList<Earthquake> earthquakes = new ArrayList<Earthquake>();
        earthquakes.add(new Earthquake("3.8","San Francisco","13/01/1981 10:23"));
        earthquakes.add(new Earthquake("5.6","London","23/02/1951 13:26"));
        earthquakes.add(new Earthquake("7.9","Tokyo","15/06/1956 11:45"));
        earthquakes.add(new Earthquake("1.4","Mexico City","02/06/1989 14:43"));
        earthquakes.add(new Earthquake("5.1","Moscow","22/01/1961 10:26"));
        earthquakes.add(new Earthquake("9.0","Rio de Janeiro","09/01/1987 23:24"));
        earthquakes.add(new Earthquake("6.3","Paris","31/01/1999 15:59"));

        EarthquakeAdapter earthquakeAdapter = new EarthquakeAdapter(this, QueryUtils.extractEarthquakes());


        // Find a reference to the {@link ListView} in the layout
        ListView earthquakeListView = (ListView) findViewById(R.id.list);


        // Set the adapter on the {@link ListView}
        // so the list can be populated in the user interface
        earthquakeListView.setAdapter(earthquakeAdapter);
    }
}
