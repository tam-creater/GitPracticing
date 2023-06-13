package com.example.gitpractice

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class SubActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sub)
    }

    private fun changeSecond(view: View) {
        val intent = Intent(this@SubActivity, MainActivity::class.java)
        startActivity(intent)
    }
}