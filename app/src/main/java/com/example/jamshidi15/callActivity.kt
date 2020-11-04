package com.example.jamshidi15

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText

class callActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_call)
        val btnCall=findViewById<Button>(R.id.btncalling)
        val edtCall=findViewById<EditText>(R.id.edtcall)
        btnCall.setOnClickListener(View.OnClickListener {
            val edtcallTxt=edtCall.text.toString()
            val intent2=Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+edtcallTxt))
            startActivity(intent2)
        })
    }
}