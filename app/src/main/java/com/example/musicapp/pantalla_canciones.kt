package com.example.musicapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.musicapp.repo.CancionesRepo
import com.example.musicapp.service.CancionesResponse
import com.example.musicapp.service.CancionesService
import com.google.gson.Gson
import kotlinx.android.synthetic.main.activity_pantalla_canciones.*
import org.json.JSONArray


class pantalla_canciones : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pantalla_canciones)

        val cancionesService = CancionesService.instance
        val cancionesRepo = CancionesRepo(cancionesService)
        val cancionesListAdapter = CancionesListRecyclerViewAdapter()

        cancionesRepo.listarCanciones {
            if(it != null){
                //Se recupera un JsonObject
                val listCancion = ArrayList<CancionesResponse>()
                //Aceedo a la key topTracks pero esta tiene otra key que se llama track
                val value = it.getAsJsonObject("toptracks").get("track")
                //Lo convierto en un Json String
                val json = Gson().toJson(value)
                //Lo converito en un JSONArray para poder acceder a cada una de las propiedades
                val array = JSONArray(json)
                //El for recorre el array
                for (i in 0 until array.length()){
                    val row = array.getJSONObject(i)
                    //Aqui añado en la lista nuevos objectos de tipo Canciones response
                    listCancion.add(CancionesResponse(row.getString("name"), row.getString("playcount"), row.getString("listeners"),row.getString("url")))
                }
                cancionesListAdapter.listaCanciones = listCancion
                cancionesListAdapter.notifyDataSetChanged()

            }
        }

        rcvCanciones.layoutManager = LinearLayoutManager(this)
        rcvCanciones.adapter = cancionesListAdapter
    }
}