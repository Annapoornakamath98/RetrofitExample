package com.yml.retrofitexample

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

private lateinit var recycler:RecyclerView
class CommentsFragment : Fragment(R.layout.fragment_comments) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        recycler=view.findViewById(R.id.recyclerView)
        recycler.layoutManager= LinearLayoutManager(view.context)

        val mainViewModel = MainViewModel()
        mainViewModel.getComments(object : ViewCallBack{
            override fun onApiSuccess(apiList: List<ResponseObjects>) {
                recycler.adapter=AdapterClass(apiList)
            }
        })

//        val retro = RetrofitInitializer.getRetrofitInstance()
//        val apiInterface = retro.create(APIInterface::class.java)
//        val objects: Call<List<ResponseObjects>> = apiInterface.getComments()
//        objects.enqueue(object : Callback<List<ResponseObjects>> {
//            override fun onResponse(
//                call: Call<List<ResponseObjects>>,
//                response: Response<List<ResponseObjects>>
//            ) {
//
//                val uList : List<ResponseObjects> = response.body()!!
//                recycler.adapter=AdapterClass(uList)
//            }
//
//            override fun onFailure(call: Call<List<ResponseObjects>>, t: Throwable) {
//                Toast.makeText(view.context,t.toString(), Toast.LENGTH_LONG).show()
//            }
//
//        })
    }

}