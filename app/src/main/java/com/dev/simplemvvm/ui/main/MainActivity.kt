package com.dev.simplemvvm.ui.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.dev.simplemvvm.R
import com.dev.simplemvvm.base.BaseActivity
import com.dev.simplemvvm.databinding.ActivityMainBinding
import com.dev.simplemvvm.ui.detail.DetailActivity.Companion.startActivityWithTransition

class MainActivity : BaseActivity() {

    private val binding : ActivityMainBinding by binding(R.layout.activity_main)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding.apply {
            lifecycleOwner = this@MainActivity
            adapter = MainAdapter{ view,type->
                startActivityWithTransition(this@MainActivity,view,type)
            }
        }
    }
}