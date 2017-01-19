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
        earthquakes.add(new Earthquake("1.0", "San Francisco", "Jan. 1 2016"));
        earthquakes.add(new Earthquake("2.5", "New York", "Feb. 12 2016"));
        earthquakes.add(new Earthquake("3.0", "San Sebastian", "Mar. 1 2016"));
        earthquakes.add(new Earthquake("1.0", "Warsaw", "Apr. 21 2016"));
        earthquakes.add(new Earthquake("2.5", "Tokyo", "May. 27 2016"));
        earthquakes.add(new Earthquake("4.0", "Moscow", "Jun. 11 2016"));
        earthquakes.add(new Earthquake("1.5", "Londyn", "Jul. 17 2016"));
        earthquakes.add(new Earthquake("4.0", "Madryt", "Sep. 19 2016"));
        earthquakes.add(new Earthquake("2.0", "Prague", "Oct. 30 2016"));
        earthquakes.add(new Earthquake("1.5", "Wrocław", "Nov. 31 2016"));
        earthquakes.add(new Earthquake("2.0", "Pruszków", "Dec. 14 2016"));
        earthquakes.add(new Earthquake("1.0", "Trzebnica", "Jan. 17 2016"));

        // Create an {@link QuakeAdapter}, whose data source is a list of {@link Earthquake}s. The
        // adapter knows how to create list items for each item in the list.
        QuakeAdapter adapter = new QuakeAdapter(this, earthquakes);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // quake_list.xmll layout file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link QuakeAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);
    }
}