package com.yml.retrofitexample

import android.widget.Toast
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class RepositoryClass {
    fun getComments(apiResponseInterface: APIResponseInterface){
        val retro = RetrofitInitializer.getRetrofitInstance()
        val apiInterface = retro.create(APIInterface::class.java)
        val objects2: Call<List<ResponseObjects>> = apiInterface.getComments()
        objects2.enqueue(object : Callback<List<ResponseObjects>> {
            override fun onResponse(
                call: Call<List<ResponseObjects>>,
                response: Response<List<ResponseObjects>>
            ) {
                response.body()?.let {
                    apiResponseInterface.onResponse(it)
                }?: apiResponseInterface.onFailure()

            }
            override fun onFailure(call: Call<List<ResponseObjects>>, t: Throwable) {
                apiResponseInterface.onFailure()
            }

        })
    }

    fun getPosts(apiResponseInterface: APIResponseInterface){
        val retro = RetrofitInitializer.getRetrofitInstance()
        val apiInterface = retro.create(APIInterface::class.java)
        val objects2: Call<List<ResponseObjects>> = apiInterface.getPosts()
        objects2.enqueue(object : Callback<List<ResponseObjects>> {
            override fun onResponse(
                    call: Call<List<ResponseObjects>>,
                    response: Response<List<ResponseObjects>>
            ) {
                response.body()?.let {
                    apiResponseInterface.onResponse(it)
                }?: apiResponseInterface.onFailure()

            }
            override fun onFailure(call: Call<List<ResponseObjects>>, t: Throwable) {
                apiResponseInterface.onFailure()
            }

        })
    }

    fun getTodos(apiResponseInterface: APIResponseInterface){
        val retro = RetrofitInitializer.getRetrofitInstance()
        val apiInterface = retro.create(APIInterface::class.java)
        val objects2: Call<List<ResponseObjects>> = apiInterface.getTodos()
        objects2.enqueue(object : Callback<List<ResponseObjects>> {
            override fun onResponse(
                    call: Call<List<ResponseObjects>>,
                    response: Response<List<ResponseObjects>>
            ) {
                response.body()?.let {
                    apiResponseInterface.onResponse(it)
                }?: apiResponseInterface.onFailure()

            }
            override fun onFailure(call: Call<List<ResponseObjects>>, t: Throwable) {
                apiResponseInterface.onFailure()
            }

        })
    }

    fun getAlbums(apiResponseInterface: APIResponseInterface){
        val retro = RetrofitInitializer.getRetrofitInstance()
        val apiInterface = retro.create(APIInterface::class.java)
        val objects2: Call<List<ResponseObjects>> = apiInterface.getAlbums()
        objects2.enqueue(object : Callback<List<ResponseObjects>> {
            override fun onResponse(
                    call: Call<List<ResponseObjects>>,
                    response: Response<List<ResponseObjects>>
            ) {
                response.body()?.let {
                    apiResponseInterface.onResponse(it)
                }?: apiResponseInterface.onFailure()

            }
            override fun onFailure(call: Call<List<ResponseObjects>>, t: Throwable) {
                apiResponseInterface.onFailure()
            }

        })
    }
}