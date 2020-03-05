package com.example.prac1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    lateinit var diceImage : ImageView
    lateinit var diceImage2 : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener { rollDice() }
        diceImage= findViewById(R.id.dice_image)
        diceImage2= findViewById(R.id.dice_image2)
    }

    /*private fun rollDice(){
        val rollText: TextView = findViewById(R.id.roll_text)
        val randomInt = (1..6).random()
        rollText.text = randomInt.toString()
        Toast.makeText(this, "button clicked",
            Toast.LENGTH_SHORT).show()
    }*/

    private fun rollDice() {
        /*val resultText: TextView = findViewById(R.id.result_text)
        //If text is the default "hello World" set that text to 1
        if(resultText.text == "Hello World") {
            resultText.text = "1"
        } else {
            //Otherwise, increment the number up to 6
            //The text value in resultText.text is an instance of thd CharSenquence class;
            //it needs to be cunverted to a string object before it can be converted to an int.
            // var resultInt = result.text.toString().toInt()

            var resultInt = resultText.text.toString().toInt()
            if (resultInt < 6) {
                resultInt++
                resultText.text = resultInt.toString()
            }
        }*/


        //diceImage.setImageResource(drawableResource)
        diceImage.setImageResource(imagerand())
        diceImage2.setImageResource(imagerand())

        //val resultText: TextView = findViewById(R.id.result_text)
        //resultText.text = randomInt.toString()

    }

    private fun imagerand(): Int
    {
        val randomInt = (1..6).random()
        val diceImage: ImageView = findViewById(R.id.dice_image2)
        val drawableResource = when (randomInt) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        return drawableResource
    }
}
