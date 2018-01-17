package com.example.android.sunshine;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.List;

/**
 * Created by michael on 6/26/17.
 */

// Within ForecastAdapter.java /////////////////////////////////////////////////////////////////





public class ForecastAdapter extends RecyclerView.Adapter<ForecastAdapter.ForecastAdapterViewholder> {
    //Recycler
    private String[] mWeatherData;

    public ForecastAdapter(){}

    public class ForecastAdapterViewHolder extends RecyclerView.ViewHolder{
        //RecyclerView.Adapter<ForecastAdapter.ForecastAdapterViewHolder>{
        //adapte
        //DOne (28) Set the text of the TextView to the weather for this list item's position
        public final TextView mWeatherTextView;

        public ForecastAdapterViewHolder(View thisView){
            super(thisView);
            this.mWeatherTextView = (TextView)thisView.findViewById(R.id.tv_weather_data);
        }

    }



    @Override
    public ForecastAdapterViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        // done (24) Override onCreateViewHolder
        // done (25) Within onCreateViewHolder, inflate the list item xml into a view
        Context context = parent.getContext();
        int layoutIdForListItem = R.layout.forecast_list_item;
        LayoutInflater inflater = LayoutInflater.from(context);
        boolean shouldAttachToParentimmediately = false;
        View view = inflater.inflate(layoutIdForListItem, parent, shouldAttachToParentimmediately);
// done (26) Within onCreateViewHolder, return a new ForecastAdapterViewHolder with
    // the above view passed in as a parameter
        return new ForecastAdapterViewHolder(parent);
    }

    @Override
    public void onBindViewHolder(ForecastAdapterViewHolder holder, int position){
        // done (27) Override onBindViewHolder
        //holder.bind(position);
        String weatherForThisDay = mWeatherData[position];
        holder.mWeatherTextView.setText(weatherForThisDay);
    }


    // dO (29) Override getItemCount
// DO (30) Return 0 if mWeatherData is null, or the size of mWeatherData if it is not null
    @Override
    public int getItemCount() {
        if( mWeatherData==null){
            return 0;
        }else{
            return mWeatherData.length;
        }
    }

    // TO//DO (31) Create a setWeatherData method that saves the weatherData to mWeatherData
// TO//DO (32) After you save mWeatherData, call notifyDataSetChanged
    public void setWeatherData(String[] data){
        mWeatherData=data;
        notifyDataSetChanged();
    }
}





