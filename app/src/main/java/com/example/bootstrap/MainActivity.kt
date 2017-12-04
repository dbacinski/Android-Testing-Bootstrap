package com.example.bootstrap

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import timber.log.Timber

class MainActivity : AppCompatActivity(), MainView {

    val mainPresenter = MainPresenter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        main_text.text = "Init"
        mainPresenter.createView(this)
    }

    override fun doSomething() {
        Timber.i("Done")
        main_text.text = "Done"
    }
}
