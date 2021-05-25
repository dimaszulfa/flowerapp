package com.dimas.flowers.model

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.dimas.flowers.R


class ListFlowerAdapter(val listFlower: ArrayList<Flowers>) : RecyclerView.Adapter<ListFlowerAdapter.ListViewHolder>() {
    private lateinit var context: Context
    class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvName : TextView = itemView.findViewById(R.id.flower_name)
        var tvLokasi : TextView = itemView.findViewById(R.id.flower_lokasi)
        var BtnDetail : Button = itemView.findViewById(R.id.btnDetail)
        var imgData : ImageView = itemView.findViewById(R.id.data_gambar)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(
            R.layout.item_list,
            parent,
            false
        )
        return ListViewHolder(view)

    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val flower = listFlower[position]

        Glide.with(holder.itemView.context)
                .load(listFlower[position].photo)
                .into(holder.imgData)
        holder.tvName.text = flower.nama
        holder.tvLokasi.text = flower.lokasi
        holder.BtnDetail.setOnClickListener{
            context = holder.itemView.context
            val intent = Intent(context, DetailActivity::class.java)
            intent.putExtra("nama", flower.nama)
            intent.putExtra("lokasi", flower.lokasi)
            intent.putExtra("detail", flower.detail)
            val bundle = Bundle()
            bundle.putInt("image", flower.photo)
            intent.putExtras(bundle)
//            intent.putInt("image", flower.photo)
            context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int {
        return listFlower.size
    }
}