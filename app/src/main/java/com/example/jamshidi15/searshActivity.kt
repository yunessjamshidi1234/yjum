package com.example.jamshidi15

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText

class searshActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_searsh)
        val btnsea=findViewById<Button>(R.id.btnsearching)
        val edtbrows=findViewById<EditText>(R.id.edtBrowser)
        btnsea.setOnClickListener(View.OnClickListener {
            val btnsearchi=edtbrows.text.toString()
            val intent2=Intent(Intent.ACTION_VIEW, Uri.parse("http://"+btnsearchi))
            startActivity(intent2)
        })

    }
}