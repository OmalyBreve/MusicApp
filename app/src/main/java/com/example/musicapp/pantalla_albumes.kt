package com.example.musicapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_pantalla_albumes.*
import kotlinx.android.synthetic.main.activity_pantalla_albumes.*
import kotlinx.android.synthetic.main.activity_pantalla_albumes.*

class pantalla_albumes : AppCompatActivity() {
    lateinit var rcvAlbumesList : RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pantalla_albumes)

        rcvAlbumesList = rcvAlbumes
        rcvAlbumes.layoutManager = LinearLayoutManager(this)
        rcvAlbumes.adapter = AlbumesListRecyclerViewAdapter()
    }
}