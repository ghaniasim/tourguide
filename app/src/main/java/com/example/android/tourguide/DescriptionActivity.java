package com.example.android.tourguide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

public class DescriptionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.description_view);
        Category clickedItem = null;
        if (getIntent().hasExtra("attractions_position")) {
            int attractions_position = getIntent().getIntExtra("attractions_position", 0);
            clickedItem = AttractionsActivity.categories.get(attractions_position);
        } else if (getIntent().hasExtra("places_position")) {
            int places_position = getIntent().getIntExtra("places_position", 0);
            clickedItem = PlacesActivity.categories.get(places_position);
        } else if (getIntent().hasExtra("food_position")) {
            int food_position = getIntent().getIntExtra("food_position", 0);
            clickedItem = FoodActivity.categories.get(food_position);
        } else if (getIntent().hasExtra("sports_position")) {
            int sports_position = getIntent().getIntExtra("sports_position", 0);
            clickedItem = SportsActivity.categories.get(sports_position);
        }

        if (clickedItem != null) {
            ((TextView) findViewById(R.id.title)).setText(clickedItem.getCategory());
            ((TextView) findViewById(R.id.description)).setText(getString(clickedItem.getDescription()));
            ((ImageView) findViewById(R.id.description_image)).setImageResource(clickedItem.getImage());
            ((ScrollView) findViewById(R.id.description_id)).setBackgroundColor(getResources().getColor(clickedItem.getBackgroundColor()));
        } else {
            Toast.makeText(this, R.string.toast_message, Toast.LENGTH_SHORT).show();
        }
    }

}
