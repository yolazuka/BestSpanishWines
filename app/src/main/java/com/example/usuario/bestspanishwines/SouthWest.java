package com.example.usuario.bestspanishwines;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class SouthWest extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_item);

        // Create the list of the content //
        final ArrayList<Content> contents = new ArrayList<Content>();
        contents.add(new Content(getString(R.string.winery_thirteen), getString(R.string.winename_thirteen), getString(R.string.description_thirteen),
                getString(R.string.area_thirteen), getString(R.string.location_thirteen), R.mipmap.ic_launcher));
        contents.add(new Content(getString(R.string.winery_fourteen), getString(R.string.winename_fourteen), getString(R.string.description_fourteen),
                getString(R.string.area_fourteen), getString(R.string.location_fourteen), R.mipmap.ic_launcher));
        contents.add(new Content(getString(R.string.winery_fiveteen), getString(R.string.winename_fiveteen), getString(R.string.description_fiveteen),
                getString(R.string.area_fiveteen), getString(R.string.location_fiveteen), R.mipmap.ic_launcher));
        contents.add(new Content(getString(R.string.winery_sixteen), getString(R.string.winename_sixteen), getString(R.string.description_sixteen),
                getString(R.string.area_sixteen), getString(R.string.location_sixteen), R.mipmap.ic_launcher));


        // Create a Content adapter, whose data source is a list of wineries and their caracteristics. The
        // adapter knows how to create list items for each item in the list.
        ContentAdapter adapter = new ContentAdapter(this, contents, R.color.category_southwest);

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

}