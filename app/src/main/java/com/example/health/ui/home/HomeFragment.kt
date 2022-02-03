package com.example.health.ui.home

import android.os.Bundle
import android.view.View
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.example.health.BR
import com.example.health.R
import com.example.health.base.BaseFragment
import com.example.health.databinding.FragmentHomeBinding

class HomeFragment: BaseFragment<FragmentHomeBinding, HomeViewModel>() {

    override fun getViewModel(): HomeViewModel? =
        ViewModelProvider(this).get(HomeViewModel::class.java)

    override fun getBindingVariable(): Int = BR.homeVM

    override fun getContentView(): Int = R.layout.fragment_home

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

         init()
    }

    private fun init(){

        getViewDataBinding()?.earlyMorning?.setOnClickListener {
            val action = HomeFragmentDirections.actionHomeFragmentToEarlyMorningFragment()
            findNavController().navigate(action)
        }

    }
}