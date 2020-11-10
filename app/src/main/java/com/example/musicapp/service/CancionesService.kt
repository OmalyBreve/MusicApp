package com.example.musicapp.service

import com.google.gson.JsonObject
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

interface CancionesService {

    @GET("?method=artist.gettoptracks&artist=cher&api_key=9d62bfcdba7afa45c56ffba9d2ea9bd3&format=json")
    fun listaCanciones(): Call<JsonObject> //Se cambio la response a JsonObject


    companion object{
        val instance: CancionesService by lazy{
            val retrofit = Retrofit.Builder()
                .baseUrl("http://ws.audioscrobbler.com/2.0/") //La url es esta
                .addConverterFactory(GsonConverterFactory.create())
                .build()
            retrofit.create<CancionesService>(CancionesService::class.java)


        }

    }
}