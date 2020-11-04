package com.example.jamshidi15

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity5 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main5)
        val txtNum=findViewById<TextView>(R.id.dtName)
        val txtfnum=findViewById<TextView>(R.id.dtFname)
        val txtcode=findViewById<TextView>(R.id.dtCode)
        val txtage=findViewById<TextView>(R.id.dtAge)
        val txtcountry=findViewById<TextView>(R.id.dtCountry)
        val btnSabt=findViewById<Button>(R.id.btnSabt)
        val intent=getIntent()
        val name=intent.getStringExtra("name")
        val fname=intent.getStringExtra("fname")
        val code=intent.getStringExtra("code")
        val age=intent.getStringExtra("age")
        val country=intent.getStringExtra("country")
        txtNum.text="نام: "+name
        txtfnum.text="نام خانوادگی: "+fname
        txtcode.text="کدملی: "+code
        txtage.text="سن: "+age
        txtcountry.text="شغل: "+country
        btnSabt.setOnClickListener(View.OnClickListener {
            val edtSbt = findViewById<EditText>(R.id.edtsabt)
            val correct = edtSbt.text.toString()
            intent.putExtra("salam", correct)

            setResult(Activity.RESULT_OK, intent)
            finish()
        })
    }
}