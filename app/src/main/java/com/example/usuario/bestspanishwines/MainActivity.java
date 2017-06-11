
package com.example.usuario.bestspanishwines;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        //We customize here the type of fond for the categories text Style //

        Typeface typefaceCover = Typeface.createFromAsset(getAssets(), "fonts/Wine.ttf");

        ((TextView) findViewById(R.id.north)).setTypeface(typefaceCover);
        ((TextView) findViewById(R.id.south)).setTypeface(typefaceCover);
        ((TextView) findViewById(R.id.center)).setTypeface(typefaceCover);
        ((TextView) findViewById(R.id.southwest)).setTypeface(typefaceCover);

        // Find the View that shows the numbers category
        TextView north = (TextView) findViewById(R.id.north);

        // Set a click listener on that View
        north.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent northIntent = new Intent(MainActivity.this, North.class);

                // Start the new activity
                startActivity(northIntent);
            }
        });

        // Find the View that shows the family category
        TextView south = (TextView) findViewById(R.id.south);

        // Set a click listener on that View
        south.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the family category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link FamilyActivity}
                Intent southIntent = new Intent(MainActivity.this, South.class);

                // Start the new activity
                startActivity(southIntent);
            }
        });

        // Find the View that shows the colors category
        TextView center = (TextView) findViewById(R.id.center);

        // Set a click listener on that View
        center.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the colors category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link ColorsActivity}
                Intent centerIntent = new Intent(MainActivity.this, Center.class);

                // Start the new activity
                startActivity(centerIntent);
            }
        });

        // Find the View that shows the phrases category
        TextView southwest = (TextView) findViewById(R.id.southwest);

        // Set a click listener on that View
        southwest.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the phrases category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link PhrasesActivity}
                Intent southWestIntent = new Intent(MainActivity.this, SouthWest.class);

                // Start the new activity
                startActivity(southWestIntent);
            }
        });
    }

}