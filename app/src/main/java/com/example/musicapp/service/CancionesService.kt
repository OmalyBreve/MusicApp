package com.example.musicapp.service

import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

interface CancionesService {
    @GET("image")


    fun listaCanciones(): Call<MusicResponse>

    companion object{
        val instance: CancionesService by lazy{
            val retrofit = Retrofit.Builder()
                .baseUrl("https://www.last.fm/")
                .addConverterFactory(GsonConverterFactory.create())
                .build()
            retrofit.create<CancionesService>(CancionesService::class.java)


        }

    }
}