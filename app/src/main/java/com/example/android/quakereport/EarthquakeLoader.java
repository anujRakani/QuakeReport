package com.example.android.quakereport;


import android.content.AsyncTaskLoader;
import android.content.Context;

import java.util.List;

/**
 * Created by PC on 23-Feb-17.
 */

public class EarthquakeLoader extends AsyncTaskLoader<List<Earthquake>> {

    String mURL;

    public EarthquakeLoader(Context context, String url) {
        super(context);

        mURL = url;
    }

    @Override
    protected void onStartLoading() {
        forceLoad();
    }

    @Override
    public List<Earthquake> loadInBackground() {
        // Don't perform the request if there are no URLs, or the first URL is null.
        if (mURL == null) {
            return null;
        }

        // Perform the HTTP request for earthquake data and process the response.
        List<Earthquake> earthquakes = QueryUtils.fetchEarthquakeData(mURL);
        return earthquakes;
    }
}
