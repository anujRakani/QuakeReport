package com.example.android.quakereport;

/**
 * Created by PC on 13-Feb-17.
 */

public class Earthquake {

    private float mMagnitude;

    private String mLocation;

    private long mTimeInMilliseconds;

    private String mURL;

    public Earthquake(float mMagnitude, String mLocation, long mTimeInMilliseconds, String url) {
        this.mMagnitude = mMagnitude;
        this.mLocation = mLocation;
        this.mTimeInMilliseconds = mTimeInMilliseconds;
        this.mURL = url;
    }

    public float getmMagnitude() {
        return mMagnitude;
    }

    public String getmLocation() {
        return mLocation;
    }

    public long getmTimeInMilliseconds() {
        return mTimeInMilliseconds;
    }

    public String getmURL() {
        return mURL;
    }
}
