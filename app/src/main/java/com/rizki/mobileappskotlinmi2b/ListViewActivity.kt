package com.rizki.mobileappskotlinmi2b

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ListViewActivity : AppCompatActivity() {

    private lateinit var lv_item : ListView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_list_view)
        lv_item = findViewById(R.id.btnListview)

        //listview
        //Listview widget --> Adapter --> Data Source (Array List)

        //bikin array list
        val namaHewan = listOf("Gajah", "Ular", "Beruang", "Panda", "Ikan", "Sapi", "Kambing")
        //kita masukkan data array hewan ke adapater
        //android layout -->
        lv_item.adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, namaHewan)

        //untuk bisa d klik setiap item dari list nya
        lv_item.setOnItemClickListener{
            parent,view, position, id ->
                Toast.makeText(this, "Anda Memilih : ${namaHewan[position]}",
                    Toast.LENGTH_SHORT).show()
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}