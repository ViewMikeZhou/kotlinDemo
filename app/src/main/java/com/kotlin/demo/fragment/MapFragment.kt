package com.kotlin.demo.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.kotlin.demo.R

/**
 * Created by Administrator on 2017/5/25.
 */
class MapFragment : BaseFragment() {
    companion object {
        private var mapFragment:MapFragment? = null
        fun getIntance(): MapFragment {
            if (mapFragment ==null){
                mapFragment = MapFragment()
            }
            return mapFragment!!
        }
    }

    override fun getLayout(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View {
        return inflater!!.inflate(R.layout.fragment_map, container, false)
    }
}