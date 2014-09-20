package com.bignerdranch.android.criminalintent;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.UUID;
import java.util.Date;

/**
 * Created by Muaz on 9/6/14.
 */
public class Crime {

    private UUID mId;
    private String mTitle;

    private DateFormat mDate;
    private Boolean mSolved;

    public Crime(){
        //Generate unique identifier
        mId = UUID.randomUUID();
        mDate = new SimpleDateFormat("EEEE, MMM dd, yyyy.");
    }

    @Override
    public String toString() {
        return mTitle;
    }

    public UUID getId() {
        return mId;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String Title) {
        this.mTitle = Title;
    }

    public String getDate() {
        return mDate.format(new Date());
    }

    public void setDate(DateFormat mDate) {
        this.mDate = mDate;
    }

    public Boolean isSolved() {
        return mSolved;
    }

    public void setSolved(Boolean mSolved) {
        this.mSolved = mSolved;
    }

}
