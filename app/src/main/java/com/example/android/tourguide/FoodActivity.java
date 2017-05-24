package com.example.android.tourguide;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class FoodActivity extends AppCompatActivity {

    public static ArrayList<Category> categories = new ArrayList<Category>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.category_list);

        // Create a list of categories

        categories.add(new Category(getString(R.string.title_lassi), R.drawable.fiqay_ki_lassi, R.string.fiqay_ki_lassi, R.color.category_food));
        categories.add(new Category(getString(R.string.title_paaye), R.drawable.nasir_k_paaye, R.string.nasir_k_paaye, R.color.category_food));
        categories.add(new Category(getString(R.string.title_kebab), R.drawable.bhaiya_k_kebab, R.string.bhaiya_k_kebab, R.color.category_food));
        categories.add(new Category(getString(R.string.title_bashir), R.drawable.bashir_darul_mahi, R.string.bashir_darul_mahi, R.color.category_food));
        categories.add(new Category(getString(R.string.title_puri), R.drawable.taj_puri_wala, R.string.taj_puri_wala, R.color.category_food));
        categories.add(new Category(getString(R.string.title_hareesa), R.drawable.amritsari_hareesa, R.string.amritsari_hareesa, R.color.category_food));
        categories.add(new Category(getString(R.string.title_falooda), R.drawable.riaz_falooda, R.string.riaz_falooda, R.color.category_food));
        categories.add(new Category(getString(R.string.title_nisbat), R.drawable.nisbat_road, R.string.nisbat_road, R.color.category_food));
        categories.add(new Category(getString(R.string.title_karahi), R.drawable.butt_ki_karahi, R.string.butt_ki_karashi, R.color.category_food));
        categories.add(new Category(getString(R.string.title_nishat), R.drawable.nishat_takatak, R.string.nisbat_road, R.color.category_food));
        categories.add(new Category(getString(R.string.title_nafees), R.drawable.bhallay, R.string.nafees_bhalay, R.color.category_food));
        categories.add(new Category(getString(R.string.title_nihari), R.drawable.waris_nihari, R.string.waris_nihari, R.color.category_food));
        categories.add(new Category(getString(R.string.title_kulfa), R.drawable.kulfa, R.string.benazir_kulfa, R.color.category_food));

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

        // Set onClickListener to each list item.
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                Intent myIntent = new Intent(FoodActivity.this, DescriptionActivity.class);
                myIntent.putExtra("food_position", position);
                startActivity(myIntent);
            }
        });
    }
}
