package com.kotlin.demo

import android.app.Application

/**
 * Created by Administrator on 2017/5/25.
 */
class App : Application(){
    companion object{
        private var instance:Application? =null
        fun instance() = instance!!
    }
    override fun onCreate() {
        super.onCreate()
        instance = this ;
    }
}