package com.example.kotlinyoutubelbtaokezi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private var recyclerView:RecyclerView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        recyclerView = view?.findViewById(R.id.nameofyourrecyclerviewID)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}