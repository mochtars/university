package com.example.myapplication

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)

    // Mengakses Views dari XML
    val textView: TextView = findViewById(R.id.textView)
    val button: Button = findViewById(R.id.button)

    // Menambahkan interaksi pada Button
    button.setOnClickListener {
      textView.text = "Tombol di klik!"
    }
  }
}
