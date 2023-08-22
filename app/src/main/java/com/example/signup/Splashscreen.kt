package com.example.signup

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import android.os.Bundle
import android.os.Looper
import android.os.Handler
import com.bumptech.glide.Glide
import android.widget.ImageView


@SuppressLint("CustomSplashScreen")
class Splashscreen:AppCompatActivity() {
    private val SPLASH_DELAY: Long = 8000  // 3 seconds

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.splashscreen)
        val gifImageView = findViewById<ImageView>(R.id.gifImageView)
        val gifUrl = R.drawable.android
        Glide.with(this)
            .asGif()
            .load(gifUrl) // Replace "your_gif_file" with the name of your GIF file in the raw folder (without extension)
            .into(gifImageView)

        Handler().postDelayed({
            // Start the main activity after the splash delay
            startActivity(Intent(this@Splashscreen, button::class.java))
            finish()
        },SPLASH_DELAY)
    }
}





// Load and display the GIF using Glide