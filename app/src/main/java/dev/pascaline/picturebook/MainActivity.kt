package dev.pascaline.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var btnStart:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnStart=findViewById(R.id.btnStart)
        btnStart.setOnClickListener {
            val intent=Intent(this,FirstPictureActivity::class.java)
            startActivity(intent)
        }
    }
}