package com.example.kotlinlesson1_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import com.example.kotlinlesson1_1.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val b = findViewById<Button>(R.id.but)
        b.setOnClickListener(object : View.OnClickListener{
            override fun onClick(v: View?) {}
        })

        val personOne = Student("Dmitry",2101,2)
        val personSecond = personOne.copy()
        Log.d("mylogs","$personSecond")



        for( i in 0..10) {

            Log.d("mylogs","$i")
        }

        for( i in 10 downTo 0) {

            Log.d("mylogs","$i")
        }


        for( i in 0..10 step 2) {

            Log.d("mylogs","$i")
        }

    }




}