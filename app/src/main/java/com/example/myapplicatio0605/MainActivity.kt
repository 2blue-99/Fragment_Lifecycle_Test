package com.example.myapplicatio0605

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.e("TAG", "@@@@@ onCreate: ${MainActivity2().gap}", )

        findViewById<Button>(R.id.button).setOnClickListener {
            supportFragmentManager.beginTransaction().add(R.id.linear, BlankFragment()).commit()
        }

        findViewById<Button>(R.id.button2).setOnClickListener {
            supportFragmentManager.beginTransaction().add(R.id.linear, SecondFragment()).commit()
        }

        findViewById<Button>(R.id.button3).setOnClickListener {
            supportFragmentManager.beginTransaction().replace(R.id.linear, ThirdFragment()).commit()
        }

    }

}