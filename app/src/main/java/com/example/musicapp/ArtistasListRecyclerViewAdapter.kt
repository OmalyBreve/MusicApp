package com.example.musicapp

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.musicapp.service.ArtistaResponse


class ArtistasListRecyclerViewAdapter : RecyclerView.Adapter<ArtistasListViewHolder>() {

    var listaArtistas = listOf<ArtistaResponse>()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ArtistasListViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.datos_artistas,parent,false)
        return ArtistasListViewHolder(view)

    }

    override fun onBindViewHolder(holder: ArtistasListViewHolder, position: Int) {
        holder.nombreArtistas.text = listaArtistas[position].name.toString()


    }

    override fun getItemCount(): Int {
        return listaArtistas.size
    }

}



