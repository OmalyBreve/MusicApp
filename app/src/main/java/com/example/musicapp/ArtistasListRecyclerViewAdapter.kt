package com.example.musicapp

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView


class ArtistasListRecyclerViewAdapter : RecyclerView.Adapter<ArtistasListViewHolder>() {

    val listaArtistas = listOf<String>(
        "Daddy Yankee ft Sech.",
        "Bad Bunny ft Sech.",
        "Daddy Yankee.",
        "Daddy Yankee ft Nicky Jam.",
        "Anuel AA.",
        "Myke Towers.",
        "Karol G ft Nicki Minaj.",
        "Michael Jackson.",
        "Madonna.",
        "Prince Royce.",
        "Whitney Houston.",
        "Britney Spears.",
        "Backstreet Boys.",
        "Amy Winehouse.",
        "Adele."
    )
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ArtistasListViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.datos_artistas,parent,false)
        return ArtistasListViewHolder(view)

    }

    override fun onBindViewHolder(holder: ArtistasListViewHolder, position: Int) {
        holder.nombreArtistas.text = listaArtistas[position]

    }

    override fun getItemCount(): Int {
        return listaArtistas.size
    }

}



