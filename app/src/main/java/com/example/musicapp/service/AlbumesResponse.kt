package com.example.musicapp.service

data class AlbumesResponse(
    val name: String,
    val image: List<AlbumesItem>

) {

    class AlbumesItem(
        val text: String,
        val size: Int

    ){



    }
}