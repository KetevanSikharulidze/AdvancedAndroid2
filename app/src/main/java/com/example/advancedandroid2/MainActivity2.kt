package com.example.advancedandroid2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.advancedandroid2.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {

    lateinit var binding: ActivityMain2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.homeHelloNameTV.text = "Hello, ${ intent.extras?.getString("name", "jgfjh") }"
        init()
    }

    private fun init(){

        binding.apply {
            val age = homeAgeET.text.toString()


            homeBtn.setOnLongClickListener {

                val email = intent.extras?.getString("email","")
                val number = intent.extras?.getString("number","")
                val password = intent.extras?.getString("password","")

                val intent = Intent(this@MainActivity2,MainActivity3::class.java)
                intent.putExtra("number", number)
                startActivity(intent)
                finish()
                true
            }

        }
    }
}