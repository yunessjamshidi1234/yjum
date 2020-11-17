package com.example.jamshidi15

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.preference.PreferenceManager
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
        val txtcode=findViewById<TextView>(R.id.dtCode)
        val txtage=findViewById<TextView>(R.id.dtAge)
        val txtcountry=findViewById<TextView>(R.id.dtCountry)
        val btnSabt=findViewById<Button>(R.id.btnSabt)
        val intent=getIntent()
        val name=PreferenceManager.getDefaultSharedPreferences(this).getString("namesaved","Unknown")
        val fname=PreferenceManager.getDefaultSharedPreferences(this).getString("fnamesaved","Unknown")
        val code=PreferenceManager.getDefaultSharedPreferences(this).getString("codesaved","Unknown")
        val age=PreferenceManager.getDefaultSharedPreferences(this).getString("agesaved","Unknown")
        val country=PreferenceManager.getDefaultSharedPreferences(this).getString("countrysaved","Unknown")
        txtNum.text=name+" "+fname
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