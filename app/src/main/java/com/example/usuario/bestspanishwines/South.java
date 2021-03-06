package com.example.usuario.bestspanishwines;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class South extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_item);

        // Create the list of the content //
        final ArrayList<Content> contents = new ArrayList<Content>();
        contents.add(new Content(getString(R.string.winery_five), getString(R.string.winename_five), getString(R.string.description_five),
                getString(R.string.area_five), getString(R.string.location_five), R.drawable.five));
        contents.add(new Content(getString(R.string.winery_six), getString(R.string.winename_six), getString(R.string.description_six),
                getString(R.string.area_six), getString(R.string.location_six), R.drawable.six));
        contents.add(new Content(getString(R.string.winery_seven), getString(R.string.winename_seven), getString(R.string.description_seven),
                getString(R.string.area_seven), getString(R.string.location_seven), R.drawable.seven));
        contents.add(new Content(getString(R.string.winery_eight), getString(R.string.winename_eight), getString(R.string.description_eight),
                getString(R.string.area_eight), getString(R.string.location_eight), R.drawable.eight));

        // Create a Content adapter, whose data source is a list of wineries and their caracteristics. The
        // adapter knows how to create list items for each item in the list.
        ContentAdapter adapter = new ContentAdapter(this, contents, R.color.category_south);

        // Find the object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // content_list.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);

    }

}


