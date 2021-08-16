package com.example.gaspi

import android.content.Intent
import android.media.MediaPlayer
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.google.android.gms.ads.*
import com.google.android.gms.ads.interstitial.InterstitialAd
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback


class MainActivity : AppCompatActivity() {
    private var adIntersicial: InterstitialAd? = null
    private var TAG = "INTAD"

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        MobileAds.initialize(this){}
        val adMain=findViewById<AdView>(R.id.adMain)
        val adRequest = AdRequest.Builder().build()
        adMain.loadAd(adRequest)
        //value final: ca-app-pub-5766982615688532/1985753795
        //Value Prueba: ca-app-pub-3940256099942544/1033173712
        InterstitialAd.load(this,"ca-app-pub-3940256099942544/1033173712" ,adRequest, object : InterstitialAdLoadCallback() {
            override fun onAdFailedToLoad(adError: LoadAdError) {
                Log.d(TAG, adError.message)
                adIntersicial = null
            }

            override fun onAdLoaded(interstitialAd: InterstitialAd) {
                Log.d(TAG, "Ad cargada correctamente")
                adIntersicial = interstitialAd
            }
        })

        /*adIntersicial?.fullScreenContentCallback = object: FullScreenContentCallback() {
            override fun onAdDismissedFullScreenContent() {
                Log.d(TAG, "Ad was dismissed.")
            }

            override fun onAdFailedToShowFullScreenContent(adError: AdError?) {
                Log.d(TAG, "Ad failed to show.")
            }

            override fun onAdShowedFullScreenContent() {
                Log.d(TAG, "Ad showed fullscreen content.")
                adIntersicial = null
            }
        }
*/


        val buenas = findViewById<Button>(R.id.bBuenas)
        val fiumba =findViewById<Button>(R.id.bFiumba)
        val Despertarse= findViewById<Button>(R.id.bDespertarse)
        val Boliviano= findViewById<Button>(R.id.bBoliviano)
        val BuenosDias= findViewById<Button>(R.id.bBuenosDias)
        val LindaManana= findViewById<Button>(R.id.bLindaMañana)
        val TePego = findViewById<Button>(R.id.bTePego)
        val VamosArriba= findViewById<Button>(R.id.bVamosArriba)
        val Anibal=findViewById<Button>(R.id.bAnibalFernandez)
        val Chumba = findViewById<Button>(R.id.bChumba)
        val ComoTeVa=findViewById<Button>(R.id.bComoTeVa)
        val Muro1=findViewById<Button>(R.id.bMuro1)
        val Muro2=findViewById<Button>(R.id.bMuro2)
        val Fernanflo1=findViewById<Button>(R.id.bFernanflo1)
        val Fernanflo2 =findViewById<Button>(R.id.bFernanflo2)
        val German = findViewById<Button>(R.id.bGerman)
        val FinalFeliz= findViewById<Button>(R.id.bFinalFeliz)
        val PL = findViewById<Button>(R.id.bPL)
        val PLTrans = findViewById<Button>(R.id.bPLTrans)
        val BuenasATodos = findViewById<Button>(R.id.bBuenasATodos)
        val Paraguayo = findViewById<Button>(R.id.bParaguayo)
        val Pes1 = findViewById<Button>(R.id.bPES1)
        val Pes2 = findViewById<Button>(R.id.bPES2)
        val Quiencianera = findViewById<Button>(R.id.bQuinciañera)
        val Sambabam = findViewById<Button>(R.id.bSambabam)
        val Silvia = findViewById<Button>(R.id.bSilvia)
        val Silvina = findViewById<Button>(R.id.bSilvina)
        val Siuk = findViewById<Button>(R.id.bSiuk)
        val Socrates = findViewById<Button>(R.id.bSocrates)
        val Suscribite = findViewById<Button>(R.id.bSub)
        val Suculini = findViewById<Button>(R.id.bSuculini)
        val Trans= findViewById<Button>(R.id.bTrans)

        val BotonRedes= findViewById<Button>(R.id.bRedes)

        buenas.setOnClickListener {
            val mediaPlayer: MediaPlayer? = MediaPlayer.create(this, R.raw.buenas)
            mediaPlayer?.start()
        }

        fiumba.setOnClickListener {
            val mediaPlayer: MediaPlayer? = MediaPlayer.create(this, R.raw.fiumba)
            mediaPlayer?.start()
        }

        Despertarse.setOnClickListener{
            val mediaPlayer: MediaPlayer? = MediaPlayer.create(this, R.raw.a_despertarse)
            mediaPlayer?.start()
        }

        Boliviano.setOnClickListener{
            val mediaPlayer: MediaPlayer? = MediaPlayer.create(this, R.raw.boliviano)
            mediaPlayer?.start()
        }

        BuenosDias.setOnClickListener{
            val mediaPlayer: MediaPlayer? = MediaPlayer.create(this, R.raw.buenos_dias)
            mediaPlayer?.start()
        }

        LindaManana.setOnClickListener{
            val mediaPlayer: MediaPlayer? = MediaPlayer.create(this, R.raw.linda_manana)
            mediaPlayer?.start()
        }

