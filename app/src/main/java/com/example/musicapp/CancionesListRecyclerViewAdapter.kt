package com.example.musicapp

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class CancionesListRecyclerViewAdapter : RecyclerView.Adapter<CancionesListViewHolder>() {

    val listaCanciones = listOf<String>(
        "Definitivamente – Daddy Yankee ft Sech.",
        "Ignorantes – Bad Bunny ft Sech.",
        "Que tire pa lante – Daddy Yankee.",
        "Muévelo – Daddy Yankee ft Nicky Jam.",
        "Keii – Anuel AA.",
        "Girl – Myke Towers.",
        "Relación Rota – Myke Towers.",
        "Tusa – Karol G ft Nicki Minaj.",
        "Thriller - Michael Jackson.",
        "Like a Prayer - Madonna.",
        "When Doves Cry - Prince Royce.",
        "I Wanna Dance With Somebody - Whitney Houston.",
        "Baby One More Time - Britney Spears.",
        "Everybody - Backstreet Boys.",
        "Rehab - Amy Winehouse.",
        "Rolling in the Deep - Adele."
    )
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CancionesListViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.datos_canciones,parent,false)
        return CancionesListViewHolder(view)

    }

    override fun onBindViewHolder(holder: CancionesListViewHolder, position: Int) {
        holder.nombreCancion.text = listaCanciones[position]

    }

    override fun getItemCount(): Int {
        return listaCanciones.size
    }

}
