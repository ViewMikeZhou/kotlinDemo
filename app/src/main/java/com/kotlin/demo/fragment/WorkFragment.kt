package com.kotlin.demo.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.kotlin.demo.R

/**
 * Created by Administrator on 2017/5/25.
 */
class WorkFragment : BaseFragment(){
    companion object {
        private var workFragment:WorkFragment? = null
        fun getIntance(): WorkFragment {
            if (workFragment ==null){
                workFragment = WorkFragment()
            }
            return workFragment!!
        }
    }
    override fun getLayout(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View {
        return inflater!!.inflate(R.layout.fragment_work,container,false)
    }

}