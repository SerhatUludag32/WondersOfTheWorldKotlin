package com.serhatuludag.wondersoftheworldkotlin

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.serhatuludag.wondersoftheworldkotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var wonderList: ArrayList<Wonder>
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        wonderList = ArrayList<Wonder>()

        val pisa = Wonder(R.drawable.pisatower,"Pisa Tower","Italy,Pisa","The Leaning Tower of Pisa, completed in 1372, is a freestanding bell tower in Pisa, Italy, famous for its unintended tilt.")
        val colosseum = Wonder(R.drawable.colosseum,"Colosseum","Italy,Roma","The Colosseum, an ancient Roman amphitheater completed in 80 AD, is located in Rome and is renowned for its gladiatorial combats.")
        val giza = Wonder(R.drawable.giza,"Giza Pyramids","Egypt,Giza","The Pyramids of Giza, built around 2560 BC in Egypt, are monumental tombs for pharaohs and are one of the Seven Wonders of the Ancient World.")
        val eiffel = Wonder(R.drawable.effiel,"Eiffel Tower","France,Paris","The Eiffel Tower, an iconic Parisian landmark, was completed in 1889 for the World's Fair. Standing 324 meters tall, it symbolizes French engineering and attracts millions of visitors annually.")

        wonderList.add(pisa)
        wonderList.add(colosseum)
        wonderList.add(giza)
        wonderList.add(eiffel)

        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        val adapter = Adapter(wonderList)
        binding.recyclerView.adapter = adapter

    }
}