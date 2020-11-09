package com.example.musicapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.musicapp.repo.CancionesRepo
import com.example.musicapp.service.CancionesService
import kotlinx.android.synthetic.main.activity_pantalla_canciones.*


class pantalla_canciones : AppCompatActivity() {
    lateinit var rcvCancionesList : RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pantalla_canciones)

        val cancionesService = CancionesService.instance
        val cancionesRepo = CancionesRepo(cancionesService)
        val cancionesListAdapter = CancionesListRecyclerViewAdapter()

        cancionesRepo.listarCanciones {
            if(it != null){

                cancionesListAdapter.listaCanciones = it
                cancionesListAdapter.notifyDataSetChanged()

            }
        }

        rcvCancionesList = rcvCanciones
        rcvCancionesList.layoutManager = LinearLayoutManager(this)
        rcvCancionesList.adapter = cancionesListAdapter
    }
}