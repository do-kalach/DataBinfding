package com.agening.databinfding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.agening.databinfding.databinding.ActivityMainBinding
import kotlin.concurrent.thread

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding:ActivityMainBinding = DataBindingUtil.setContentView(
            this, R.layout.activity_main
        )
        binding.user = User("Test", "User")

    }
}