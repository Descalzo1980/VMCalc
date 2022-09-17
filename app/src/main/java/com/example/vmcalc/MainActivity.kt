package com.example.vmcalc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.example.vmcalc.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var viewModel: MainActivityViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        viewModel = ViewModelProvider(this)[MainActivityViewModel::class.java]
        setContentView(binding.root)
        binding.tvResult.text = viewModel.getTotal().toString()

        binding.btnInput.setOnClickListener{
            viewModel.setTotal(binding.etInput.text.toString().toInt())
            binding.tvResult.text = viewModel.getTotal().toString()
        }
    }
}