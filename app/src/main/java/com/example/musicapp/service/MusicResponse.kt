package com.example.musicapp.service

data class MusicResponse(
    val name: String,
    val image: List<ArtistasItem>

) {

    class ArtistasItem(
        val text: String,
        val size: Int

    ){



    }
}