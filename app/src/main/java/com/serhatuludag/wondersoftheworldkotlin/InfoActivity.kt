package com.serhatuludag.wondersoftheworldkotlin

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.serhatuludag.wondersoftheworldkotlin.databinding.ActivityInfoBinding

private lateinit var binding: ActivityInfoBinding


class InfoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityInfoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val intent = intent
        val selectedWonder = intent.getSerializableExtra("wonder") as Wonder
        binding.textView.text = selectedWonder.name
        binding.locationText.text = selectedWonder.location
        binding.infoText.text = selectedWonder.info
        binding.imageView.setImageResource(selectedWonder.image)

    }
}