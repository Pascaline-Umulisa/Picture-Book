package dev.pascaline.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ThirdPictureActivity : AppCompatActivity() {
    lateinit var btnBack3: Button
    lateinit var btnNext3: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third_picture)
        btnBack3= findViewById(R.id.btnBack3)
        btnNext3= findViewById(R.id.btnNext3)

        btnBack3.setOnClickListener {
            val intent= Intent(this,SecondPictureActivity::class.java)
            startActivity(intent)
        }
        btnNext3.setOnClickListener {
            val intent= Intent(this,FourthPictureActivity::class.java)
            startActivity(intent)
        }
    }
}