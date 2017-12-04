package com.example.bootstrap.main

import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Path

interface MainApi {
    @GET("users/{name}")
    fun doSomething(@Path("name") name: String): Observable<User>
}