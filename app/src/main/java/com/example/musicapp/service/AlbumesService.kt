package com.example.musicapp.service

import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

interface AlbumesService {
    @GET("image")


    fun listaAlbumes(): Call<AlbumesResponse>

    companion object{
        val instance: AlbumesService by lazy{
            val retrofit = Retrofit.Builder()
                .baseUrl("https://www.last.fm/")
                .addConverterFactory(GsonConverterFactory.create())
                .build()
            retrofit.create<AlbumesService>(AlbumesService::class.java)


        }

    }
}