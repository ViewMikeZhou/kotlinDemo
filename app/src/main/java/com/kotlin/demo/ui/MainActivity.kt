package com.kotlin.demo.ui

import android.view.MenuItem
import com.kotlin.demo.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {

    override fun getContentLayout(): Int {
        return R.layout.activity_main
    }

    override fun initData() {
        text_show.text = "我被打开了"
        text_show.setOnClickListener { toast("被点击了") }
        //取消位移动画
        bottom.enableAnimation(false)
        bottom.enableShiftingMode(false)
        bottom.enableItemShiftingMode(false)
        //设置bottom被点击事件
        bottom.setOnNavigationItemSelectedListener({ item -> beClick(item)})


    }

    private fun beClick(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.map -> {toast("地图被点击")}
            R.id.work -> {toast("工作被点击")}
            R.id.upload->{toast("上传被点击")}
            R.id.person->{toast("个人被点击")}
        }
        return true
    }


}
