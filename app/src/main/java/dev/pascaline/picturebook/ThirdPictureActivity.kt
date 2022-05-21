package dev.pascaline.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ThirdPictureActivity : AppCompatActivity() {
    lateinit var btnBack3: Button
    lateinit var btnNext3: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        btnBack3= findViewById(R.id.btnBack3)
        btnNext3= findViewById(R.id.btnNext3)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third_picture)
        btnBack3.setOnClickListener {
            val intent= Intent(this,SecondPictureActivity::class.java)
        }
        btnNext3.setOnClickListener {
            val intent= Intent(this,FourthPictureActivity::class.java)
        }
    }
}