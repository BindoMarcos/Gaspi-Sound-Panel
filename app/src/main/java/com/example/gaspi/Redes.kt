package com.example.gaspi

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Redes : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.redes)

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
    }}
