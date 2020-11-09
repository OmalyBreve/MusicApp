package com.example.musicapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_pantalla_2.*

class pantalla_2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pantalla_2)

        btnAlbumes.setOnClickListener {
            val intent: Intent = Intent(this, pantalla_albumes::class.java)
            startActivity(intent)
        }
        btnArtistas.setOnClickListener {
            val intent: Intent = Intent(this, pantalla_artistas::class.java)
            startActivity(intent)
        }

        btnCanciones.setOnClickListener {
            val intent: Intent = Intent(this, pantalla_canciones::class.java)
            startActivity(intent)
        }

        }


}