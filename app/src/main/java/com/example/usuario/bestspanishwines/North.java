package com.example.usuario.bestspanishwines;

import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class North extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_item);

        //It creates the Up navigation button through the activities //

        getActionBar().setDisplayHomeAsUpEnabled(true);

        // Create the list of the content //
        final ArrayList<Content> contents = new ArrayList<Content>();
        contents.add(new Content(getString(R.string.winery_one), getString(R.string.winename_one), getString(R.string.description_one),
                getString(R.string.area_one), getString(R.string.location_one), R.mipmap.ic_launcher));
        contents.add(new Content(getString(R.string.winery_two), getString(R.string.winename_two), getString(R.string.description_two),
                getString(R.string.area_two), getString(R.string.location_two), R.mipmap.ic_launcher));
        contents.add(new Content(getString(R.string.winery_three), getString(R.string.winename_three), getString(R.string.description_three),
                getString(R.string.area_three), getString(R.string.location_three), R.mipmap.ic_launcher));
        contents.add(new Content(getString(R.string.winery_four), getString(R.string.winename_four), getString(R.string.description_four),
                getString(R.string.area_four), getString(R.string.location_four), R.mipmap.ic_launcher));

        // Create a Content adapter, whose data source is a list of wineries and their caracteristics. The
        // adapter knows how to create list items for each item in the list.
        ContentAdapter adapter = new ContentAdapter(this, contents, R.color.category_north);

        // Find the object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // content_list.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override

            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                // Get the content object at the given position the user clicked on */

                Content content = contents.get(position);

            }

        });

    }

    // when the user presses it, the current activity receives a call to onOptionsItemSelected() //
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                NavUtils.navigateUpFromSameTask(this);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

}



