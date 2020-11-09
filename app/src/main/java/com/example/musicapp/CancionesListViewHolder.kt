package com.example.musicapp

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CancionesListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    val nombreCancion = itemView.findViewById<TextView>(R.id.txtNombreCanciones)

}
