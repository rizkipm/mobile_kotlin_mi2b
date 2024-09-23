package com.rizki.mobileappskotlinmi2b.adapter

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.cardview.widget.CardView
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import com.rizki.mobileappskotlinmi2b.DetailHero
import com.rizki.mobileappskotlinmi2b.R
import com.rizki.mobileappskotlinmi2b.RecycleViewCardMovie
import com.rizki.mobileappskotlinmi2b.model.ModelMovie


class MovieAdapter constructor(
    private val getActivity: RecycleViewCardMovie,//untuk bisa d klik
    private val movieList: List<ModelMovie>,
) :
    RecyclerView.Adapter<MovieAdapter.MyViewHolder>() {

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val txtMovie: TextView = itemView.findViewById(R.id.txtMovie)
        val imgMovie: ImageView = itemView.findViewById(R.id.imgMovie)
        val cardView: CardView = itemView.findViewById(R.id.cardView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val nView = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_movie_card, parent, false)
        return MyViewHolder(nView)
    }

    override fun getItemCount(): Int {
        return movieList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {

        val currentItem = movieList[position]
        holder.txtMovie.text = currentItem.title
        holder.imgMovie.setImageResource(currentItem.image)
//        holder.txtMovie.text = movieList[position].title
//        holder.imgMovie.setImageResource(movieList[position].image)

        //ini ketika item di klik
        holder.itemView.setOnClickListener(){
            //goes to new activity passing the item name
            //goes to new activity passing the item name
            val intent = Intent(getActivity,
                DetailHero::class.java
            )
            val b = Bundle()


            //put text into a bundle and add to intent
            //put text into a bundle and add to intent
            intent.putExtra("teks", movieList[position].title)
            intent.putExtra("image",movieList[position].image)


//            intent.putExtras(b)

            //begin activity

            //begin activity
            getActivity.startActivity(intent)
        }
//        //ini ketika item di klik
//        holder.cardView.setOnClickListener() {
//            onItemClick(position)
//            Toast.makeText(
//                getActivity, movieList[position].title,
//                Toast.LENGTH_SHORT
//            ).show()
//        }
    }

}