package dev.pascaline.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class FirstPictureActivity : AppCompatActivity() {
    lateinit var btnBack:Button
    lateinit var btnNext:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        btnBack= findViewById(R.id.btnBack)
        btnNext= findViewById(R.id.btnNext)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first_picture)
        btnBack.setOnClickListener {
            val intent=Intent(this,MainActivity::class.java)
        }
        btnNext.setOnClickListener {
            val intent=Intent(this,SecondPictureActivity::class.java)
        }

    }
}