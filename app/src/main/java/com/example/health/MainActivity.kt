package com.example.health

import androidx.lifecycle.ViewModelProvider
import com.example.health.base.BaseActivity
import com.example.health.databinding.ActivityMainBinding

class MainActivity : BaseActivity<ActivityMainBinding, MainViewModel>() {

    override fun getContentView(): Int = R.layout.activity_main

    override fun getViewModel(): MainViewModel? =
        ViewModelProvider(this).get(MainViewModel::class.java)

    override fun getBindingVariable(): Int = BR.mainVM


}