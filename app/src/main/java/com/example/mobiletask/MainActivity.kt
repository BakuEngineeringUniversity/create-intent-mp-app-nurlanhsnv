package com.example.mobiletask

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val openGmailButton = findViewById<Button>(R.id.open_gmail_button)
        val openPhoneButton = findViewById<Button>(R.id.open_phone_button)
        val openMapsButton = findViewById<Button>(R.id.open_maps_button)
        val playMusicButton = findViewById<Button>(R.id.play_music_button)


        openGmailButton.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW).apply {
                data = Uri.parse("mailto:")
            }
            startActivity(intent)
        }


        openPhoneButton.setOnClickListener {
            val intent = Intent(Intent.ACTION_DIAL).apply {
                data = Uri.parse("tel:123456789")
            }
            startActivity(intent)
        }

        openMapsButton.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW).apply {
                data = Uri.parse("geo:0,0?q=Your+Location")
            }
            startActivity(intent)
        }
        playMusicButton.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW).apply {
                data = Uri.parse("https://www.example.com/sample-music.mp3")
            }
            startActivity(intent)
        }
    }
}
