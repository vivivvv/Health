package com.example.health.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.get

abstract class BaseFragment<out V : ViewDataBinding, out T : BaseViewModel> : Fragment() {

    private var mDataBinding: V? = null
    private var mViewModel: T? = null

    abstract fun getViewModel(): T?

    abstract fun getBindingVariable(): Int

    abstract fun getContentView(): Int

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        mDataBinding = DataBindingUtil.inflate(inflater, getContentView(), container, false)
        performDataBinding()
        return mDataBinding?.root
    }

    private fun performDataBinding() {
        getViewModel()?.let {
            mViewModel = ViewModelProvider(this).get(it::class.java)
            mDataBinding?.setVariable(getBindingVariable(), mViewModel)
            mDataBinding?.executePendingBindings()
        }
    }

    fun showToast(msg: String) {
        Toast.makeText(activity?.applicationContext, msg, Toast.LENGTH_LONG).show()
    }
}