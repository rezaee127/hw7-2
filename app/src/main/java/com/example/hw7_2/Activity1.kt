package com.example.hw7_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.hw7_2.databinding.Activity1Binding

class Activity1 : AppCompatActivity() {
    lateinit var binding:Activity1Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_1)

        binding = Activity1Binding.inflate(layoutInflater)
        setContentView(binding.root)





    }
}