package in.co.viditkothari.bihartourguide;

import android.text.TextUtils;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by viditkothari on 29-Jan-17.
 */

public class Attraction {
    private String mAttrName;
    private AttrLocation mAttrlocation;
    private String mOwner_or_organiser;
    private String mDescription;
    private Date mDate;
    private static final int NO_IMAGE_PROVIDED = -1;
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    public Attraction(String mAttrName, AttrLocation mAttrlocation, String mOwner_or_organiser, String mDescription, Date mDate, int mImageResourceId) {
        this.mAttrName = mAttrName;
        this.mAttrlocation = mAttrlocation;
        this.mOwner_or_organiser = mOwner_or_organiser;
        this.mDescription = mDescription;
        this.mDate = mDate;
        this.mImageResourceId = mImageResourceId;
    }

    public Attraction(String mAttrName, AttrLocation mAttrlocation, String mOwner_or_organiser, String mDescription, int mImageResourceId) {
        this.mAttrName = mAttrName;
        this.mAttrlocation = mAttrlocation;
        this.mOwner_or_organiser = mOwner_or_organiser;
        this.mDescription = mDescription;
        this.mImageResourceId = mImageResourceId;
    }

    public Attraction(String mAttrName, AttrLocation mAttrlocation, String mDescription, int mImageResourceId) {
        this.mAttrName = mAttrName;
        this.mAttrlocation = mAttrlocation;
        this.mDescription = mDescription;
        this.mImageResourceId = mImageResourceId;
    }

    public String getmAttrName() {
        return mAttrName;
    }

    public String getmAttrlocation() {  // Location is converted to String in the Attraction class itself
        return "Lat: " + String.valueOf(mAttrlocation.getmLat()) + "Lon: " + String.valueOf(mAttrlocation.getmLong()) + " | " + mAttrlocation.getmShortText();
    }

    public String getmOwner_or_organiser() {
        if(TextUtils.isEmpty(mOwner_or_organiser))
            return " ";
        return mOwner_or_organiser;
    }

    public String getmDescription() {
        return mDescription;
    }

    public String getmDate() {  // Date is converted to String in the Attraction class itself
        String x = " ";
        if(mDate != null)
            x = (new SimpleDateFormat("dd MMM, yyyy")).format(mDate);
        return x;
    }

    public int getmImageResourceId() {
        return mImageResourceId;
    }

    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }
}
