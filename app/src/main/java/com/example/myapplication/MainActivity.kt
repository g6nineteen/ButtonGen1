package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import kotlin.random.Random
import java.util.*;

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.button2);
        rollButton.setOnClickListener { rollDice() }
        }

    private fun rollDice(){
        val randomInt = Random().nextInt( bound 6) +1
        val resultText: TextView = findViewById(R.id.number)
        result
    }

}
