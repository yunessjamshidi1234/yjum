package com.example.jamshidi15

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.view.View
import android.widget.*
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout

class AccountActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_account)
        val btnDrawer = findViewById<ImageView>(R.id.btn_Drawer)
        val btnsearch = findViewById<TextView>(R.id.btn_Search)
        val btncall=findViewById<TextView>(R.id.btn_Phone)
        val btnEmail=findViewById<TextView>(R.id.btn_Sms)
        val btnprofile=findViewById<TextView>(R.id.btn_Profile)
        val drawer=findViewById<DrawerLayout>(R.id.drawer)
        val btncamera = findViewById<TextView>(R.id.btn_camera)
        btnDrawer.setOnClickListener(View.OnClickListener {
             drawer.openDrawer(GravityCompat.END)
        })
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
        btnprofile.setOnClickListener(View.OnClickListener {
            val intent3:Intent=Intent(this,KtActivity1::class.java)
            startActivity(intent3)
        })

        btncamera.setOnClickListener(View.OnClickListener {
        })

    }
}
