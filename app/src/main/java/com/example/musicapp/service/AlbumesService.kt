package com.example.musicapp.service

import com.google.gson.JsonObject
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

interface AlbumesService {

    @GET("?method=album.getinfo&api_key=9d62bfcdba7afa45c56ffba9d2ea9bd3&artist=Cher&album=Believe&format=json")
    fun listaAlbumes(): Call<JsonObject>

    companion object{
        val instance: AlbumesService by lazy{
            val retrofit = Retrofit.Builder()
                .baseUrl("http://ws.audioscrobbler.com/2.0/")
                .addConverterFactory(GsonConverterFactory.create())
                .build()
            retrofit.create<AlbumesService>(AlbumesService::class.java)


        }

    }
}