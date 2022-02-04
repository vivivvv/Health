package com.example.health.ui.ingredients

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.example.health.BR
import com.example.health.R
import com.example.health.base.BaseFragment
import com.example.health.databinding.FragmentHomeBinding
import com.example.health.databinding.FragmentIngredientsBinding
import com.example.health.ui.home.HomeViewModel

class IngredientsFragment :  BaseFragment<FragmentIngredientsBinding, IngredientsViewModel>()  {


    override fun getViewModel(): IngredientsViewModel? =
        ViewModelProvider(this).get(IngredientsViewModel::class.java)

    override fun getBindingVariable(): Int = BR.ingredientsVM

    override fun getContentView(): Int = R.layout.fragment_ingredients

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        init()
    }

    private fun init(){


    }
}