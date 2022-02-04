package com.example.health.ui.earlyMorning

import android.content.Context
import android.os.Bundle
import android.view.*
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.example.health.BR
import com.example.health.R
import com.example.health.base.BaseFragment
import com.example.health.databinding.FragmentEarlyMorningBinding
import com.example.health.databinding.FragmentHomeBinding
import com.example.health.ui.home.HomeFragmentDirections
import com.example.health.ui.home.HomeViewModel


class EarlyMorningFragment: BaseFragment<FragmentEarlyMorningBinding, EarlyMorningViewModel>() {

    override fun getViewModel():EarlyMorningViewModel? =
        ViewModelProvider(this).get(EarlyMorningViewModel::class.java)

    override fun getBindingVariable(): Int = BR.earlyMorningVM

    override fun getContentView(): Int = R.layout.fragment_early_morning

    var menu: String = ""

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        init()

    }

    private fun init(){

        getViewDataBinding()?.submitBtn?.setOnClickListener {
            menu = getViewDataBinding()?.menuEditText?.text.toString()
            if (menu.isEmpty()){
                getViewDataBinding()?.menuEditText?.error = " Enter Menu"
            }else{
                val action =EarlyMorningFragmentDirections.actionEarlyMorningFragmentToIngredientsFragment()
                findNavController().navigate(action)
            }
        }



    }
}