package com.example.jamshidi15

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText

class KtActivity1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kt1)
        val edtName=findViewById<EditText>(R.id.editTextName)
        val edtFname=findViewById<EditText>(R.id.editTextFname)
        val edtCode=findViewById<EditText>(R.id.editTextCode)
        val edtAge=findViewById<EditText>(R.id.age)
        val edtCountry=findViewById<EditText>(R.id.country)
        val btnClick=findViewById<Button>(R.id.btnClick)
        btnClick.setOnClickListener(View.OnClickListener {
            val intent : Intent=Intent(this,MainActivity5::class.java)
            startActivity(intent)


        })
    }
}