package com.example.bootstrap.main

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.example.bootstrap.R
import kotlinx.android.synthetic.main.activity_main.*
import timber.log.Timber

class MainActivity : AppCompatActivity(), MainView {

    val mainPresenter = MainPresenter(MainRepository())

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mainPresenter.createView(this)
    }

    override fun onStop() {
        super.onStop()
        mainPresenter.destroyView()
    }

    override fun doSomething(user: User) {
        Timber.i("Done ${user}")
        main_text.text = user.toString()
    }
}
