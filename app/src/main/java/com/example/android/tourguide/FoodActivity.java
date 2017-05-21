package com.example.android.tourguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class FoodActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.category_list);

        // Create a list of categories
        final ArrayList<Category> categories = new ArrayList<Category>();
        categories.add(new Category("Fiqay Ki Lassi"));
        categories.add(new Category("Nasir kai Paaye"));
        categories.add(new Category("Bhaiya kai Kebab"));
        categories.add(new Category("Bashir Darul Mahi"));
        categories.add(new Category("Taj Puri Wala"));
        categories.add(new Category("Amritsari Hareesa"));
        categories.add(new Category("Riaz Falooda"));
        categories.add(new Category("Nisbat Road Kai Gol Gappay"));
        categories.add(new Category("Butt ki karhai"));
        categories.add(new Category("Nishat Takatak"));
        categories.add(new Category("Nafees Dahi Bhalay"));
        categories.add(new Category("Waris Nihari"));
        categories.add(new Category("Benazir Kulfa"));

        // Create an {@link CategoryAdaptor}, whose data source is a list of {@link Category}s. The
        // adapter knows how to create list items for each item in the list.
        CategoryAdaptor adaptor = new CategoryAdaptor(this, categories, R.color.category_food);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adaptor);
    }
}
