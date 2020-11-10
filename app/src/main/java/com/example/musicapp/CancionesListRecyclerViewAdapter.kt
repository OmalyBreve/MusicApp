package com.example.musicapp

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.musicapp.service.CancionesResponse


class CancionesListRecyclerViewAdapter : RecyclerView.Adapter<CancionesListViewHolder>() {

    var listaCanciones = listOf<CancionesResponse>()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CancionesListViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.datos_canciones,parent,false)
        return CancionesListViewHolder(view)

    }

    override fun onBindViewHolder(holder: CancionesListViewHolder, position: Int) {
        holder.nombreCancion.text = listaCanciones[position].name.toString()
        //Intenta probar
    }

    override fun getItemCount(): Int {
        return listaCanciones.size
    }

}
