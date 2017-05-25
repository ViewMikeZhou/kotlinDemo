package com.kotlin.demo.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.kotlin.demo.R

/**
 * Created by Administrator on 2017/5/25.
 */
class UploadFragment : BaseFragment(){
    companion object {
        private var uploadFragment:UploadFragment? = null
        fun getIntance(): UploadFragment {
            if (uploadFragment ==null){
                uploadFragment = UploadFragment()
            }
            return uploadFragment!!
        }
    }
    override fun getLayout(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View {
        return inflater!!.inflate(R.layout.fragment_uoload,container,false)
    }

}