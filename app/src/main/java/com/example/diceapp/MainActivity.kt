package com.example.diceapp

import android.support.v7.app.AppCompatActivity

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.button)
//        / Set a click listener on the button to roll the dice when the user taps the button
        rollButton.setOnClickListener { rollDice() }
    }

    /**
     * Roll the dice and update the screen with the result.
     */
    private fun rollDice() {
        // Create new Dice object with 6 sides and roll it

        val dice = Dice(6)
        val diceRoll = dice.roll()
        val diceImage: ImageView = findViewById(R.id.imageView)
        if (diceRoll == 1) {
            diceImage.setImageResource(R.drawable.dice_1)
        } else if (diceRoll == 2) {
            diceImage.setImageResource(R.drawable.dice_2)
        } else if (diceRoll == 3) {
            diceImage.setImageResource(R.drawable.dice_3)

        } else if (diceRoll == 4) {
            diceImage.setImageResource(R.drawable.dice_4)

        } else if (diceRoll == 5) {
            diceImage.setImageResource(R.drawable.dice_5)

        } else if (diceRoll == 6) {
            diceImage.setImageResource(R.drawable.dice_6)

        }
    }
}
class Dice(val numSides: Int) {

    fun roll(): Int {
        return (1..numSides).random()
    }
}
