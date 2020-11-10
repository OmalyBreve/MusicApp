package com.example.musicapp.service

data class CancionesResponse(
    var name: String?=null,
    var playcount:String?=null,
    var listeners:String?=null,
    var url:String?=null,
    var streamable:String?=null


//El modelo fue creado a partir de lo que recuperaba de la API
// "track": [
//      {
//        "name": "Believe",
//        "playcount": "2726603",
//        "listeners": "534093",
//        "url": "https://www.last.fm/music/Cher/_/Believe",
//        "streamable": "0",
//      }
//]
) {
}