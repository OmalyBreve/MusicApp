package com.example.musicapp.service

import com.google.gson.JsonObject
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

interface ArtistasService {

    @GET("?method=artist.getinfo&artist=Cher&api_key=9d62bfcdba7afa45c56ffba9d2ea9bd3&format=json&fbclid=IwAR2haZAYACPWY__anvb9NHeXZEq0g8GNQu9CKAyujeA21L7QGaVm-mrM4Ag")
    fun listaArtistas(): Call<JsonObject>

    companion object{
        val instance: ArtistasService by lazy{
            val retrofit = Retrofit.Builder()
                .baseUrl("http://ws.audioscrobbler.com/2.0/")
                .addConverterFactory(GsonConverterFactory.create())
                .build()
            retrofit.create<ArtistasService>(ArtistasService::class.java)


        }

    }
}