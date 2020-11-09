package com.example.musicapp

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.musicapp.service.MusicResponse


class AlbumesListRecyclerViewAdapter : RecyclerView.Adapter<AlbumesListViewHolder>() {

    var listaAlbumes = listOf<MusicResponse.AlbumesItem>()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AlbumesListViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.datos_albumes,parent,false)
        return AlbumesListViewHolder(view)

    }

    override fun onBindViewHolder(holder: AlbumesListViewHolder, position: Int) {
        holder.nombreAlbumes.text = listaAlbumes[position].text

    }

    override fun getItemCount(): Int {
        return listaAlbumes.size
    }

}



