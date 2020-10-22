package com.yml.retrofitexample

import com.google.gson.annotations.SerializedName
import java.util.*


data class ResponseObjects(
    @SerializedName("postId")
    val post_id: Int,
    @SerializedName("id")
    val user_id: Int,
    val userId: Int,
    val name: String,
    val email: String,
    val title:String,
    val body: String,
    val completed: String


//    val id: Int,
//    val name: String,
//    val email: String,
//    val gender:String,
//    val status:String,
//    val created_at: String,
//    val updated_at: String
)