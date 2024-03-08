package com.example.latihan_pam_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mFragmentOne = MainFragment()
        val fragment = supportFragmentManager.findFragmentByTag(MainFragment::class.java.simpleName)

        if (fragment !is MainFragment) {
            supportFragmentManager.beginTransaction()
                .add(R.id.fragment_container, mFragmentOne, MainFragment::class.java.simpleName)
                .commit()
        }
    }
}