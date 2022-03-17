package com.tbuonomo.dotsindicatorsample

import android.content.Context
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewbinding.ViewBinding
import java.util.*

abstract class BaseActivity<out T : ViewBinding> : AppCompatActivity() {
    private val _binding: T by lazy {
        getViewBinding()
    }

    val binding get() = _binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(_binding.root)
    }



    abstract fun getViewBinding(): T
}