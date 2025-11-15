package com.example.flashcard

import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import android.widget.TextView
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        //ou panse w te k banm pwoblem ti pap
        val question = findViewById<TextView>( R.id.Question)
        val reponse = findViewById<TextView>(R.id.Reponse)

        question.setOnClickListener {
            question.visibility = View.INVISIBLE
            reponse.visibility = View.VISIBLE
        }
    }
}