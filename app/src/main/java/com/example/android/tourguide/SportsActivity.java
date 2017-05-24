package com.example.android.tourguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class SportsActivity extends AppCompatActivity {

    public static ArrayList<Category> categories = new ArrayList<Category>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.category_list);

        // Create a list of categories
        categories.add(new Category(getString(R.string.title_gaddafi), R.drawable.gaddafi_stadium, R.string.gaddafi_stadium, R.color.category_sports));
        categories.add(new Category(getString(R.string.title_hockey), R.drawable.national_stadium, R.string.national_stadium, R.color.category_sports));
        categories.add(new Category(getString(R.string.title_academy), R.drawable.aleem_dar, R.string.aleem_dar, R.color.category_sports));
        categories.add(new Category(getString(R.string.title_dha), R.drawable.dha_sports_complex, R.string.DHA_sports_complex, R.color.category_sports));

        // Create an {@link CategoryAdaptor}, whose data source is a list of {@link Category}s. The
        // adapter knows how to create list items for each item in the list.
        CategoryAdaptor adaptor = new CategoryAdaptor(this, categories, R.color.category_sports);

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
                Intent myIntent = new Intent(SportsActivity.this, DescriptionActivity.class);
                myIntent.putExtra("sports_position", position);
                startActivity(myIntent);
            }
        });
    }
}
