package com.betulnecanli.mealreceipts;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MealAdapter extends RecyclerView.Adapter<MealAdapter.MealViewHolder> {

    private final ArrayList<MealsModel> mealList;

    // a LayoutInflater object that will be used to inflate the layout for each item in the list.
    private final LayoutInflater layoutInflater;


    public MealAdapter(Context context, ArrayList<MealsModel> mealList) {
        layoutInflater = LayoutInflater.from(context);

        this.mealList = mealList;
    }

    public static class MealViewHolder extends RecyclerView.ViewHolder{
        private final TextView titleTextView;
        private final TextView descTextView;

        public MealViewHolder(View view){
            super(view);

            titleTextView = (TextView) view.findViewById(R.id.textview_meal_title);
            descTextView = (TextView) view.findViewById(R.id.textview_meal_desc);
        }

        public TextView getTitleTextView(){
            return titleTextView;
        }

        public TextView getDescTextView(){
            return descTextView;
        }

    }


    //This method is called by the RecyclerView when it needs to create a new view to display an
    // item in the list. It inflates the layout for the item view from the XML file meal_item_view.xml,
    // and returns a new MealViewHolder object that holds references to the views in the layout.
    @NonNull
    @Override
    public MealViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = layoutInflater.inflate(R.layout.meal_item_view,parent,false);
        return new MealViewHolder(itemView);
    }



    //This method is called by the RecyclerView to bind data to a view that has already been created.
    // It gets the MealModel object that corresponds to the current position in the list,
    // and sets the text of the titleTextView and
    // descTextView views in the MealViewHolder object to the title and description of the MealModel.
    @Override
    public void onBindViewHolder(@NonNull MealViewHolder holder, int position) {
        MealsModel foodModel = mealList.get(position);
        holder.titleTextView.setText(foodModel.getMealTitle());
        holder.descTextView.setText(foodModel.getMealDesc());

    }



    @Override
    public int getItemCount() {
        return mealList.size();
    }




}
