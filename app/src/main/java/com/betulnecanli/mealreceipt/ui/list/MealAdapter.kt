package com.betulnecanli.mealreceipt.ui.list

import android.content.Context
import com.betulnecanli.mealreceipt.model.MealsModel
import androidx.recyclerview.widget.RecyclerView
import com.betulnecanli.mealreceipt.ui.list.MealAdapter.MealViewHolder
import android.view.LayoutInflater
import android.widget.TextView
import android.view.ViewGroup
import android.view.View
import com.betulnecanli.mealreceipt.R
import java.util.ArrayList

class MealAdapter(context: Context?, mealList: List<MealsModel>, private val clicked : (MealsModel)-> Unit) :
    RecyclerView.Adapter<MealViewHolder>() {
    private val mealList: List<MealsModel>

    // a LayoutInflater object that will be used to inflate the layout for each item in the list.
    private val layoutInflater: LayoutInflater

    inner class MealViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val titleTextView: TextView
        val descTextView: TextView

        init {
            titleTextView = view.findViewById<View>(R.id.textview_meal_title) as TextView
            descTextView = view.findViewById<View>(R.id.textview_meal_desc) as TextView
            view.setOnClickListener{
                clicked(mealList[adapterPosition])
            }
        }
    }



    //This method is called by the RecyclerView when it needs to create a new view to display an
    // item in the list. It inflates the layout for the item view from the XML file meal_item_view.xml,
    // and returns a new MealViewHolder object that holds references to the views in the layout.
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MealViewHolder {
        val itemView = layoutInflater.inflate(R.layout.meal_item_view, parent, false)
        return MealViewHolder(itemView)
    }

    //This method is called by the RecyclerView to bind data to a view that has already been created.
    // It gets the MealModel object that corresponds to the current position in the list,
    // and sets the text of the titleTextView and
    // descTextView views in the MealViewHolder object to the title and description of the MealModel.
    override fun onBindViewHolder(holder: MealViewHolder, position: Int) {
        val foodModel = mealList[position]
        holder.titleTextView.text = foodModel.mealTitle
        holder.descTextView.text = foodModel.mealDesc
    }

    override fun getItemCount(): Int {
        return mealList.size
    }

    init {
        layoutInflater = LayoutInflater.from(context)
        this.mealList = mealList
    }
}