package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import org.w3c.dom.Text
import java.util.*

class MainActivity : AppCompatActivity() {
    private var points = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        pickRandomNumbers()
    }

    fun leftButtonClick(view: View) {
       val leftButton = findViewById<Button>(R.id.left)
        val rightButton = findViewById<Button>(R.id.right)
       val leftNum: Int = leftButton.text.toString().toInt()
        val rightNum: Int = rightButton.text.toString().toInt()
        if (leftNum > rightNum) {
            // you win
            points ++
            Toast.makeText(this,"Nice!", Toast.LENGTH_SHORT).show()
        } else {
            //you lose!
            points --
            Toast.makeText(this,"FUCK!", Toast.LENGTH_SHORT).show()
        }
        findViewById<TextView>(R.id.points).text = "Points: $points"
        pickRandomNumbers()
    }

    fun rightButtonClick(view: View) {

        val leftButton = findViewById<Button>(R.id.left)
        val rightButton = findViewById<Button>(R.id.right)
        val leftNum: Int = leftButton.text.toString().toInt()
        val rightNum: Int = rightButton.text.toString().toInt()
        if (rightNum > leftNum) {
            // you win!
            points ++
        } else {
            //you lose!
            points --
        }
        findViewById<TextView>(R.id.points).text = "Points: $points"
        pickRandomNumbers()

    }

    fun pickRandomNumbers() {
        val leftButton = findViewById<Button>(R.id.left)
        val rightButton = findViewById<Button>(R.id.right)

        val r = Random()
        val num1 = r.nextInt(10)
        leftButton.text = "$num1"

        val num2 = r.nextInt(10)
        rightButton.text = "$num2"
    }
}