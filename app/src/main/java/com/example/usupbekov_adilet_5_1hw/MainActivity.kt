package com.example.usupbekov_adilet_5_1hw

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.usupbekov_adilet_5_1hw.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), CounterView {

    private lateinit var binding: ActivityMainBinding
    private var count = 0
    private var presenter = Injector.getPresenter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        ////////////////////////////
        clickListener()
        presenter.attachView(this)
    }

    private fun clickListener() {
        binding.apply {
            btnPlus.setOnClickListener {
                presenter.increment()
            }
            btnMinus.setOnClickListener {
                presenter.decrement()
            }
        }
    }

    override fun showCount(count: Int) {
        binding.text.text = count.toString()
    }

    override fun changeColor() {
        binding.text.setTextColor(Color.GREEN)
    }

    override fun showCongratulation() {
        showToast("Поздравляю")
    }
}