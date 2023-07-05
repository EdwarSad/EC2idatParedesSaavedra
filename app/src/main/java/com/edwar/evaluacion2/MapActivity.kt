package com.edwar.evaluacion2

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.edwar.evaluacion2.databinding.ActivityCameraBinding
import com.edwar.evaluacion2.databinding.ActivityMapBinding

class MapActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMapBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMapBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val intentUri = Uri.parse("geo:0,0?q=-12.066877,-77.0357210(IDAT-Lima Centro)")
        val mapIntent = Intent(Intent.ACTION_VIEW, intentUri)
        mapIntent.setPackage("com.google.android.apps.maps")
        mapIntent.resolveActivity(packageManager).let {
            startActivity(mapIntent)
        }

    }
}