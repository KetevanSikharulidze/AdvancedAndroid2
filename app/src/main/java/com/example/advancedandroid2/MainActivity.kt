package com.example.advancedandroid2

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.advancedandroid2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        init()
    }

    private fun init(){
        binding.apply {
            signUpBtn.setOnClickListener {

                val name = signUpNameET.text.toString()
                val email = signUpEmailET.text.toString()
                val number = signUpNumberdET.text.toString()
                val password = signUpPasswordET.text.toString()

                val intent = Intent(this@MainActivity, MainActivity2::class.java)
                intent.putExtra("name",name)
                intent.putExtra("email",email)
                intent.putExtra("number", number)
                intent.putExtra("password", password)
                startActivity(intent)
            }

        }
    }
}