package com.example.musicapp

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView


class AlbumesListRecyclerViewAdapter : RecyclerView.Adapter<AlbumesListViewHolder>() {

    val listaAlbumes = listOf<String>(
        "Nibiru",
        "Aura",
        "Oasis",
        "Colores",
        "11:11",
        "F.A.M.E",
        "Las que no iban a salir",
        "X Siempre",
        "La familia",
        "Enoc",
        "Mundial",
        "1 of 1",
        "YHLQMDLG",
        "Odisea",
        "Masterpiece"
    )
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AlbumesListViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.datos_albumes,parent,false)
        return AlbumesListViewHolder(view)

    }

    override fun onBindViewHolder(holder: AlbumesListViewHolder, position: Int) {
        holder.nombreAlbumes.text = listaAlbumes[position]

    }

    override fun getItemCount(): Int {
        return listaAlbumes.size
    }

}



