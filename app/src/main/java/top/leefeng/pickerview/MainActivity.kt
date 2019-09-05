package top.leefeng.pickerview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        pickerView.setData(arrayOf("关闭","30分钟","40分钟","50分钟","60分钟","70分钟","90分钟"),0)

        pickerView.currentItem
    }
}
