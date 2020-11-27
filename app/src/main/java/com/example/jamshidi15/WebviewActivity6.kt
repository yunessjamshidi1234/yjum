package com.example.jamshidi15

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.Button
import android.widget.EditText

class WebviewActivity6 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_webview6)
        val edt_url=findViewById<EditText>(R.id.Edt_search)
        val btn_search=findViewById<Button>(R.id.search_btn)
        val WebView=findViewById<WebView>(R.id.WebView)

        WebView.settings.javaScriptEnabled=true
        WebView.settings.setSupportZoom(true)
        WebView.webViewClient= WebViewClient()

        btn_search.setOnClickListener(View.OnClickListener{
            val address=edt_url.text.toString()
            WebView.loadUrl(address)
        })
    }
}