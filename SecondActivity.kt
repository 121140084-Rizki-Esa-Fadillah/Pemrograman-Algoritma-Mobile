package com.example.tugas_1

import android.os.Bundle
import androidx.activity.ComponentActivity
import android.widget.TextView

class SecondActivity : ComponentActivity() {

    lateinit var outputNama: TextView
    lateinit var outputUmur: TextView
    lateinit var outputJK: TextView
    lateinit var outputGame: TextView
    lateinit var outputIDGame: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        outputNama = findViewById(R.id.out_Nama)
        outputUmur = findViewById(R.id.out_Umur)
        outputJK = findViewById(R.id.out_JK)
        outputGame = findViewById(R.id.out_Game)
        outputIDGame = findViewById(R.id.out_IDGame)

        val nama = intent.getStringExtra("Nama")
        val umur = intent.getStringExtra("Umur")
        val jk = intent.getStringExtra("JK")
        val game = intent.getStringExtra("Game")
        val idgame = intent.getStringExtra("IDGame")

        if (nama != null && umur != null && jk != null && game != null && idgame != null) {
            outputNama.text = "Nama = $nama"
            outputUmur.text = "Umur = $umur"
            outputJK.text = "JK = $jk"
            outputGame.text = "Game = $game"
            outputIDGame.text = "IDGame = $idgame"
        }
    }
}