        TePego.setOnClickListener{
            val mediaPlayer: MediaPlayer? = MediaPlayer.create(this, R.raw.te_pego)
            mediaPlayer?.start()
        }

        VamosArriba.setOnClickListener {
            val mediaPlayer: MediaPlayer? = MediaPlayer.create(this, R.raw.vamos_arriba)
            mediaPlayer?.start()
        }

        Anibal.setOnClickListener {
            val mediaPlayer: MediaPlayer? = MediaPlayer.create(this, R.raw.anibal_fernandez)
            mediaPlayer?.start()
        }
        Chumba.setOnClickListener {
            val mediaPlayer: MediaPlayer? = MediaPlayer.create(this, R.raw.chumba)
            mediaPlayer?.start()
        }
        ComoTeVa.setOnClickListener {
            val mediaPlayer: MediaPlayer? = MediaPlayer.create(this, R.raw.como_te_va)
            mediaPlayer?.start()
        }
        Muro1.setOnClickListener {
            val mediaPlayer: MediaPlayer? = MediaPlayer.create(this, R.raw.el_muro_infernal)
            mediaPlayer?.start()
        }
        Muro2.setOnClickListener{
            val mediaPlayer: MediaPlayer? = MediaPlayer.create(this, R.raw.muro_infernal_2)
            mediaPlayer?.start()
        }
        Fernanflo1.setOnClickListener {
            val mediaPlayer: MediaPlayer? = MediaPlayer.create(this, R.raw.fernanflo)
            mediaPlayer?.start()
        }
        Fernanflo2.setOnClickListener {
            val mediaPlayer: MediaPlayer? = MediaPlayer.create(this, R.raw.fernanflo_2)
            mediaPlayer?.start()
        }
        German.setOnClickListener {
            val mediaPlayer: MediaPlayer? = MediaPlayer.create(this, R.raw.german_garmendia)
            mediaPlayer?.start()
        }
        FinalFeliz.setOnClickListener {
            val mediaPlayer: MediaPlayer? = MediaPlayer.create(this, R.raw.final_feliz)
            mediaPlayer?.start()
        }
        PL.setOnClickListener {
            val mediaPlayer: MediaPlayer? = MediaPlayer.create(this, R.raw.paulo_londra)
            mediaPlayer?.start()
        }
        PLTrans.setOnClickListener {
            val mediaPlayer: MediaPlayer? = MediaPlayer.create(this, R.raw.paulo_londra_trans)
            mediaPlayer?.start()
        }
        BuenasATodos.setOnClickListener {
            val mediaPlayer: MediaPlayer? = MediaPlayer.create(this, R.raw.muy_buenas_a_todos)
            mediaPlayer?.start()
        }
        Paraguayo.setOnClickListener {
            val mediaPlayer: MediaPlayer? = MediaPlayer.create(this, R.raw.paraguayo)
            mediaPlayer?.start()
        }
        Pes1.setOnClickListener {
            val mediaPlayer: MediaPlayer? = MediaPlayer.create(this, R.raw.pro_evolution_soccer)
            mediaPlayer?.start()
        }
        Pes2.setOnClickListener {
            val mediaPlayer: MediaPlayer? = MediaPlayer.create(this, R.raw.pro_evolution_soccer_2)
            mediaPlayer?.start()
        }
        Quiencianera.setOnClickListener {
            val mediaPlayer: MediaPlayer? = MediaPlayer.create(this, R.raw.quincianera)
            mediaPlayer?.start()
        }
        Sambabam.setOnClickListener {
            val mediaPlayer: MediaPlayer? = MediaPlayer.create(this, R.raw.sambabam)
            mediaPlayer?.start()
        }
        Silvia.setOnClickListener {
            val mediaPlayer: MediaPlayer? = MediaPlayer.create(this, R.raw.silvia)
            mediaPlayer?.start()
        }
        Silvina.setOnClickListener {
            val mediaPlayer: MediaPlayer? = MediaPlayer.create(this, R.raw.silvina_escudero)
            mediaPlayer?.start()
        }
        Siuk.setOnClickListener {
            val mediaPlayer: MediaPlayer? = MediaPlayer.create(this, R.raw.siuk)
            mediaPlayer?.start()
        }
        Socrates.setOnClickListener {
            val mediaPlayer: MediaPlayer? = MediaPlayer.create(this, R.raw.socrates)
            mediaPlayer?.start()
        }
        Suscribite.setOnClickListener {
            val mediaPlayer: MediaPlayer? = MediaPlayer.create(this, R.raw.sub_a_la_p)
            mediaPlayer?.start()
        }
        Suculini.setOnClickListener {
            val mediaPlayer: MediaPlayer? = MediaPlayer.create(this, R.raw.suculini)
            mediaPlayer?.start()
        }
        Trans.setOnClickListener {
            val mediaPlayer: MediaPlayer? = MediaPlayer.create(this, R.raw.transexual)
            mediaPlayer?.start()
        }

        BotonRedes.setOnClickListener {
            val intent = Intent(this, Redes::class.java)
            startActivity(intent)
        }

        if (BotonRedes.isPressed) {
            adIntersicial?.show(this)
        } else {
            Log.d("TAG", "The interstitial ad wasn't ready yet.")
        }
    }
}
