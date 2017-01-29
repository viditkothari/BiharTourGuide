package in.co.viditkothari.bihartourguide;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by viditkothari on 29-Jan-17.
 */

public class AttractionAdapter extends ArrayAdapter<Attraction>  {

    /** Resource ID for the background color for this list of Attractions */
    // private int mColorResourceId;

    public AttractionAdapter(Context context, ArrayList<Attraction> Attractions, int colorResourceId) {
        super(context, 0, Attractions);
        // mColorResourceId = colorResourceId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.attraction_list_item, parent, false);
        }

        ImageView imgv_attr_image = (ImageView)convertView.findViewById(R.id.attr_image);
        TextView tv_attr_name = (TextView)convertView.findViewById(R.id.attr_name);
        TextView tv_attr_date = (TextView)convertView.findViewById(R.id.attr_date);
        TextView tv_attr_location = (TextView)convertView.findViewById(R.id.attr_location);
        TextView tv_attr_owner_organiser = (TextView)convertView.findViewById(R.id.attr_owner_organiser);
        TextView tv_attr_description = (TextView)convertView.findViewById(R.id.attr_description);

        // Get the {@link Attraction} object located at this position in the list
        Attraction attraction = getItem(position);

        tv_attr_name.setText(attraction.getmAttrName());
        tv_attr_date.setText(attraction.getmDate()); // Date is converted to String in the Attraction class itself
        tv_attr_location.setText(attraction.getmAttrlocation()); // Location is converted to String in the Attraction class itself
        tv_attr_owner_organiser.setText(attraction.getmOwner_or_organiser());
        tv_attr_description.setText(attraction.getmDescription());

        // Check if an image is provided for this Attraction or not
        if (attraction.hasImage()) {
            // If an image is available, display the provided image based on the resource ID
            imgv_attr_image.setImageResource(attraction.getmImageResourceId());
            // Make sure the view is visible
            imgv_attr_image.setVisibility(View.VISIBLE);
        } else {
            // Otherwise hide the ImageView (set visibility to GONE)
            imgv_attr_image.setVisibility(View.INVISIBLE);

        }
/*
        // Set the theme color for the list item
        View textContainer = convertView.findViewById(R.id.text_container);
        // Find the color that the resource ID maps to
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        // Set the background color of the text container View
        textContainer.setBackgroundColor(color);*/

        // Return the whole list item layout (containing 2 TextViews) so that it can be shown in
        // the ListView.
        return convertView;
    }
}