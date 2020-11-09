package com.example.musicapp

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class AlbumesListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    val nombreAlbumes = itemView.findViewById<TextView>(R.id.txtNombreAlbumes)


}
