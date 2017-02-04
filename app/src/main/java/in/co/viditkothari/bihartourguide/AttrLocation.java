package in.co.viditkothari.bihartourguide;

/**
 * Created by viditkothari on 29-Jan-17.
 */

public class AttrLocation {
    double mLat;
    double mLong;
    String mShortText;

    public AttrLocation(double mLat, double mLong, String mShortText) {
        this.mLat = mLat;
        this.mLong = mLong;
        this.mShortText = mShortText;
    }

    public double getmLat() {
        return mLat;
    }

    public double getmLong() {
        return mLong;
    }

    public String getmShortText() {
        return mShortText;
    }
}