package com.example.musicapp.repo

import com.example.musicapp.service.CancionesResponse
import com.example.musicapp.service.CancionesService
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class CancionesRepo(private val cancionesService: CancionesService) {

    fun listarCanciones(callBack: (List<CancionesResponse.CancionesItem>?)-> Unit){
        val cancionesCall = cancionesService.listaCanciones()
        cancionesCall.enqueue(object: Callback<CancionesResponse>{
            override fun onResponse(call: Call<CancionesResponse>, response: Response<CancionesResponse>) {
                val body = response?.body()
                callBack(body?.image)

            }

            override fun onFailure(call: Call<CancionesResponse>, t: Throwable) {
                callBack(null)
            }


        })


    }
}

