package com.example.hw7_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.hw7_2.databinding.Activity2Binding

class Activity2 : AppCompatActivity() {
    lateinit var binding:Activity2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)

        binding = Activity2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val answer=intent.getStringExtra("Answer")
        binding.show.setOnClickListener {
            binding.textView2.text=answer
        }

    }
}