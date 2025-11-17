package com.example.flashcard

import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import android.widget.TextView
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.lifecycle.VIEW_MODEL_STORE_OWNER_KEY

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        //ou panse w te k banm pwoblem ti pap
        val question = findViewById<TextView>( R.id.Question)
        val reponse = findViewById<TextView>(R.id.Reponse1)
        val reponse2 = findViewById<TextView>(R.id.Reponse2)
        val reponse3 = findViewById<TextView>(R.id.Reponse3)
        val img1 = findViewById<ImageView>(R.id.imageView)
        val img2 = findViewById<ImageView>(R.id.imageView2)


        reponse2.setOnClickListener {
            reponse3.setBackgroundColor(getResources().getColor(R.color.bleu, null))
            reponse2.setBackgroundColor(getResources().getColor(R.color.vert, null))
            reponse.setBackgroundColor(getResources().getColor(R.color.rouge, null))
        }

        reponse.setOnClickListener {
            reponse3.setBackgroundColor(getResources().getColor(R.color.bleu, null))
            reponse2.setBackgroundColor(getResources().getColor(R.color.vert, null))
            reponse.setBackgroundColor(getResources().getColor(R.color.rouge, null))
        }

        reponse3.setOnClickListener {
            reponse3.setBackgroundColor(getResources().getColor(R.color.bleu, null))
            reponse2.setBackgroundColor(getResources().getColor(R.color.vert, null))
            reponse.setBackgroundColor(getResources().getColor(R.color.rouge, null))
        }

        img1.setOnClickListener {
            reponse.visibility = View.VISIBLE
            reponse2.visibility = View.VISIBLE
            reponse3.visibility = View.VISIBLE
            img2.visibility = View.VISIBLE
            img1.visibility = View.INVISIBLE
        }

        img2.setOnClickListener {
            reponse.visibility = View.INVISIBLE
            reponse2.visibility = View.INVISIBLE
            reponse3.visibility = View.INVISIBLE
            img2.visibility = View.INVISIBLE
            img1.visibility = View.VISIBLE
        }

    }
}