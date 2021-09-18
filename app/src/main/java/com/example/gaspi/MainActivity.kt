package com.example.gaspi

import android.content.Intent
import android.media.MediaPlayer
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.AdView
import com.google.android.gms.ads.MobileAds


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val toolbar = findViewById<Toolbar>(R.id.toolbar)
        toolbar?.setTitle(R.string.app_name)
        setSupportActionBar(toolbar)

        MobileAds.initialize(this) {}
        val adMain = findViewById<AdView>(R.id.adMain)
        val adRequest = AdRequest.Builder().build()
        adMain.loadAd(adRequest)

        val fiumba = findViewById<Button>(R.id.bFiumba)
        val buenas = findViewById<Button>(R.id.bBuenas)
        val despertarse = findViewById<Button>(R.id.bDespertarse)
        val boliviano = findViewById<Button>(R.id.bBoliviano)
        val buenosDias = findViewById<Button>(R.id.bBuenosDias)
        val lindaManana = findViewById<Button>(R.id.bLindaManana)
        val tePego = findViewById<Button>(R.id.bTePego)
        val vamosArriba = findViewById<Button>(R.id.bVamosArriba)
        val anibal = findViewById<Button>(R.id.bAnibalFernandez)
        val chumba = findViewById<Button>(R.id.bChumba)
        val comoTeVa = findViewById<Button>(R.id.bComoTeVa)
        val muro1 = findViewById<Button>(R.id.bMuro1)
        val muro2 = findViewById<Button>(R.id.bMuro2)
        val fernanflo1 = findViewById<Button>(R.id.bFernanflo1)
        val fernanflo2 = findViewById<Button>(R.id.bFernanflo2)
        val german = findViewById<Button>(R.id.bGerman)
        val finalfeliz = findViewById<Button>(R.id.bFinalFeliz)
        val pl = findViewById<Button>(R.id.bPL)
        val pltrans = findViewById<Button>(R.id.bPLTrans)
        val buenasATodos = findViewById<Button>(R.id.bBuenasATodos)
        val paraguayo = findViewById<Button>(R.id.bParaguayo)
        val pes1 = findViewById<Button>(R.id.bPES1)
        val pes2 = findViewById<Button>(R.id.bPES2)
        val quiencianera = findViewById<Button>(R.id.bQuinciañera)
        val sambabam = findViewById<Button>(R.id.bSambabam)
        val silvia = findViewById<Button>(R.id.bSilvia)
        val silvina = findViewById<Button>(R.id.bSilvina)
        val siuk = findViewById<Button>(R.id.bSiuk)
        val socrates = findViewById<Button>(R.id.bSocrates)
        val suscribite = findViewById<Button>(R.id.bSub)
        val suculini = findViewById<Button>(R.id.bSuculini)
        val trans = findViewById<Button>(R.id.bTrans)
        val afrodisiaco = findViewById<Button>(R.id.bAfrodisiaco)
        val increible = findViewById<Button>(R.id.bIncreible)

        fiumba.setOnClickListener {
            val mediaPlayer: MediaPlayer? = MediaPlayer.create(this, R.raw.fiumba)
            mediaPlayer?.start()
        }
        vamosArriba.setOnClickListener {
            val mediaPlayer: MediaPlayer? = MediaPlayer.create(this, R.raw.vamos_arriba)
            mediaPlayer?.start()
        }
        despertarse.setOnClickListener {
            val mediaPlayer: MediaPlayer? = MediaPlayer.create(this, R.raw.a_despertarse)
            mediaPlayer?.start()
        }
        boliviano.setOnClickListener {
            val mediaPlayer: MediaPlayer? = MediaPlayer.create(this, R.raw.boliviano)
            mediaPlayer?.start()
        }
        buenas.setOnClickListener {
            val mediaPlayer: MediaPlayer? = MediaPlayer.create(this, R.raw.buenas)
            mediaPlayer?.start()
        }
        buenosDias.setOnClickListener {
            val mediaPlayer: MediaPlayer? = MediaPlayer.create(this, R.raw.buenos_dias)
            mediaPlayer?.start()
        }
        tePego.setOnClickListener {
            val mediaPlayer: MediaPlayer? = MediaPlayer.create(this, R.raw.te_pego)
            mediaPlayer?.start()
        }
        lindaManana.setOnClickListener {
            val mediaPlayer: MediaPlayer? = MediaPlayer.create(this, R.raw.linda_manana)
            mediaPlayer?.start()
        }
        chumba.setOnClickListener {
            val mediaPlayer: MediaPlayer? = MediaPlayer.create(this, R.raw.chumba)
            mediaPlayer?.start()
        }
        anibal.setOnClickListener {
            val mediaPlayer: MediaPlayer? = MediaPlayer.create(this, R.raw.anibal_fernandez)
            mediaPlayer?.start()
        }
        comoTeVa.setOnClickListener {
            val mediaPlayer: MediaPlayer? = MediaPlayer.create(this, R.raw.como_te_va)
            mediaPlayer?.start()
        }
        muro1.setOnClickListener {
            val mediaPlayer: MediaPlayer? = MediaPlayer.create(this, R.raw.el_muro_infernal)
            mediaPlayer?.start()
        }
        fernanflo1.setOnClickListener {
            val mediaPlayer: MediaPlayer? = MediaPlayer.create(this, R.raw.fernanflo)
            mediaPlayer?.start()
        }
        fernanflo2.setOnClickListener {
            val mediaPlayer: MediaPlayer? = MediaPlayer.create(this, R.raw.fernanflo_2)
            mediaPlayer?.start()
        }
        finalfeliz.setOnClickListener {
            val mediaPlayer: MediaPlayer? = MediaPlayer.create(this, R.raw.final_feliz)
            mediaPlayer?.start()
        }
        german.setOnClickListener {
            val mediaPlayer: MediaPlayer? = MediaPlayer.create(this, R.raw.german_garmendia)
            mediaPlayer?.start()
        }
        pl.setOnClickListener {
            val mediaPlayer: MediaPlayer? = MediaPlayer.create(this, R.raw.paulo_londra)
            mediaPlayer?.start()
        }
        pltrans.setOnClickListener {
            val mediaPlayer: MediaPlayer? = MediaPlayer.create(this, R.raw.paulo_londra_trans)
            mediaPlayer?.start()
        }
        paraguayo.setOnClickListener {
            val mediaPlayer: MediaPlayer? = MediaPlayer.create(this, R.raw.paraguayo)
            mediaPlayer?.start()
        }
        buenasATodos.setOnClickListener {
            val mediaPlayer: MediaPlayer? = MediaPlayer.create(this, R.raw.muy_buenas_a_todos)
            mediaPlayer?.start()
        }
        muro2.setOnClickListener {
            val mediaPlayer: MediaPlayer? = MediaPlayer.create(this, R.raw.muro_infernal_2)
            mediaPlayer?.start()
        }
        pes1.setOnClickListener {
            val mediaPlayer: MediaPlayer? = MediaPlayer.create(this, R.raw.pro_evolution_soccer)
            mediaPlayer?.start()
        }
        pes2.setOnClickListener {
            val mediaPlayer: MediaPlayer? = MediaPlayer.create(this, R.raw.pro_evolution_soccer_2)
            mediaPlayer?.start()
        }
        quiencianera.setOnClickListener {
            val mediaPlayer: MediaPlayer? = MediaPlayer.create(this, R.raw.quincianera)
            mediaPlayer?.start()
        }
        sambabam.setOnClickListener {
            val mediaPlayer: MediaPlayer? = MediaPlayer.create(this, R.raw.sambabam)
            mediaPlayer?.start()
        }
        silvia.setOnClickListener {
            val mediaPlayer: MediaPlayer? = MediaPlayer.create(this, R.raw.silvia)
            mediaPlayer?.start()
        }
        silvina.setOnClickListener {
            val mediaPlayer: MediaPlayer? = MediaPlayer.create(this, R.raw.silvina_escudero)
            mediaPlayer?.start()
        }
        siuk.setOnClickListener {
            val mediaPlayer: MediaPlayer? = MediaPlayer.create(this, R.raw.siuk)
            mediaPlayer?.start()
        }
        socrates.setOnClickListener {
            val mediaPlayer: MediaPlayer? = MediaPlayer.create(this, R.raw.socrates)
            mediaPlayer?.start()
        }
        suscribite.setOnClickListener {
            val mediaPlayer: MediaPlayer? = MediaPlayer.create(this, R.raw.sub_a_la_p)
            mediaPlayer?.start()
        }
        suculini.setOnClickListener {
            val mediaPlayer: MediaPlayer? = MediaPlayer.create(this, R.raw.suculini)
            mediaPlayer?.start()
        }
        trans.setOnClickListener {
            val mediaPlayer: MediaPlayer? = MediaPlayer.create(this, R.raw.transexual)
            mediaPlayer?.start()
        }
        afrodisiaco.setOnClickListener {
            val mediaPlayer: MediaPlayer? = MediaPlayer.create(this, R.raw.afrodisiaco)
            mediaPlayer?.start()
        }
        increible.setOnClickListener {
            val mediaPlayer: MediaPlayer? = MediaPlayer.create(this, R.raw.increible)
            mediaPlayer?.start()
        }

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.bredes -> {
                val intent = Intent(this, Redes::class.java)
                startActivity(intent)
            }
        }
        return super.onOptionsItemSelected(item)
    }
}
