package com.example.musicapp.service


data class ArtistaResponse(
    var name: String?=null,
    var mbid:String?=null,
    var url:String?=null,
    var image:List<Image>?=null,

    ) {


    data class Image(
        var text :String?=null,
        var size:String?=null,
    ){

    }
}