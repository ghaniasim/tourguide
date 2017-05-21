package com.example.android.tourguide;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import static com.example.android.tourguide.R.id.attractions;
import static com.example.android.tourguide.R.id.places;
import static com.example.android.tourguide.R.id.food;
import static com.example.android.tourguide.R.id.sports;

public class ContentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_content);

        // Find the View that shows the attractions
        TextView attractions = (TextView) findViewById(R.id.attractions);

        // Set a click listener on that View
        attractions.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the attractions is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link AttractionsActivity}
                Intent attractionsIntent = new Intent(ContentActivity.this, AttractionsActivity.class);

                // Start the new activity
                startActivity(attractionsIntent);
            }
        });

        // Find the View that shows the places category
        TextView places = (TextView) findViewById(R.id.places);

        // Set a click listener on that View
        places.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the places category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link PlacesActivity}
                Intent placesIntent = new Intent(ContentActivity.this, PlacesActivity.class);

                // Start the new activity
                startActivity(placesIntent);
            }
        });

        // Find the View that shows the food category
        TextView food = (TextView) findViewById(R.id.food);

        // Set a click listener on that View
        food.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the food category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link FoodActivity}
                Intent foodIntent = new Intent(ContentActivity.this, FoodActivity.class);

                // Start the new activity
                startActivity(foodIntent);
            }
        });

        // Find the View that shows the sports category
        TextView sports = (TextView) findViewById(R.id.sports);

        // Set a click listener on that View
        sports.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the sports category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link SportsActivity}
                Intent sportsIntent = new Intent(ContentActivity.this, SportsActivity.class);

                // Start the new activity
                startActivity(sportsIntent);
            }
        });
    }
}
