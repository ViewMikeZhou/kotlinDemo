package com.kotlin.demo.ui

import android.content.Context
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast

/**
 * Created by Administrator on 2017/5/20.
 */
abstract class BaseActivity :AppCompatActivity(){
     override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(getContentLayout())
        initData()
    }

    abstract fun initData()

    abstract fun getContentLayout(): Int

    fun Context.toast(message: CharSequence, duration: Int = Toast.LENGTH_SHORT) {
        Toast.makeText(this, message, duration).show()
    }

}