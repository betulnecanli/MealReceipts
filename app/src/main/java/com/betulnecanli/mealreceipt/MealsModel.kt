package com.betulnecanli.mealreceipt

import com.betulnecanli.mealreceipt.MealsModel
import androidx.recyclerview.widget.RecyclerView
import com.betulnecanli.mealreceipt.MealAdapter.MealViewHolder
import android.view.LayoutInflater
import android.widget.TextView
import com.betulnecanli.mealreceipt.R
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.betulnecanli.mealreceipt.MealAdapter
import androidx.recyclerview.widget.LinearLayoutManager

data class MealsModel(var mealTitle: String, var mealDesc: String)