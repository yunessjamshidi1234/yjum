package com.example.jamshidi15

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.google.gson.Gson
import com.loopj.android.http.AsyncHttpClient
import com.loopj.android.http.JsonHttpResponseHandler
import cz.msebera.android.httpclient.Header
import org.json.JSONObject
import java.lang.Exception

class OgatsharyiActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ogatsharyi)
        val txtfajr=findViewById<TextView>(R.id.azan_sobh)
        val txtSunrise=findViewById<TextView>(R.id.Sunrise)
        val txtDhuhr=findViewById<TextView>(R.id.azan_zohr)
        val txtSunset=findViewById<TextView>(R.id.Sunset)
        val txtmaghrib=findViewById<TextView>(R.id.asan_maghreb)
        val txtMidnight=findViewById<TextView>(R.id.Midnight)
        val btn_click=findViewById<Button>(R.id.btn_click)
        val edt_city=findViewById<EditText>(R.id.edt_city)

        btn_click.setOnClickListener(View.OnClickListener {
            val CITY=edt_city.text.toString()
            val client=AsyncHttpClient()
            val url="http://api.aladhan.com/v1/timingsByCity?city="+CITY+"&country=Iran&method=8"

            client.get(url,object :JsonHttpResponseHandler() {
                override fun onSuccess(statusCode: Int, headers: Array<out Header>?, response: JSONObject?) {
                    super.onSuccess(statusCode, headers, response)
                    val gson=Gson()
                    val pray=gson.fromJson(response.toString(),Pop::class.java)
                    txtfajr.text="اذان صبح :            "+pray.data.timings.Fajr
                    txtSunrise.text="طلوع آفتاب :         "+pray.data.timings.Sunrise
                    txtDhuhr.text="اذان ظهر :              "+pray.data.timings.Dhuhr
                    txtSunset.text="غروب آفتاب :         "+pray.data.timings.Sunset
                    txtmaghrib.text="اذان مغرب :            "+pray.data.timings.Maghrib
                    txtMidnight.text="نیمه شب شرعی :    "+pray.data.timings.Midnight
                }

                override fun onFailure(statusCode: Int, headers: Array<out Header>?, throwable: Throwable?, errorResponse: JSONObject?) {
                    super.onFailure(statusCode, headers, throwable, errorResponse)
                    println(throwable?.message)
                }

            })

        })

    }
}