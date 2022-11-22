package com.example.warrior

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.warrior.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnLogin.setOnClickListener{
            Intent(this@MainActivity,LoginActivity::class.java).also {
                startActivity(it)
            }
        }
        binding.btnRegister.setOnClickListener{
            Intent(this@MainActivity,RegisterActivity::class.java).also {
                startActivity(it)
            }
        }
    }
}