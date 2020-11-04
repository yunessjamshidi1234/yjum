package com.example.jamshidi15

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText

class EmailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_email)
        val phoneNumber=findViewById<EditText>(R.id.phoneNumber)
        val btnSend=findViewById<Button>(R.id.btnSend)
        val edtText=findViewById<EditText>(R.id.txtSms)
        btnSend.setOnClickListener(View.OnClickListener {
            val phn=phoneNumber.text.toString()
            val snd=edtText.text.toString()
            val intent=Intent(Intent.ACTION_SEND)
            intent.data= Uri.parse("smsto:"+phn)
            intent.putExtra("sms_body",snd)
            startActivity(intent)
        })
    }
}