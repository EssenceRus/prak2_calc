package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class FinalActivity : AppCompatActivity() {
    private lateinit var tv : TextView
    private lateinit var itog : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_final)
        val data = intent.getStringExtra("data")
        tv = findViewById(R.id.Itog)
        tv.text = "ответ: \n$data"
    }
}