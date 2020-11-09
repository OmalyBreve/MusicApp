package com.example.musicapp.repo

import com.example.musicapp.service.ArtistasService
import com.example.musicapp.service.MusicResponse
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class ArtistaRepo(private val artistasService: ArtistasService) {

    fun listarArtistas(callBack: (List<MusicResponse.ArtistasItem>?)-> Unit){
        val artistasCall = artistasService.listaArtistas()
        artistasCall.enqueue(object: Callback<MusicResponse>{
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

