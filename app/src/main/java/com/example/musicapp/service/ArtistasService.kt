package com.example.musicapp.service

import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

interface ArtistasService {
    @GET("image")


    fun listaArtistas(): Call<MusicResponse>

    companion object{
        val instance: ArtistasService by lazy{
            val retrofit = Retrofit.Builder()
                .baseUrl("https://www.last.fm/")
                .addConverterFactory(GsonConverterFactory.create())
                .build()
            retrofit.create<ArtistasService>(ArtistasService::class.java)


        }

    }
}