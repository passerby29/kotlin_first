package com.example.kotlinapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun toastMe(view: View) {
        val myToast = Toast.makeText(this, textView.text.toString(), Toast.LENGTH_SHORT).show()
    }

    fun countMe(view: View) {
        val countString = textView.text.toString()

        var count: Int = Integer.parseInt(countString)
        count++

        textView.text = count.toString()
    }

    fun rand (view: View){
        val randomIntent = Intent(this, Activity2::class.java)

        val countString = textView.text.toString()

        val count = Integer.parseInt(countString)

        randomIntent.putExtra("total_count", count)
        startActivity(randomIntent)
    }
}