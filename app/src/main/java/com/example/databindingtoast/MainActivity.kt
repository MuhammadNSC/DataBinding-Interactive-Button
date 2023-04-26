package com.example.databindingtoast

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.example.databindingtoast.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivityMainBinding = DataBindingUtil.setContentView (
            this, R.layout.activity_main)

        binding.btnToast.setOnClickListener {
            Toast.makeText(applicationContext, "Whats Up",Toast.LENGTH_SHORT).show()
        }

    }
}