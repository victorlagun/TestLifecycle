package com.techmeskills.testlifecycle

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val viewModel: MainActivityViewModel by viewModels()

    private var counter = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        lifecycle.addObserver(MainActivityObserver())

        val observer = Observer<String> { textView.text = it }

        viewModel.transformLiveData.observe(this, observer)

        button.setOnClickListener {
            viewModel.changeData((++counter).toString())
        }

        unsubscribeButton.setOnClickListener {
            viewModel.liveData.removeObserver(observer)
        }
    }
}