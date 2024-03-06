package com.example.tugas_1

import android.os.Bundle
import androidx.activity.ComponentActivity
import android.content.Intent
import android.widget.Button
import android.widget.EditText

class MainActivity : ComponentActivity() {

    lateinit var inputNama: EditText
    lateinit var inputUmur: EditText
    lateinit var inputJK: EditText
    lateinit var inputGame: EditText
    lateinit var inputIDGame: EditText
    lateinit var tombolKirim: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first)

        inputNama = findViewById(R.id.in_Nama)
        inputUmur = findViewById(R.id.in_Umur)
        inputJK = findViewById(R.id.in_JK)
        inputGame = findViewById(R.id.in_Game)
        inputIDGame = findViewById(R.id.in_IDGame)
        tombolKirim = findViewById(R.id.Kirim)

        tombolKirim.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("Nama", inputNama.text.toString())
            intent.putExtra("Umur", inputUmur.text.toString())
            intent.putExtra("JK", inputJK.text.toString())
            intent.putExtra("Game", inputGame.text.toString())
            intent.putExtra("IDGame", inputIDGame.text.toString())

            startActivity(intent)
        }
    }
}
