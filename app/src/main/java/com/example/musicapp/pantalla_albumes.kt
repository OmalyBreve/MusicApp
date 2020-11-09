package com.example.musicapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.musicapp.repo.AlbumesRepo
import com.example.musicapp.service.AlbumesService
import kotlinx.android.synthetic.main.activity_pantalla_albumes.*

class pantalla_albumes : AppCompatActivity() {
    lateinit var rcvAlbumesList : RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pantalla_albumes)

        val albumesService = AlbumesService.instance
        val albumesRepo = AlbumesRepo(albumesService)
        val albumesListAdapter = AlbumesListRecyclerViewAdapter()

        albumesRepo.listarAlbumes {
            if(it != null){

                albumesListAdapter.listaAlbumes = it
                albumesListAdapter.notifyDataSetChanged()

            }
        }


        rcvAlbumesList = rcvAlbumes
        rcvAlbumesList.layoutManager = LinearLayoutManager(this)
        rcvAlbumesList.adapter = albumesListAdapter
    }
}