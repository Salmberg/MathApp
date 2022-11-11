package com.example.mathapp

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView

class AnswerActivity : AppCompatActivity() {

    lateinit var resultView : TextView



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_answer)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        resultView = findViewById(R.id.answerView)

        val backButton = findViewById<Button>(R.id.backButton)
        backButton.setOnClickListener {
            finish()
        }


        //plocka ut den information som vi la in i intentet
        val answeredCorrect = intent.getBooleanExtra("answeredCorrect", false)
        Log.d("!!!", "Rätt? $answeredCorrect")

        if (answeredCorrect) {
            resultView.text = "Rätt!!"
        } else {
            resultView.text = "Fel!!"
        }
    }
}