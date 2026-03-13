package com.example.recyclerview

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)

        val lista = listOf(
            CardData("Gato 1", "Animación Lottie"),
            CardData("Gato 2", "RecyclerView Card"),
            CardData("Gato 3", "Ejemplo Kotlin"),
            CardData("Gato 4", "Android Studio")
        )

        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = CustomAdapter(lista)
    }
}