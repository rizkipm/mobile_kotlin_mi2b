package com.rizki.mobileappskotlinmi2b.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.rizki.mobileappskotlinmi2b.R
import com.rizki.mobileappskotlinmi2b.model.ModelBuku

class BukuAdapter (private val buku: List<ModelBuku>) :
    RecyclerView.Adapter<BukuAdapter.BukuAdapterHolder>() {

    //view holder yang digunakan unutk menyimpan referensi layout item
    class BukuAdapterHolder(view: View) : RecyclerView.ViewHolder(view){
        val txtJudul : TextView = view.findViewById(R.id.txtJudulBuku)
        val txtPenulis : TextView = view.findViewById(R.id.txtPenulis)
    }

    //pengaturan data item pada setiap list dari recycle view
    override fun onBindViewHolder(holder: BukuAdapterHolder, position: Int) {
      
        holder.txtPenulis.text = buku[position].penulis
        holder.txtJudul.text = buku[position].title
    }

    //membuat layout list item sebagai item dari recycle view
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BukuAdapterHolder {

        val  view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_list, parent, false)
        return  BukuAdapterHolder(view)
    }

    //mengembalikan panjang nilai dari data
    override fun getItemCount(): Int{
        return buku.size
    }

}