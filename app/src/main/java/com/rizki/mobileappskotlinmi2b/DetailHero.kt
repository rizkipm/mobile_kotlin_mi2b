package com.rizki.mobileappskotlinmi2b

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class DetailHero : AppCompatActivity() {

    private lateinit var txtDetailMovie: TextView
    private lateinit var txtTanggal: TextView
    private lateinit var txtSinopsis: TextView
    private lateinit var imgDetailMovie : ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_detail_hero)

        txtDetailMovie = findViewById(R.id.txtDetailMovie)
        imgDetailMovie = findViewById(R.id.imgDetailMovie)
        txtTanggal = findViewById(R.id.txtDetailRelease)
        txtSinopsis = findViewById(R.id.txtDetailSinopsis)

//        val txtDetail = getResources().getString(getIntent().getIntExtra("text", 0));
//        val imgDetail = getResources().getIntent().getIntExtra("image", 0);
        val imageResId = intent.getIntExtra("image",0)
        val txtDetail = intent.getStringExtra("teks")
        val tanggalRelease = intent.getStringExtra("tanggal")
        val detailSinopsi = intent.getStringExtra("sinopsis")

        Log.d("img nya", imageResId.toString())
        Log.d("teks detail nya", txtDetail.toString())

        imgDetailMovie.setImageResource(imageResId)
        txtDetailMovie.text = txtDetail
        txtTanggal.text = tanggalRelease
        txtSinopsis.text = detailSinopsi

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}