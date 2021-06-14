package com.example.weatherapp

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.weatherapp.model.Main
import com.example.weatherapp.model.WeatherItem

class ImageAdapter(imageList: List<Main?>, context: Context) :
    RecyclerView.Adapter<ImageAdapter.ViewHolder>() {
    var imageLists: List<Main?>? = null
    var context: Context? = null

    init {
        this.imageLists = imageList
        this.context = context
    }


    inner class ViewHolder(itemView: View?) : RecyclerView.ViewHolder(itemView!!) {
        val tvTemp: TextView? = itemView?.findViewById(R.id.tempTV)


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v: View =
            LayoutInflater.from(parent.context).inflate(R.layout.item_weather, parent, false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.tvTemp?.setText(imageLists?.get(position)?.temp.toString())

    }

    override fun getItemCount(): Int {
        return imageLists!!.size
    }


}