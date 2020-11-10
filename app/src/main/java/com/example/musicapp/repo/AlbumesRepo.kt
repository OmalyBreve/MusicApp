package com.example.musicapp.repo

import com.example.musicapp.service.AlbumesService
import com.google.gson.JsonObject
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class AlbumesRepo(private val albumesService: AlbumesService) {

    fun listarAlbumes(callBack: (JsonObject?)-> Unit){
        val albumesCall = albumesService.listaAlbumes()
        albumesCall.enqueue(object: Callback<JsonObject>{
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

