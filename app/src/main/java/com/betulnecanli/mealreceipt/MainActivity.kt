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
import android.widget.Toast
import com.betulnecanli.mealreceipt.MealAdapter
import androidx.recyclerview.widget.LinearLayoutManager
import java.util.ArrayList

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }


}