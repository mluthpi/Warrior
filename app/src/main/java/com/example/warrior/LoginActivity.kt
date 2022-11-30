package com.example.warrior

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.warrior.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {

    private lateinit var binding : ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)



        binding.btnLanjutkan.setOnClickListener {
            val email = binding.edtEmail.text.toString()
            val password = binding.edtPassword.text.toString()

            if (email == "abc" && password == "123") {
                Toast.makeText(this,email, Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "salah", Toast.LENGTH_SHORT).show()
            }
        }

    }
}