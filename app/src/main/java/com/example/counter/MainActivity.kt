package com.example.counter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.Button
import android.widget.TextView
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider

class MainActivity : AppCompatActivity() {
    lateinit var countTxt: TextView
    lateinit var countBtn: Button
    lateinit var viewmodel: ViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        countTxt = findViewById(R.id.counter)
        countBtn = findViewById(R.id.countBtn)

        observeViewModel()

        countBtn.setOnClickListener {
            viewmodel.counter()
            countTxt.text = viewmodel.x.value.toString()
        }

    }

    fun observeViewModel(){
        viewmodel = ViewModelProvider(this)[ViewModel::class.java]
        viewmodel.x.observe(this, Observer {

        })
    }
}