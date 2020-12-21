package com.sonix.fill_blank_app.api

import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create

class ApiClient {
    private val client = makeOkHttpClient()

    companion object {
        const val BASE_URL = "http://api.openweathermap.org"
        const val API_KEY = "4b16a7c9555cff917ebbb4aec58d9830"
    }

    val apiRequest: ApiRequest
        get() = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .client(client)
            .build()
            .create()

    private fun makeOkHttpClient(): OkHttpClient {
        val logging = HttpLoggingInterceptor()
        logging.level = HttpLoggingInterceptor.Level.BODY
        val client = OkHttpClient.Builder().addInterceptor(logging)
        return client.build()
    }
}
