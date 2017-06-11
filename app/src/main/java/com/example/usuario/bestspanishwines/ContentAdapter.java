package com.example.usuario.bestspanishwines;

/**
 * Created by Usuario on 7/6/17.
 */

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * {@link ContentAdapter} is an {@link ArrayAdapter} that can provide the layout for each list item
 * based on a data source, which is a list of {@link Content} objects.
 */
public class ContentAdapter extends ArrayAdapter<Content> {

    /** Declare the Resource ID for the background color for this list of content*/
    private int mColorResourceId;

    /**
     * Create a new {@link ContentAdapter} object.
     *
     * @param context is the current context (i.e. Activity) that the adapter is being created in.
     * @param contents is the list of {@link Content}s to be displayed.
     * @param colorResourceId is the resource ID for the background color for this list of words
     */
    public ContentAdapter(Context context, ArrayList<Content> contents, int colorResourceId) {
        super(context, 0, contents);
        mColorResourceId = colorResourceId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.content_list, parent, false);
        }

        // Get the {@link Content} object located at this position in the list
        Content currentContent = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID Winery_name
        TextView wineryNameTextView = (TextView) listItemView.findViewById(R.id.winery_name);
        // Get name of the Winery
        wineryNameTextView.setText(currentContent.getWineryName());

        // Find the TextView in the list_item.xml layout with the ID wine_name.
        TextView wineNameTextView = (TextView) listItemView.findViewById(R.id.wine_name);
        // Get the specialty wine name object and set this text on
        // the default TextView.
        wineNameTextView.setText(currentContent.getWineName());

        // Find the TextView in the list_item.xml layout with the ID description ( of the Winery ).
        TextView descriptionTextView = (TextView) listItemView.findViewById(R.id.description);
        // Get the description of the Winery  and set this text on
        // the default TextView.
        descriptionTextView.setText(currentContent.getDescription());

        // Find the TextView in the list_item.xml layout with the ID area ( of the Winery ).
        TextView areaTextView = (TextView) listItemView.findViewById(R.id.area);
        // Get the area where the Winery is located, and set this text on
        // the default TextView.
        areaTextView.setText(currentContent.getArea());

        // Find the TextView in the list_item.xml layout with the ID location ( of the Winery ).
        TextView locationTextView = (TextView) listItemView.findViewById(R.id.location);
        // Get the area where the Winery is located, and set this text on
        // the default TextView.
        locationTextView.setText(currentContent.getLocation());

        // Find the ImageView in the list_item.xml layout with the ID image.
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);
        // Get the image and set it into the list view - into the view image -
        imageView.setImageResource(currentContent.getImageResourceId());

        // Set the theme color for the list items
        View textContainerOne = listItemView.findViewById(R.id.list_item_layout);
        // Find the color that the resource ID maps to
        int colorOne = ContextCompat.getColor(getContext(), mColorResourceId);
        // Set the background color of the text container View
        textContainerOne.setBackgroundColor(colorOne);

        // Return the whole list item layout (containing 5 TextViews) so that it can be shown in
        // the ListView.
        return listItemView;
    }
}
