package com.example.musicapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.musicapp.repo.ArtistaRepo
import com.example.musicapp.service.ArtistasService
import kotlinx.android.synthetic.main.activity_pantalla_artistas.*

class pantalla_artistas : AppCompatActivity() {
    lateinit var rcvArtistasList : RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pantalla_artistas)

        val artistasService = ArtistasService.instance
        val artistaRepo = ArtistaRepo(artistasService)
        val artistaListAdapter = ArtistasListRecyclerViewAdapter()

        artistaRepo.listarArtistas {
            if(it != null){

                artistaListAdapter.listaArtistas = it
                artistaListAdapter.notifyDataSetChanged()

            }
        }


        rcvArtistasList = rcvArtistas
        rcvArtistasList.layoutManager = LinearLayoutManager(this)
        rcvArtistasList.adapter = artistaListAdapter
    }
}