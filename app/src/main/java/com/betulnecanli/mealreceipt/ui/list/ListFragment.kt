package com.betulnecanli.mealreceipt.ui.list

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.betulnecanli.mealreceipt.model.MealsModel
import com.betulnecanli.mealreceipt.databinding.FragmentListBinding
import java.util.ArrayList


class ListFragment : Fragment() {


    private lateinit var binding : FragmentListBinding
    private lateinit var foodsAdapter : MealAdapter
    private val viewModel : ListViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentListBinding.inflate(inflater,container, false)
        viewModel.getMealList()
        initObserver()
        return binding.root
    }

    fun initObserver(){
        viewModel.mealList.observe(viewLifecycleOwner){ list ->
            initRecycle(list)

        }
    }

    fun initRecycle(mealList : List<MealsModel>){
        foodsAdapter = MealAdapter(context, mealList, clicked())
        val linearLayoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
        binding.recyclerViewMeal.apply {
            layoutManager = linearLayoutManager
            adapter = foodsAdapter
        }
    }
    private fun clicked(): (MealsModel)-> Unit{
        return{
          val action = ListFragmentDirections.actionListFragmentToDetailFragment(it)
            findNavController().navigate(action)
        }
    }

}