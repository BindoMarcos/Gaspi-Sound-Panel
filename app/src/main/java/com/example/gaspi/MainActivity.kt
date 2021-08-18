package com.example.gaspi

import android.content.Intent
import android.media.MediaPlayer
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.google.android.gms.ads.*
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        MobileAds.initialize(this){}
        val adMain=findViewById<AdView>(R.id.adMain)
        val adRequest = AdRequest.Builder().build()
        adMain.loadAd(adRequest)

        val botones = arrayOf(bFiumba,bVamosArriba,bDespertarse,bBoliviano,bBuenas,bBuenosDias,bTePego,bLindaManana,
            bChumba,bAnibalFernandez,bComoTeVa,bMuro1,bFernanflo1,bFernanflo2,bFinalFeliz,bGerman,bPL,bPLTrans,bParaguayo,
            bBuenasATodos,bMuro2,bPES1,bPES2,bQuinciañera,bSambabam,bSilvia,bSilvina,bSiuk,bSocrates,bSub,bSuculini,bTrans)

        val botonRedes= findViewById<Button>(R.id.bRedes)

        /* Lista numeros botones
        buenas = 0
         fiumba = 1
         Despertarse= 2
         Boliviano= 3
         BuenosDias= 4
         LindaManana= 5
         TePego = 6
         VamosArriba= 7
         Anibal= 8
         Chumba = 9
         ComoTeVa= 10
         Muro1= 11
         Muro2= 12
         Fernanflo1= 13
         Fernanflo2 = 14
         German = 15
         FinalFeliz= 16
         PL = 17
         PLTrans = 18
         BuenasATodos = 19
         Paraguayo = 20
         Pes1 = 21
         Pes2 = 22
         Quiencianera = 23
         Sambabam = 24
         Silvia = 25
         Silvina = 26
         Siuk = 27
         Socrates = 28
         Suscribite = 29
         Suculini = 30
         Trans= 31*/

            botones[0].setOnClickListener {
                val mediaPlayer: MediaPlayer? = MediaPlayer.create(this, R.raw.fiumba)
                mediaPlayer?.start()
            }
            botones[1].setOnClickListener {
                val mediaPlayer: MediaPlayer? = MediaPlayer.create(this, R.raw.vamos_arriba)
                mediaPlayer?.start()
            }
            botones[2].setOnClickListener{
                val mediaPlayer: MediaPlayer? = MediaPlayer.create(this, R.raw.a_despertarse)
                mediaPlayer?.start()
            }
            botones[3].setOnClickListener{
                val mediaPlayer: MediaPlayer? = MediaPlayer.create(this, R.raw.boliviano)
                mediaPlayer?.start()
            }
            botones[4].setOnClickListener {
                val mediaPlayer: MediaPlayer? = MediaPlayer.create(this, R.raw.buenas)
                mediaPlayer?.start()
            }
            botones[5].setOnClickListener{
                val mediaPlayer: MediaPlayer? = MediaPlayer.create(this, R.raw.buenos_dias)
                mediaPlayer?.start()
            }
            botones[6].setOnClickListener{
                val mediaPlayer: MediaPlayer? = MediaPlayer.create(this, R.raw.te_pego)
                mediaPlayer?.start()
            }
            botones[7].setOnClickListener{
                val mediaPlayer: MediaPlayer? = MediaPlayer.create(this, R.raw.linda_manana)
                mediaPlayer?.start()
            }
            botones[8].setOnClickListener {
                val mediaPlayer: MediaPlayer? = MediaPlayer.create(this, R.raw.chumba)
                mediaPlayer?.start()
            }
            botones[9].setOnClickListener {
                val mediaPlayer: MediaPlayer? = MediaPlayer.create(this, R.raw.anibal_fernandez)
                mediaPlayer?.start()
            }
            botones[10].setOnClickListener {
                val mediaPlayer: MediaPlayer? = MediaPlayer.create(this, R.raw.como_te_va)
                mediaPlayer?.start()
            }
            botones[11].setOnClickListener {
                val mediaPlayer: MediaPlayer? = MediaPlayer.create(this, R.raw.el_muro_infernal)
                mediaPlayer?.start()
            }
            botones[12].setOnClickListener {
                val mediaPlayer: MediaPlayer? = MediaPlayer.create(this, R.raw.fernanflo)
                mediaPlayer?.start()
            }
            botones[13].setOnClickListener {
                val mediaPlayer: MediaPlayer? = MediaPlayer.create(this, R.raw.fernanflo_2)
                mediaPlayer?.start()
            }
            botones[14].setOnClickListener {
                val mediaPlayer: MediaPlayer? = MediaPlayer.create(this, R.raw.final_feliz)
                mediaPlayer?.start()
            }
            botones[15].setOnClickListener {
                val mediaPlayer: MediaPlayer? = MediaPlayer.create(this, R.raw.german_garmendia)
                mediaPlayer?.start()
            }
            botones[16].setOnClickListener {
                val mediaPlayer: MediaPlayer? = MediaPlayer.create(this, R.raw.paulo_londra)
                mediaPlayer?.start()
            }
            botones[17].setOnClickListener {
                val mediaPlayer: MediaPlayer? = MediaPlayer.create(this, R.raw.paulo_londra_trans)
                mediaPlayer?.start()
            }
            botones[18].setOnClickListener {
                val mediaPlayer: MediaPlayer? = MediaPlayer.create(this, R.raw.paraguayo)
                mediaPlayer?.start()
            }
            botones[19].setOnClickListener {
                val mediaPlayer: MediaPlayer? = MediaPlayer.create(this, R.raw.muy_buenas_a_todos)
                mediaPlayer?.start()
            }
            botones[20].setOnClickListener{
                val mediaPlayer: MediaPlayer? = MediaPlayer.create(this, R.raw.muro_infernal_2)
                mediaPlayer?.start()
            }
            botones[21].setOnClickListener {
                val mediaPlayer: MediaPlayer? = MediaPlayer.create(this, R.raw.pro_evolution_soccer)
                mediaPlayer?.start()
            }
            botones[22].setOnClickListener {
                val mediaPlayer: MediaPlayer? = MediaPlayer.create(this, R.raw.pro_evolution_soccer_2)
                mediaPlayer?.start()
            }
            botones[23].setOnClickListener {
                val mediaPlayer: MediaPlayer? = MediaPlayer.create(this, R.raw.quincianera)
                mediaPlayer?.start()
            }
            botones[24].setOnClickListener {
                val mediaPlayer: MediaPlayer? = MediaPlayer.create(this, R.raw.sambabam)
                mediaPlayer?.start()
            }
            botones[25].setOnClickListener {
                val mediaPlayer: MediaPlayer? = MediaPlayer.create(this, R.raw.silvia)
                mediaPlayer?.start()
            }
            botones[26].setOnClickListener {
                val mediaPlayer: MediaPlayer? = MediaPlayer.create(this, R.raw.silvina_escudero)
                mediaPlayer?.start()
            }
            botones[27].setOnClickListener {
                val mediaPlayer: MediaPlayer? = MediaPlayer.create(this, R.raw.siuk)
                mediaPlayer?.start()
            }
            botones[28].setOnClickListener {
                val mediaPlayer: MediaPlayer? = MediaPlayer.create(this, R.raw.socrates)
                mediaPlayer?.start()
            }
            botones[29].setOnClickListener {
                val mediaPlayer: MediaPlayer? = MediaPlayer.create(this, R.raw.sub_a_la_p)
                mediaPlayer?.start()
            }
            botones[30].setOnClickListener {
                val mediaPlayer: MediaPlayer? = MediaPlayer.create(this, R.raw.suculini)
                mediaPlayer?.start()
            }
            botones[31].setOnClickListener {
                val mediaPlayer: MediaPlayer? = MediaPlayer.create(this, R.raw.transexual)
                mediaPlayer?.start()
            }

            botonRedes.setOnClickListener {
                val intent = Intent(this, Redes::class.java)
                startActivity(intent)
            }
        }

}
