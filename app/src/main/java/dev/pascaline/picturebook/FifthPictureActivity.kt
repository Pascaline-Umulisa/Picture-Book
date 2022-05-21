package dev.pascaline.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class FifthPictureActivity : AppCompatActivity() {
    lateinit var btnBack5: Button
    lateinit var btnNext5: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        btnBack5= findViewById(R.id.btnBack5)
        btnNext5= findViewById(R.id.btnNext5)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fifth_picture)
        btnBack5.setOnClickListener {
            val intent= Intent(this,FourthPictureActivity::class.java)
        }
        btnNext5.setOnClickListener {
            val intent= Intent(this,MainActivity::class.java)
        }
    }
}