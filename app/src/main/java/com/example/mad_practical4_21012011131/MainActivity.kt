package com.example.mad_practical4_21012011131

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun LoginClick(view: View) {

        val intent=Intent(this,LoginActivity::class.java)
        startActivity(intent)
    }
}