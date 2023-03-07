package com.example.dualpanelayouts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

interface StarSignListener {
    fun onSelected(id: Int)
}

class MainActivity : AppCompatActivity(), StarSignListener {
    override fun onSelected(id: Int) {

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}