package com.example.musicapp.repo

import com.example.musicapp.service.MusicResponse
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class CancionesRepo(private val cancionesService: CancionesService) {

    fun listarCanciones(callBack: (List<MusicResponse.CancionesItem>?)-> Unit){
        val cancionesCall = cancionessService.listaCanciones()
        cancionesCall.enqueue(object: Callback<MusicResponse>{
            override fun onResponse(call: Call<MusicResponse>, response: Response<MusicResponse>) {
                val body = response?.body()
                callBack(body?.image)

            }

            override fun onFailure(call: Call<MusicResponse>, t: Throwable) {
                callBack(null)
            }


        })


    }
}

