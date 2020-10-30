package com.example.jamshidi15

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import kotlin.random.Random

class KotlinActivity6 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kotlin6)
        val btnTas=findViewById<Button>(R.id.fingerPrint)
        val imgView=findViewById<ImageView>(R.id.cameraPicture)
        btnTas.setOnClickListener(View.OnClickListener {
            var random=Random.nextInt(6)+1
            val txtNumber=findViewById<TextView>(R.id.halat)
            when(random){
                1 -> {imgView.setImageResource(R.drawable.number1)
                    txtNumber.text="Your Random number is 1"}
                2 -> {imgView.setImageResource(R.drawable.number2)
                    txtNumber.text="Your Random number is 2"}
                3 -> {imgView.setImageResource(R.drawable.number3)
                    txtNumber.text="Your Random number is 3"}
                4 -> {imgView.setImageResource(R.drawable.number4)
                    txtNumber.text="Your Random number is 4"}
                5 -> {imgView.setImageResource(R.drawable.number5)
                    txtNumber.text="Your Random number is 5"}
                6 -> {imgView.setImageResource(R.drawable.number6)
                Toast.makeText(this,"Verygood!!",Toast.LENGTH_SHORT).show()
                    txtNumber.text="Your Random number is 6"}
                else ->imgView.setImageResource(R.drawable.ic_baseline_camera_24)



            }

        })
    }
}