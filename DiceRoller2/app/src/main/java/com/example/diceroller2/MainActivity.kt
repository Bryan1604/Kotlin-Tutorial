package com.example.diceroller2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.button)
        rollButton.setOnClickListener {
            rollDice()
        }

        val rollButton2: Button = findViewById(R.id.button2)
        rollButton2.setOnClickListener {
            rollDice2()
        }

    }

    private fun rollDice() {
        // Create new Dice object with 6 sides and roll it
        var dice = Dice(6)
        var diceRoll = dice.roll()

        // Update the screen with the dice roll
        val resultTextView: TextView = findViewById(R.id.textView)
        resultTextView.text = diceRoll.toString()
    }

    private fun rollDice2() {
        // Create new Dice object with 6 sides and roll it
        var dice = Dice(6)
        var diceRoll = dice.roll()

        // Update the screen with the dice roll
        val resultTextView2: TextView = findViewById(R.id.textView2)
        resultTextView2.text = diceRoll.toString()
    }

}

class Dice(private var numSize: Int) {
    fun roll(): Int {
        return (1..numSize).random()
    }
}