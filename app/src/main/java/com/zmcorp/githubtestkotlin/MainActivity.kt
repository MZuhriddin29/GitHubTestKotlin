package com.zmcorp.githubtestkotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initView()
    }
    fun initView(){
        var buttonm = findViewById<Button>(R.id.button)
        buttonm.setOnClickListener(View.OnClickListener { openSecondActivity() })
    }
    fun openSecondActivity(){
        val intentz = Intent(this, SecondActivity::class.java)
        startActivity(intentz)
    }
}