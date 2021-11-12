package com.example.kotlinapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_2.*
import java.util.*
class Activity2 : AppCompatActivity() {

    companion object {
        const val TOTAL_COUNT = "total_count"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)
        show()
    }

    fun show() {
        val count = intent.getIntExtra(TOTAL_COUNT, 0)

        val random = Random()
        var randomInt = 0
        if (count > 0){
            randomInt = random.nextInt(count + 1)
        }
        textView3.text = Integer.toString(randomInt)

        textView2.text = getString(R.string.random_heading, count)
    }
}