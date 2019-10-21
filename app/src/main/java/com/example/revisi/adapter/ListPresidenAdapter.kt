package com.example.revisi.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.revisi.R
import com.example.revisi.model.DataPresiden.listPresiden
import com.example.revisi.model.Presiden

class ListPresidenAdapter (private val ListPresiden: Context, private val presiden : ArrayList<Presiden>, private val listener: (Presiden) -> Unit)
    : RecyclerView.Adapter<ListPresidenAdapter.ViewHolder>(){

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ViewHolder {
        return ViewHolder(LayoutInflater.from(ListPresiden).inflate(R.layout.listviewpresiden, parent, false))
    }

    override fun getItemCount(): Int {
        return listPresiden.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindPresiden(presiden[position], listener)
    }

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        var tvName: TextView = view.findViewById(R.id.tv_item_name)
        var tvData: TextView = view.findViewById(R.id.tv_item_data)
        var imgPoster: ImageView = view.findViewById(R.id.img_item_poster)

        fun bindPresiden(presiden: Presiden, listener: (Presiden) -> Unit){
            tvName.text = presiden.name
            Glide.with(itemView.context)
                .load(presiden.poster)
                .into(imgPoster)

            itemView.setOnClickListener{
                listener(presiden)
            }
        }
    }
}

