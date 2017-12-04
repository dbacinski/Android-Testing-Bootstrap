package com.example.bootstrap

class MainPresenter : BasePresenter<MainView>() {

    override fun createView(view: MainView) {
        super.createView(view)
        view.doSomething()
    }
}

