/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.tourguide;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.support.v4.media.MediaDescriptionCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.android.tourguide.R;

import java.util.ArrayList;

/**
 * {@link CategoryAdaptor} is an {@link CategoryAdaptor} that can provide the layout for each list item
 * based on a data source, which is a list of {@link Category} objects.
 */
public class CategoryAdaptor extends ArrayAdapter<Category>  {

    /** Resource ID for the background color for this list of words. */
    private int mColorResourceID;

    /**
     * Create a new {@link CategoryAdaptor} object.
     *
     * @param context is the current context (i.e. Activity) that the adapter is being created in.
     * @param category is the list of {@link Category}s to be displayed.
     */
    public CategoryAdaptor(Context context, ArrayList<Category> category, int colorResourceID) {
        super(context, 0, category);
        mColorResourceID = colorResourceID;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link Category} object located at this position in the list
        Category currentCategory = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID category_view.
        TextView categoryView = (TextView) listItemView.findViewById(R.id.catergory_view);
        // Get the Category from the currentCategry object and set this text on
        // the Category TextView.
        categoryView.setText(currentCategory.getCategory());


        // Set the theme color for the list item
        View textContainer = listItemView.findViewById(R.id.text_container);
        // Find the color that resource ID maps
        int color = ContextCompat.getColor(getContext(), mColorResourceID);
        // Set the background color of the text container view
        textContainer.setBackgroundColor(color);

        // Return the whole list item layout so that it can be shown in
        // the ListView.
        return listItemView;
    }

}