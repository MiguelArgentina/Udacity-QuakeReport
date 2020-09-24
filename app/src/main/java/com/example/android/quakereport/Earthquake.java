package com.example.android.quakereport;

import java.util.Date;

public class Earthquake {
    private String mMag;
    private String mLocation;
    private String mDateOccured;

    public Earthquake (String magnitude, String location, String dateOccured){
        mMag=magnitude;
        mLocation=location;
        mDateOccured=dateOccured;
    }

    public String getmMag() {
        return mMag;
    }

    public String getmLocation() {
        return mLocation;
    }

    public String getmDateOccured() {
        return mDateOccured;
    }
}
