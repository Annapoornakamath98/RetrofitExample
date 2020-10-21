package com.yml.retrofitexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

private lateinit var recycler: RecyclerView
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recycler=findViewById(R.id.recyclerView)
        recycler.layoutManager=LinearLayoutManager(this)

        val retro = RetrofitInitializer.getRetrofitInstance()
        val apiInterface = retro.create(APIInterface::class.java)
        val objects: Call<List<ResponseObjects>> = apiInterface.getComments()

        objects.enqueue(object : Callback<List<ResponseObjects>>{
            override fun onResponse(
                call: Call<List<ResponseObjects>>,
                response: Response<List<ResponseObjects>>
            ) {

                val uList : List<ResponseObjects> = response.body()!!
                recycler.adapter=AdapterClass(uList)
            }

            override fun onFailure(call: Call<List<ResponseObjects>>, t: Throwable) {
                Toast.makeText(applicationContext,t.toString(),Toast.LENGTH_LONG).show()
            }

        })
    }
}