package com.example.musicapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.musicapp.repo.AlbumesRepo
import com.example.musicapp.service.AlbumesResponse
import com.example.musicapp.service.AlbumesService
import com.google.gson.Gson
import kotlinx.android.synthetic.main.activity_pantalla_albumes.*
import org.json.JSONArray

class pantalla_albumes : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pantalla_albumes)

        val albumesService = AlbumesService.instance
        val albumesRepo = AlbumesRepo(albumesService)
        val albumesListAdapter = AlbumesListRecyclerViewAdapter()

        albumesRepo.listarAlbumes {
            if(it != null){
                val listAlbums = ArrayList<AlbumesResponse>()
                val value = it.getAsJsonObject("album").getAsJsonObject("tracks").get("track")
                val json = Gson().toJson(value)
                val array = JSONArray(json)
                for (i in 0 until array.length()){
                    val row = array.getJSONObject(i)
                    listAlbums.add(AlbumesResponse(row.getString("name"), row.getString("url"), row.getString("duration")))
                }
                albumesListAdapter.listaAlbumes =listAlbums
                albumesListAdapter.notifyDataSetChanged()

            }
        }
        rcvAlbumes.layoutManager = LinearLayoutManager(this)
        rcvAlbumes.adapter = albumesListAdapter
    }
}