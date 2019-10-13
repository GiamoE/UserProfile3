package com.example.userprofile3

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        // We use 3000MS to make it have a 3 second delay.
        Handler().postDelayed({
            startActivity(
                Intent(
                    this@SplashActivity,
                    CreateProfileActivity::class.java
                )
            )

            // make sure it's removed from the backstack
            finish()
        }, 3000)

    }
}

