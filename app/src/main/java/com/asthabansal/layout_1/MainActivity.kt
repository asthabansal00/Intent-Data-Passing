package com.asthabansal.layout_1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    var name=""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        intent?.let{
            name=it.getStringExtra("name")?:""
            System.out.println("name $name")
        }

        var intent=Intent(this,MainActivity2::class.java)
        intent.putExtra("name","ASTHA")
        startActivity(intent)
    }

    override fun onStart() {
        super.onStart()
        Toast.makeText(this,"On start method",Toast.LENGTH_LONG).show()
    }

}