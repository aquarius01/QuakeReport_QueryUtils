package com.example.android.quakereport;

import java.util.Date;

/**
 * Created by aquar on 2017-01-19.
 */

public class Earthquake {

    /** Int resource ID for the default magnitute of the Earthquake */
    private Double mMagnitudeOfQuake;

    /** String for the place of the Earthquake */
    private String mPlaceOfQuake;

    /** String for the Date of the Earthquake */
    private String mDateOfQuake;

    /**
     * Create a new Earthquake object.
     *
     * @param magnitudeOfQuake is the int that corresponds to magnitude value of quake.
     * @param placeOfQuake is the int corresponds to Place of guake.
     * @param dateOfQuake is the Date class objest correspods to Date and time od quake.
     */
    public Earthquake(Double magnitudeOfQuake, String placeOfQuake, String dateOfQuake) {
        mMagnitudeOfQuake = magnitudeOfQuake;
        mPlaceOfQuake = placeOfQuake;
        mDateOfQuake = dateOfQuake;
    }

    /**
     * Get the string resource ID for the default translation of the word.
     */
    public Double getMagnitudeOfQuake() {
        return mMagnitudeOfQuake;
    }

    /**
     * Get the string resource ID for the Miwok translation of the word.
     */
    public String getPlaceOfQuake() {
        return mPlaceOfQuake;
    }

    /**
     * Return the image resource ID of the word.
     */
    public String getDateOfQuake() {
        return mDateOfQuake;
    }
}
