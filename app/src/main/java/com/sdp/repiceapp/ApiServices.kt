package com.sdp.repiceapp

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

private val retrofit = Retrofit.Builder().baseUrl("https://www.themealdb.com/api/json/v1/1/")
    .addConverterFactory(GsonConverterFactory.create())
    .build()

val recipeServices = retrofit.create(ApiServices::class.java)

interface ApiServices {
    @GET("categories.php")
    suspend fun getCategories() : CategoriesResponse

}