package com.yml.retrofitexample

import retrofit2.Call
import retrofit2.http.GET

interface APIInterface {
    @GET("comments")
    fun getComments(): Call<List<ResponseObjects>>


//    @GET("comments")
//    fun getPosts(): Call<List<ResponseObjects>>
}