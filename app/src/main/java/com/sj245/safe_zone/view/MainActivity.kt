package com.sj245.safe_zone.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.sj245.safe_zone.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }
}