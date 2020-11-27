package com.example.jamshidi15

import android.app.Activity
import android.app.AlertDialog
import android.content.Intent
import android.content.res.Configuration
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.preference.PreferenceManager
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
        val btnSaveDB=findViewById<Button>(R.id.btnDatabase)
        val btnshow=findViewById<Button>(R.id.showdatabase)
        val btndelete=findViewById<Button>(R.id.Deletedata)

        val  database =SQLiteHelper(this,"IsIranDB",null,1)

        btnSaveDB.setOnClickListener {
            val dialog=AlertDialog.Builder(this)
                    .setTitle("Attention")
                    .setMessage("Are you sure")
                    .setPositiveButton("yes"){
                        dialog,which ->database.InsertData(edtName.text.toString(),edtFname.text.toString(),edtCode.text.toString().toInt(),edtAge.text.toString().toInt(),edtCountry.text.toString())
                        Toast.makeText(this, "save data!!!", Toast.LENGTH_LONG).show()
                    }
                    .setNegativeButton("no"){
                        dialog,which->Toast.makeText(this, "Dont save data!!!", Toast.LENGTH_LONG).show()
                    }.create()
            dialog.show()
        }
        btnshow.setOnClickListener{
            val result =database.ReadTable()
            Toast.makeText(this,result,Toast.LENGTH_LONG).show()
        }
        btndelete.setOnClickListener{
            database.Deletetable(edtName.text.toString())
            Toast.makeText(this,"Delete data from Database",Toast.LENGTH_LONG).show()
        }


        btnClick.setOnClickListener(View.OnClickListener {
            val name = edtName.text.toString()
            val prefences=PreferenceManager.getDefaultSharedPreferences(this).edit().putString("namesaved",name).apply()
            val fname = edtFname.text.toString()
            val prefences1=PreferenceManager.getDefaultSharedPreferences(this).edit().putString("fnamesaved",fname).apply()
            val code = edtCode.text.toString()
            val prefences2=PreferenceManager.getDefaultSharedPreferences(this).edit().putString("codesaved",code).apply()
            val age = edtAge.text.toString()
            val prefences3=PreferenceManager.getDefaultSharedPreferences(this).edit().putString("agesaved",age).apply()
            val country = edtCountry.text.toString()
            val prefences4=PreferenceManager.getDefaultSharedPreferences(this).edit().putString("countrysaved",country).apply()
            val intent: Intent = Intent(this, MainActivity5::class.java)
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