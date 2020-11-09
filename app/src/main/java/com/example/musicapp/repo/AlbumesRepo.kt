package com.example.musicapp.repo

import com.example.musicapp.service.AlbumesService
import com.example.musicapp.service.MusicResponse
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class AlbumesRepo(private val albumesService: AlbumesService) {

    fun listarAlbumes(callBack: (List<MusicResponse.AlbumesItem>?)-> Unit){
        val albumesCall = AlbumesService.listaAlbumes()
        albumesCall.enqueue(object: Callback<MusicResponse>{
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

