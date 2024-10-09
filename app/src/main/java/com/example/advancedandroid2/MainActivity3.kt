package com.example.advancedandroid2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.advancedandroid2.databinding.ActivityMain3Binding

class MainActivity3 : AppCompatActivity() {

    lateinit var binding: ActivityMain3Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain3Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.textView.text = "is this your number? -> ${intent.extras?.getString("number")}"
    }
}