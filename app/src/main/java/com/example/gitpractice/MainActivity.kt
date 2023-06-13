package com.example.gitpractice

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    private fun change(view: View) {
        val intent = Intent(this@MainActivity, SubActivity::class.java)
        startActivity(intent)
    }
}