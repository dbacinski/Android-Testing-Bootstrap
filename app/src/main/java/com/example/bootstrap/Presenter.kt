package com.example.bootstrap

internal interface Presenter<in T> {

    fun createView(view: T)

    fun destroyView()
}