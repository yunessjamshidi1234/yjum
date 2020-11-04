package com.example.jamshidi15

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView

class cameraActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_camera)
        val btnCauper = findViewById<Button>(R.id.btn_capture)
        val imageView = findViewById<ImageView>(R.id.image_view)
        btnCauper.setOnClickListener(View.OnClickListener {

        })
    }
}