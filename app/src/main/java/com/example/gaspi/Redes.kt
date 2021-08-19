package com.example.gaspi

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.Menu
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar

class Redes : AppCompatActivity() {

    val toolbar: Toolbar? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.redes)

        val toolbar = findViewById<Toolbar>(R.id.toolbar)
        toolbar.setTitle("Redes Sociales")
        setSupportActionBar(toolbar)

        var actionBar = supportActionBar
        actionBar?.setDisplayHomeAsUpEnabled(true)

        val ytGaspi = Intent(Intent.ACTION_VIEW, Uri.parse("http://youtube.com/c/GaspiPD"))
        val ttGaspi= Intent(Intent.ACTION_VIEW, Uri.parse("http://www.tiktok.com/@gaspipd"))
        val igGaspi= Intent(Intent.ACTION_VIEW, Uri.parse("http://www.instagram.com/gaspipd"))
        val igCreador= Intent(Intent.ACTION_VIEW, Uri.parse("http://www.instagram.com/marcos.bindo"))

        val bYTgaspi=findViewById<Button>(R.id.bYTGaspi)
        val bTTgaspi=findViewById<Button>(R.id.bTTGaspi)
        val bIGaspi=findViewById<Button>(R.id.bIGGaspi)
        val bIGcreador= findViewById<Button>(R.id.bIGcreador)

        bYTgaspi.setOnClickListener{
            startActivity(ytGaspi)
        }
        bTTgaspi.setOnClickListener {
            startActivity(ttGaspi)
        }
        bIGaspi.setOnClickListener {
            startActivity(igGaspi)
        }
        bIGcreador.setOnClickListener {
            startActivity(igCreador)
        }


    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_pantalla_dos, menu)
        return super.onCreateOptionsMenu(menu)
    }
}
