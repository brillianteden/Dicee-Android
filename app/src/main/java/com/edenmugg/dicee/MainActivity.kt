package com.edenmugg.dicee

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import java.util.Random

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.rollButton)
        val leftDice: ImageView = findViewById(R.id.image_leftDice)
        val rightDice: ImageView = findViewById(R.id.image_rightDice)
        val diceArray: IntArray = intArrayOf(R.drawable.dice1,
                R.drawable.dice2,
                R.drawable.dice3,
                R.drawable.dice4,
                R.drawable.dice5,
                R.drawable.dice6)

        rollButton.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View) {

                val randomNumberGenerator: Random = Random()
                var number = 0
                var number2 = 0
                number = randomNumberGenerator . nextInt(6)
                number2 = randomNumberGenerator . nextInt(6)
                leftDice.setImageResource(diceArray[number])
                rightDice.setImageResource(diceArray[number2])

            }
        })
    }
}
