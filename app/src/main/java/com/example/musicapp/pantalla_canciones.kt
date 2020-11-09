package com.example.musicapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_pantalla_canciones.*

class pantalla_canciones : AppCompatActivity() {
    lateinit var rcvCancionesList : RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pantalla_canciones)

        rcvCancionesList = rcvCanciones
        rcvCancionesList.layoutManager = LinearLayoutManager(this)
        rcvCancionesList.adapter = CancionesListRecyclerViewAdapter()
    }
}