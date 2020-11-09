package com.example.musicapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_pantalla_artistas.*
import kotlinx.android.synthetic.main.activity_pantalla_artistas.*

class pantalla_artistas : AppCompatActivity() {
    lateinit var rcvArtistasList : RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pantalla_artistas)

        rcvArtistasList = rcvArtistas
        rcvArtistasList.layoutManager = LinearLayoutManager(this)
        rcvArtistasList.adapter = ArtistasListRecyclerViewAdapter()
    }
}