package com.yml.retrofitexample

interface APIResponseInterface {

    fun onResponse(response:List<ResponseObjects>)
    fun onFailure()
}