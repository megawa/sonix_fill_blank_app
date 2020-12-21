package com.sonix.fill_blank_app.api

import com.sonix.fill_blank_app.api.ApiClient.Companion.API_KEY
import retrofit2.Call
import retrofit2.http.*

interface ApiRequest {
    @GET("/data/2.5/weather?q=Tokyo,jp&appid=$API_KEY")
    fun fetchWeather(): Call<Weather>
}