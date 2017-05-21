package com.example.android.tourguide;

import android.content.Intent;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class AttractionsActivity extends AppCompatActivity {

    public static ArrayList<Category> categories = new ArrayList<Category>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.category_list);

        // Create a list of categories
        categories.add(new Category("Sozo Water Park", R.drawable.sozo_water_park, R.string.sozo_description, R.color.category_attractions));
        categories.add(new Category("Lahore Zoo Safari", R.drawable.lahore_zoo_safari, R.string.lahore_zoo_safari, R.color.category_attractions));
        categories.add(new Category("Lahore Museum", R.drawable.lahore_museum, R.string.lahore_museum, R.color.category_attractions));
        categories.add(new Category("Bagh-e-Jinnah Lahore", R.drawable.bagh_e_jinnah, R.string.bagh_e_jinnah, R.color.category_attractions));
        categories.add(new Category("Gulshan-e-Iqbal Park", R.drawable.gulshan_e_iqbal, R.string.gulshan_e_iqbal, R.color.category_attractions));
        categories.add(new Category("Jilani Park", R.drawable.jilani_park, R.string.jilani_park, R.color.category_attractions));
        categories.add(new Category("JoyLand", R.drawable.joyland, R.string.joyland, R.color.category_attractions));
        categories.add(new Category("Unicorn Gallery", R.drawable.unicorn_gallery, R.string.unicorn_gallery, R.color.category_attractions));
        categories.add(new Category("Sindbad", R.drawable.sindbad, R.string.sindbad, R.color.category_attractions));
        categories.add(new Category("Shakir Ali Museum", R.drawable.shakir_ali_museum, R.string.shakir_ali_museum, R.color.category_attractions));



        // Create an {@link CategoryAdaptor}, whose data source is a list of {@link Category}s. The
        // adapter knows how to create list items for each item in the list.
        CategoryAdaptor adaptor = new CategoryAdaptor(this, categories, R.color.category_attractions);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        final ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adaptor);

        // Set onClickListener to each list item.
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                Intent myIntent = new Intent(AttractionsActivity.this, DescriptionActivity.class);
                myIntent.putExtra("attractions_position", position);
                startActivity(myIntent);
            }});
    }
}
