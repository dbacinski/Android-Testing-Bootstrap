package com.example.bootstrap.main

import com.example.bootstrap.BasePresenter
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

class MainPresenter(val mainRepository: MainRepository) : BasePresenter<MainView>() {

    override fun createView(view: MainView) {
        super.createView(view)
        val subscription = mainRepository.doSomething().subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe({
            view.doSomething(it)
        })
        bindToLifecycle(subscription)
    }
}