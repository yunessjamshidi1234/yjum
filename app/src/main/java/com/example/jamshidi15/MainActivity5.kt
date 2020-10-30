package com.example.jamshidi15

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity5 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main5)
        val txtNum=findViewById<TextView>(R.id.dtName)
        val txtfnum=findViewById<TextView>(R.id.dtFname)
        val txtcode=findViewById<TextView>(R.id.dtCode)
        val txtage=findViewById<TextView>(R.id.dtAge)
        val txtcountry=findViewById<TextView>(R.id.dtCountry)
        val intent=intent
        val name=intent.getStringExtra("name")
        val fname=intent.getStringExtra("fname")
        val code=intent.getStringExtra("code")
        val age=intent.getStringExtra("age")
        val country=intent.getStringExtra("country")
        txtNum.text="Your name: "+name
        txtfnum.text="Your lastname: "+fname
        txtcode.text="Your national code: "+code
        txtage.text="Your age: "+age
        txtcountry.text="your Country: "+country
    }
}