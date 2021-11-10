package com.example.switch7

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // To check a switch
        switchMaterial.isChecked = true

// To listen for a switch's checked/unchecked state changes
        switchMaterial.setOnCheckedChangeListener { buttonView, isChecked
            // Responds to switch being checked/unchecked
        }


    }
}