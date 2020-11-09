package com.example.musicapp.repo

import com.example.musicapp.service.AlbumesResponse
import com.example.musicapp.service.AlbumesService
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class AlbumesRepo(private val albumesService: AlbumesService) {

    fun listarAlbumes(callBack: (List<AlbumesResponse.AlbumesItem>?)-> Unit){
        val albumesCall = albumesService.listaAlbumes()
        albumesCall.enqueue(object: Callback<AlbumesResponse>{
            override fun onResponse(call: Call<AlbumesResponse>, response: Response<AlbumesResponse>) {
                val body = response?.body()
                callBack(body?.image)

            }

            override fun onFailure(call: Call<AlbumesResponse>, t: Throwable) {
                callBack(null)
            }


        })


    }
}

