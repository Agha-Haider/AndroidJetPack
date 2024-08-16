package com.example.basicviewmodel.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.example.basicviewmodel.databinding.ActivityMainBinding
import com.example.basicviewmodel.viewmode.MainActivityVieModel

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var viewModel: MainActivityVieModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        viewModel=ViewModelProvider(this).get(MainActivityVieModel::class.java)
       binding?.counttext?.text = viewModel.getCounting().toString()
        binding.add.setOnClickListener{
            binding.counttext.text=viewModel.updateCounting().toString()
        }



    }
}