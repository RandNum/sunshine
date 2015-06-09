package com.android.wiggins.sunshine;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;


/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_main, container, false);

        ArrayList<String> forecastEntries = new ArrayList<>();
        forecastEntries.add("Today - Sunny - 88/63");
        forecastEntries.add("Tomorrow - Foggy - 70/46");
        forecastEntries.add("Weds - Cloudy - 88/63");
        forecastEntries.add("Thurs - Rainy - 88/63");
        forecastEntries.add("Friday - Foggy - 88/63");
        forecastEntries.add("Sat - Sunny - 88/63");

        //Use above created array data to populate ArrayAdaptar object
        ArrayAdapter forecastAdaptar = new ArrayAdapter(getActivity(), R.layout.list_item_forecast, R.id.list_item_forecast_textview, forecastEntries);

        ListView listView = (ListView) rootView.findViewById(R.id.list_item_forecast);
        listView.setAdapter(forecastAdaptar);

        return rootView;
    }
}
