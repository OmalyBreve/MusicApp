package com.example.musicapp.service

data class CancionesResponse(
    val name: String,
    val image: List<CancionesItem>

) {

    class CancionesItem(
        val text: String,
        val size: Int

    ){



    }
}