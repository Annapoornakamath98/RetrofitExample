package com.yml.retrofitexample

import retrofit2.Call
import retrofit2.http.GET

interface APIInterface {
    @GET("comments")
    fun getComments(): Call<List<ResponseObjects>>

    @GET("posts")
    fun getPosts(): Call<List<ResponseObjects>>

    @GET("todos")
    fun getTodos(): Call<List<ResponseObjects>>

    @GET("albums")
    fun getAlbums(): Call<List<ResponseObjects>>


}