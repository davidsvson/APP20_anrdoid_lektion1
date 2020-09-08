package com.example.lektion1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    val TAG = MainActivity::class.java.simpleName

    lateinit var nameEditText : EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        nameEditText = findViewById(R.id.nameEditText)

        val button = findViewById<Button>(R.id.button)

        button.text = "Press!"


        Log.d(TAG,"Hej koden körs")

    }

    fun buttonPressed(view : View) {
        val name = nameEditText.text.toString()

        Log.d(TAG, "Hej $name!")
    }



}