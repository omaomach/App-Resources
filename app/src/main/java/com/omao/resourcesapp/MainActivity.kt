package com.omao.resourcesapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class   MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        // Kotlin
        val color : Int = resources.getColor(R.color.white)



    }
}