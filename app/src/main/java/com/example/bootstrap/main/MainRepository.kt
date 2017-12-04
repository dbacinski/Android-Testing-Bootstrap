package com.example.bootstrap.main

import com.example.bootstrap.NetworkingModule
import io.reactivex.Observable

class MainRepository {

    fun doSomething():Observable<User> = NetworkingModule.provideRetrofit().create(MainApi::class.java).doSomething("dbacinski")
}