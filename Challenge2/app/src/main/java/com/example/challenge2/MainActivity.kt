package com.example.challenge2

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    lateinit var button:Button
    lateinit var iv1:ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //associate the button and iv1 variables to the layout elements
        button = findViewById(R.id.roll)
        iv1=findViewById(R.id.imageView)

    }
    // onclik method associated with the button
    fun onclick(v:View) {
      // call the random method so that it generates random numbers from 0 to 6 and adds 1 for the case in which the number falls 0
        var random1=Random
        var value = 1 + random1.nextInt(6);

        // when conditional is used to change the image associated to imagenview by the given image corresponding to the number
        when(value) {

            // the when conditional is used to change the image associated to imagenview by the given image corresponding to the number
             1-> iv1!!.setImageResource(R.drawable.dice_1)
             2-> iv1!!.setImageResource(R.drawable.dice_2)
             3-> iv1!!.setImageResource(R.drawable.dice_3)
             4-> iv1!!.setImageResource(R.drawable.dice_4)
             5-> iv1!!.setImageResource(R.drawable.dice_5)
             6-> iv1!!.setImageResource(R.drawable.dice_6)
        }
    }
}