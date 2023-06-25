package com.example.explicitintent

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.webkit.WebStorage
import android.widget.Button
import androidx.cardview.widget.CardView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonNext= findViewById<Button>(R.id.buttonNext)

        buttonNext.setOnClickListener {

            intent= Intent(applicationContext,SecondActivity::class.java)
            startActivity(intent)
        }

        val webButton= findViewById<CardView>(R.id.cardGoogle)
        val cameraButton= findViewById<CardView>(R.id.cardCamera)

        webButton.setOnClickListener {
            val intent= Intent(Intent.ACTION_VIEW)
            intent.data= Uri.parse("https://leetcode.com/subhamkumar75/")
            startActivity(intent)
        }

        cameraButton.setOnClickListener {
            val intent= Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            startActivity(intent)
        }
    }
}