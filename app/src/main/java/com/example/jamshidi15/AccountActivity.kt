package com.example.jamshidi15

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.view.View
import android.widget.Button

class AccountActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_account)
        val btnsearch = findViewById<Button>(R.id.btnSearch)
        val btncamera = findViewById<Button>(R.id.btncam)
        val btncall=findViewById<Button>(R.id.btncall)
        val btnEmail=findViewById<Button>(R.id.btnEmail)
        btnsearch.setOnClickListener(View.OnClickListener {
            val intent: Intent = Intent(this, searshActivity::class.java)
            startActivity(intent)
        })
         btncall.setOnClickListener(View.OnClickListener {
            val intent2:Intent=Intent(this,callActivity::class.java)
            startActivity(intent2)
        })
        btnEmail.setOnClickListener(View.OnClickListener {
            val intent3:Intent=Intent(this,EmailActivity::class.java)
            startActivity(intent3)
        })
        btncamera.setOnClickListener(View.OnClickListener {
            val intent:Intent=Intent(this,cameraActivity::class.java)
            startActivity(intent)
        })

    }
}
