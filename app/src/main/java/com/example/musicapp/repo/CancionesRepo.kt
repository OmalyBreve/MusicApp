package com.example.musicapp.repo

import com.example.musicapp.service.CancionesService
import com.google.gson.JsonObject
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class CancionesRepo(private val cancionesService: CancionesService) {

    fun listarCanciones(callBack: (JsonObject?)-> Unit){
        val cancionesCall = cancionesService.listaCanciones()
        cancionesCall.enqueue(object: Callback<JsonObject>{
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

