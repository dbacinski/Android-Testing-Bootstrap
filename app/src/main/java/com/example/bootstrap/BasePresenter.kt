package com.example.bootstrap

import io.reactivex.disposables.CompositeDisposable
import io.reactivex.disposables.Disposable

open class BasePresenter<T> : Presenter<T> {

    var view: T? = null
    private val compositeDisposable = CompositeDisposable()

    override fun createView(view: T) {
        this.view = view
    }

    override fun destroyView() {
        compositeDisposable.clear()
        view = null
    }

    fun bindToLifecycle(disposable: Disposable) {
        compositeDisposable.add(disposable)
    }
}