package com.rizki.mobileappskotlinmi2b.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.rizki.mobileappskotlinmi2b.R
import com.rizki.mobileappskotlinmi2b.model.ModelBuah
import org.w3c.dom.Text

class BuahAdapter(val itemList: ArrayList<ModelBuah>) :
    RecyclerView.Adapter<BuahAdapter.ModelViewHolder>() {
    class ModelViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        //deklrasi widget dari item layout
        var ItemImage: ImageView
        var ItemText: TextView

        init {
            ItemImage = itemView.findViewById(R.id.gambar) as ImageView
            ItemText = itemView.findViewById(R.id.nama) as TextView
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ModelViewHolder {
        val nView = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_customimage, parent, false)
        return ModelViewHolder(nView)
    }

    override fun getItemCount(): Int {
        return itemList.size
    }

    override fun onBindViewHolder(holder: ModelViewHolder, position: Int) {
        holder.ItemImage.setImageResource(itemList[position].image)
        holder.ItemText.setText(itemList[position].deskripsi)
    }

}