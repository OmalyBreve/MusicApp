package com.example.musicapp.repo

import com.example.musicapp.service.ArtistasService
import com.google.gson.JsonObject
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class ArtistaRepo(private val artistasService: ArtistasService) {

    fun listarArtistas(callBack: (JsonObject?)-> Unit){
        val artistasCall = artistasService.listaArtistas()
        artistasCall.enqueue(object: Callback<JsonObject>{
            override fun onResponse(call: Call<JsonObject>, response: Response<JsonObject>) {
                val body = response?.body()
                callBack(body)
            }

            override fun onFailure(call: Call<JsonObject>, t: Throwable) {
                callBack(null)
            }


        })


    }
}

