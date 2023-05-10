package com.example.finalproject2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onFabClick(view: View){
        //Toast.makeText(this, "FAB clicked", Toast.LENGTH_LONG).show()
        val intent = Intent(this,MainActivity2::class.java)
        startActivity(intent)
    }

}