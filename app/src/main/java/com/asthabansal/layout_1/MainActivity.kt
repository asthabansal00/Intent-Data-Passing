package com.asthabansal.layout_1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    var Full_Name:TextView?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Full_Name=findViewById(R.id.etname)

        /*intent?.let{
            Full_Name=it.getStringExtra("name")?:""
            System.out.println("Full_Name $Full_Name")
        }*/

        /*var intent=Intent(this,MainActivity2::class.java)
        intent.putExtra("Full_Name","ASTHA")
        startActivity(intent)*/
    }

    override fun onStart() {
        super.onStart()
        Toast.makeText(this,"On start method",Toast.LENGTH_LONG).show()
    }

}