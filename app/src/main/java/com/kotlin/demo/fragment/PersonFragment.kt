package com.kotlin.demo.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.kotlin.demo.R

/**
 * Created by Administrator on 2017/5/25.
 */
class PersonFragment : BaseFragment(){
    companion object {
        private var personFragment:PersonFragment? = null
        fun getIntance(): PersonFragment {
            if (personFragment ==null){
                personFragment = PersonFragment()
            }
            return personFragment!!
        }
    }
    override fun getLayout(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View {
          return inflater!!.inflate(R.layout.fragment_person,container,false)
    }

}