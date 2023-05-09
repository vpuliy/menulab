package com.example.menu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.menu.databinding.ActivityMainBinding
import com.example.menu.list.ArticleAdapter
import com.example.menu.list.ArticleModel
import com.example.menu.list.ListFragment

class MainActivity : AppCompatActivity() {

    lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}