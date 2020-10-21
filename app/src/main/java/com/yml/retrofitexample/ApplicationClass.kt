package com.yml.retrofitexample

import android.app.Application

class ApplicationClass: Application(){
    override fun onCreate() {
        super.onCreate()
        RetrofitInitializer.initialize()
    }
}
