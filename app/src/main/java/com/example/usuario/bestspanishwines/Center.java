package com.example.usuario.bestspanishwines;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class Center extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_item);

        // Create the list of the content //
        final ArrayList<Content> contents = new ArrayList<Content>();
        contents.add(new Content(getString(R.string.winery_nine), getString(R.string.winename_nine), getString(R.string.description_nine),
                getString(R.string.area_nine), getString(R.string.location_nine), R.drawable.nine));
        contents.add(new Content(getString(R.string.winery_ten), getString(R.string.winename_ten), getString(R.string.description_ten),
                getString(R.string.area_ten), getString(R.string.location_ten), R.drawable.ten));
        contents.add(new Content(getString(R.string.winery_eleven), getString(R.string.winename_eleven), getString(R.string.description_eleven),
                getString(R.string.area_eleven), getString(R.string.location_eleven), R.drawable.eleven));
        contents.add(new Content(getString(R.string.winery_twelve), getString(R.string.winename_twelve), getString(R.string.description_twelve),
                getString(R.string.area_twelve), getString(R.string.location_twelve), R.drawable.twelve));

        // Create a Content adapter, whose data source is a list of wineries and their caracteristics. The
        // adapter knows how to create list items for each item in the list.
        ContentAdapter adapter = new ContentAdapter(this, contents, R.color.category_center);

        // Find the object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // content_list.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);

    }

}