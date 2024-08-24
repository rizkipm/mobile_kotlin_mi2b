package com.rizki.mobileappskotlinmi2b

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class PageKedua : AppCompatActivity() {

    private lateinit var eName : EditText
    private lateinit var bSubmit : Button
    private lateinit var vResult : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_page_kedua)
        //declare widget sesuai id
        eName = findViewById(R.id.etName)
        bSubmit = findViewById(R.id.btnSubmit)
        vResult = findViewById(R.id.txtResult)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        bSubmit.setOnClickListener(){
            
            val textInput = eName.text
            vResult.setText("Hello, Welcome to Our Club ! " + textInput)
        }
    }
}