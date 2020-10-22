package com.yml.retrofitexample

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.FrameLayout
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

private lateinit var recycler: RecyclerView
private lateinit var btnNext: Button
private lateinit var btnTodos:Button
private lateinit var btnAlbum : Button
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val commentsFragment= CommentsFragment()
        val firstFragment = PostFragment()
        val secondFragment = TodosFragment()
        val thirdFragment = AlbumsFragment()
        supportFragmentManager.beginTransaction()
            .replace(R.id.frameLayout,commentsFragment)
            .addToBackStack(null)
            .commit()
        btnNext=findViewById(R.id.next)
        btnTodos=findViewById(R.id.todo)
        btnAlbum=findViewById(R.id.album)
        btnNext.setOnClickListener {
            supportFragmentManager.beginTransaction().
            replace(R.id.frameLayout,firstFragment).
            addToBackStack(null).
            commit()
        }
        btnTodos.setOnClickListener {
            supportFragmentManager.beginTransaction().
            replace(R.id.frameLayout,secondFragment).
            addToBackStack(null).
            commit()
        }
        btnAlbum.setOnClickListener {
            supportFragmentManager.beginTransaction().
            replace(R.id.frameLayout,thirdFragment).
            addToBackStack(null).
            commit()
        }

    }
}