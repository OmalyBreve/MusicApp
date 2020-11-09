package com.example.musicapp

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ArtistasListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    val nombreArtistas = itemView.findViewById<TextView>(R.id.txtNombreArtistas)


}
