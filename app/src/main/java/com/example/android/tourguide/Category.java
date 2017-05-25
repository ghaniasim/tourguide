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

/**
 * {@link Category} represents a list that the user wants to explore.
 */
public class Category {

    /**
     * list of category
     */
    private String mCategory;
    private int mImageResourceId = NO_IMAGE_PROVIDED;
    private int mDescriptionId;
    private int mBackgroundColor;
    private static final int NO_IMAGE_PROVIDED = -1;

    /**
     * Create a new Category object.
     *
     * @param category
     */
    public Category(String category) {
        mCategory = category;
    }

    public Category(String category, int imageResourceId, int descriptionId, int color) {
        mCategory = category;
        mImageResourceId = imageResourceId;
        mDescriptionId = descriptionId;
        mBackgroundColor = color;
    }

    /**
     * Get the name of the category.
     */
    public String getCategory() {
        return mCategory;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }

    public int getBackgroundColor() {
        return mBackgroundColor;
    }

    public int getDescription() {
        return mDescriptionId;
    }

    /**
     * Returns wether or not there is an image for the word.
     */
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

}