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
package com.example.android.recyclerview;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * We couldn't come up with a good name for this class. Then, we realized
 * that this lesson is about RecyclerView.
 *
 * RecyclerView... Recycling... Saving the planet? Being green? Anyone?
 * #crickets
 *
 * Avoid unnecessary garbage collection by using RecyclerView and ViewHolders.
 *
 * If you don't like our puns, we named this Adapter GreenAdapter because its
 * contents are green.
 */



    /**
     * Cache of the children views for a list item.
     */


// TODO (4) From GreenAdapter, extend RecyclerView.Adapter<NumberViewHolder>
public class GreenAdapter extends RecyclerView.Adapter<GreenAdapter.NumberViewHolder> {

    private int mNumberItems;

    public GreenAdapter(int numberOfItems) {
        // TODO (3) Store the numberOfItems parameter in mNumberItems
        mNumberItems = numberOfItems;

    }

    @Override
    public NumberViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        int layoutIdForListItem = R.layout.number_list_item;
        LayoutInflater inflater = LayoutInflater.from(context);
        boolean shouldAttachToParentImmediately = false;
        // TODO (5) Override the onCreateViewHolder method
        // TODO (6) Create and return a new NumberViewHolder within this method
        View view=inflater.inflate(layoutIdForListItem,parent,shouldAttachToParentImmediately);
        return new NumberViewHolder(view);
    }

    @Override
    public void onBindViewHolder(NumberViewHolder holder, int position) {
        // TODO (7) Override onBindViewHolde
        // TODO (8) Within onBindViewHolder, call holder.bind and pass in the position
        holder.bind(position);
    }

    @Override
    public int getItemCount() {
        // TODO (9) Override getItemCount and return the number of items to display
        return mNumberItems;
    }
        class NumberViewHolder extends RecyclerView.ViewHolder {

            // Will display the position in the list, ie 0 through getItemCount() - 1
            TextView listItemNumberView;

            /**
             * Constructor for our ViewHolder. Within this constructor, we get a reference to our
             * TextViews and set an onClickListener to listen for clicks. Those will be handled in the
             * onClick method below.
             * @param itemView The View that you inflated in
             *                 {@link GreenAdapter#onCreateViewHolder(ViewGroup, int)}
             */
            public NumberViewHolder(View itemView) {
                super(itemView);

                listItemNumberView = (TextView) itemView.findViewById(R.id.tv_item_number);
            }

            /**
             * A method we wrote for convenience. This method will take an integer as input and
             * use that integer to display the appropriate text within a list item.
             * @param listIndex Position of the item in the list
             */
            void bind(int listIndex) {
                listItemNumberView.setText(String.valueOf(listIndex));
            }
        }
}
