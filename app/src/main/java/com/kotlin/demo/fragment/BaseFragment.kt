package com.kotlin.demo.fragment


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

/**
 * Created by Administrator on 2017/5/25.
 */
abstract  class BaseFragment : Fragment(){
    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View {

        return getLayout(inflater,container,savedInstanceState)
    }

    abstract fun  getLayout(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View
}