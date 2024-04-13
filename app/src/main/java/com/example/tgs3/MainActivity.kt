package com.example.tgs3

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val pindahhalaman1: Button = findViewById(R.id.B1)
        pindahhalaman1.setOnClickListener {
            val intent = Intent(this ,MainActivity2::class.java)
            startActivity(intent)
        }
        val tes1: Button = findViewById(R.id.B2)
        tes1.setOnClickListener{
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse("geo:0,0?q=lokasi"))
        intent.setPackage("com.google.android.apps.maps")
        if (intent.resolveActivity(packageManager) != null) {
            startActivity(intent)
        } else {
            Toast.makeText(this, "Google Maps tidak ditemukan", Toast.LENGTH_SHORT).show()
        }}




    }
}