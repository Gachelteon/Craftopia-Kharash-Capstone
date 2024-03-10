package com.capstone.craftopiafinal

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.LinkMovementMethod
import android.widget.ImageView
import android.widget.TextView

class Register : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        val textView: TextView = findViewById(R.id.textView)
        textView.movementMethod = LinkMovementMethod.getInstance()
        val googleImageView: ImageView = findViewById(R.id.google)
        val gmailImageView: ImageView = findViewById(R.id.gmail)
        val facebookImageView: ImageView = findViewById(R.id.facebook)

        googleImageView.setOnClickListener {
            val url = "https://accounts.google.com/o/oauth2/v2/auth/oauthchooseaccount?client_id=187685766663-ct6bdnthcq6jlllecpg1guhthoc7i8vv.apps.googleusercontent.com&redirect_uri=https%3A%2F%2Fauthenticate.riotgames.com%2Fredirects%2Fgoogle&state=ebe440a8220c2e415aa3541948f68c5487a0b72b83364fcc5ae5ec7216e4&response_type=code&access_type=online&prompt=select_account&scope=openid%20profile%20email&service=lso&o2v=2&theme=mn&flowName=GeneralOAuthFlow"
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
            startActivity(intent)
        }

        gmailImageView.setOnClickListener {
            val url = "https://mail.google.com"
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
            startActivity(intent)
        }

        facebookImageView.setOnClickListener {
            val url = "https://www.facebook.com"
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
            startActivity(intent)
        }
    }
}