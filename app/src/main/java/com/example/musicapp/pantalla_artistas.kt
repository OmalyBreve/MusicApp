package com.example.musicapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.musicapp.repo.ArtistaRepo
import com.example.musicapp.service.ArtistaResponse
import com.example.musicapp.service.ArtistasService
import com.google.gson.Gson
import kotlinx.android.synthetic.main.activity_pantalla_artistas.*
import org.json.JSONArray

class pantalla_artistas : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pantalla_artistas)

        val artistasService = ArtistasService.instance
        val artistaRepo = ArtistaRepo(artistasService)
        val artistaListAdapter = ArtistasListRecyclerViewAdapter()

        artistaRepo.listarArtistas {
            if(it != null){
                val listArtist = ArrayList<ArtistaResponse>()
                val value = it.getAsJsonObject("artist").getAsJsonObject("similar").get("artist")
                val resp = Gson().toJson(value)
                val array = JSONArray(resp)
                for (i in 0 until array.length()){
                    val row = array.getJSONObject(i)
                    listArtist.add(ArtistaResponse(row.getString("name")))
                }

                rcvArtistas.layoutManager = LinearLayoutManager(this)
                artistaListAdapter.listaArtistas = listArtist
                rcvArtistas.adapter = artistaListAdapter
            }
        }
    }
}