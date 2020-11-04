package com.example.jamshidi15

import android.app.Activity
import android.content.Intent
import android.content.res.Configuration
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

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
            val intent: Intent = Intent(this, MainActivity5::class.java)
            val name = edtName.text.toString()
            val fname = edtFname.text.toString()
            val code = edtCode.text.toString()
            val age = edtAge.text.toString()
            val country = edtCountry.text.toString()
            intent.putExtra("name", name)
            intent.putExtra("fname", fname)
            intent.putExtra("code", code)
            intent.putExtra("age", age)
            intent.putExtra("country", country)
            startActivityForResult(intent,150)
        })
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode ==150) {
            if (resultCode == Activity.RESULT_OK){
                val result=data?.getStringExtra("salam")
                Toast.makeText(this,result,Toast.LENGTH_LONG).show()
            }
        }
    }
}