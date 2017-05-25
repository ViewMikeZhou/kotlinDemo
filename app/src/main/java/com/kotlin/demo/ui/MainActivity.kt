package com.kotlin.demo.ui

import android.view.MenuItem
import com.kotlin.demo.R
import com.kotlin.demo.fragment.MapFragment
import com.kotlin.demo.fragment.PersonFragment
import com.kotlin.demo.fragment.UploadFragment
import com.kotlin.demo.fragment.WorkFragment
import com.orhanobut.logger.Logger
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {

    override fun getContentLayout(): Int {
        return R.layout.activity_main
    }

    override fun initData() {
        //取消位移动画
        bottom.enableAnimation(false)
        bottom.enableShiftingMode(false)
        bottom.enableItemShiftingMode(false)
        //设置bottom被点击事件
        bottom.setOnNavigationItemSelectedListener({ item -> beClick(item) })
    }

    private fun beClick(item: MenuItem): Boolean {
        Logger.e("被点击")
        var beginTransaction = supportFragmentManager.beginTransaction()
        when (item.itemId) {
            R.id.map -> {
                beginTransaction.replace(R.id.container, MapFragment.getIntance()).commit()
            }
            R.id.work -> {
                beginTransaction.replace(R.id.container, WorkFragment.getIntance()).commit()
            }
            R.id.upload -> {
                beginTransaction.replace(R.id.container, UploadFragment.getIntance()).commit()
            }
            R.id.person -> {
                beginTransaction.replace(R.id.container, PersonFragment.getIntance()).commit()
            }
        }

        return true
    }


}
