package com.example.android.tourguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

import static com.example.android.tourguide.AttractionsActivity.categories;

public class PlacesActivity extends AppCompatActivity {

    public static ArrayList<Category> categories = new ArrayList<Category>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.category_list);

        // Create a list of categories
        categories.add(new Category("Shalimar Gardens, Lahore", R.drawable.shalimar_gardens, R.string.shalimar_gardens, R.color.category_places));
        categories.add(new Category("Badshahi Mosque", R.drawable.badshahi_mosque, R.string.badshahi_mosque, R.color.category_places));
        categories.add(new Category("Lahore Fort", R.drawable.lahore_fort,R.string.lahore_fort, R.color.category_places));
        categories.add(new Category("Wazir Khan Mosque", R.drawable.wazir_khan_mosque, R.string.wazir_khan_mosque, R.color.category_places));
        categories.add(new Category("Minar-e-Pakistan", R.drawable.minar_e_pakistan, R.string.minar_e_pakistan, R.color.category_places));
        categories.add(new Category("Sheesh Mahal", R.drawable.sheesh_mahal, R.string.sheesh_mahal, R.color.category_places));
        categories.add(new Category("Moti Masjid", R.drawable.moti_masjid, R.string.moti_masjid, R.color.category_places));
        categories.add(new Category("Jallo Park", R.drawable.jallo_park, R.string.jalo_park, R.color.category_places));
        categories.add(new Category("Hiran Minar", R.drawable.hiran_minar, R.string.hiran_minar, R.color.category_places));
        categories.add(new Category("Data Durbar Complex", R.drawable.data_darbar_complex, R.string.data_darbar_complex, R.color.category_places));
        categories.add(new Category("Delhi Gate", R.drawable.delhi_gate, R.string.delhi_gate, R.color.category_places));
        categories.add(new Category("Mochi Gate", R.drawable.mochi_gate, R.string.mochi_gate, R.color.category_places));
        categories.add(new Category("Hazuri Bagh", R.drawable.hazuri_bagh, R.string.hazzuri_bagh, R.color.category_places));

        // Create an {@link CategoryAdaptor}, whose data source is a list of {@link Category}s. The
        // adapter knows how to create list items for each item in the list.
        CategoryAdaptor adaptor = new CategoryAdaptor(this, categories, R.color.category_places);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adaptor);

        // Set onClickListener to each list item.
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                Intent myIntent = new Intent(PlacesActivity.this, DescriptionActivity.class);
                myIntent.putExtra("places_position", position);
                startActivity(myIntent);
            }});
    }
}
