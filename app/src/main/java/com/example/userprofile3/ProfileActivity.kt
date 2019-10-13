package com.example.userprofile3

import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_create_profile.*
import kotlinx.android.synthetic.main.activity_profile.*

const val PROFILE_EXTRA = "PROFILE_EXTRA"

class ProfileActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)
        initViews()
    }

    private fun initViews() {
        // add a backarrow
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.title = "Welcome to your profile"

        val profile = intent.getParcelableExtra<Profile>(PROFILE_EXTRA)

        if (profile != null) {
            tvFullName.text = getString(R.string.name, profile.firstName, profile.lastName)
            tvUserDescription.text = profile.description
            if (profile.imageUri != null) ivProfileImage.setImageURI(profile.imageUri)
        }
    }

    // back function
    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        return when (item?.itemId) {

            // specific id of the back button
            android.R.id.home -> {
                finish()
                true
            }
            else -> return super.onOptionsItemSelected(item)
        }
    }

    companion object {
        const val PROFILE_EXTRA = "PROFILE_EXTRA"
    }
}