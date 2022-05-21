package dev.pascaline.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class FourthPictureActivity : AppCompatActivity() {
    lateinit var btnBack4: Button
    lateinit var btnNext4: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        btnBack4= findViewById(R.id.btnBack4)
        btnNext4= findViewById(R.id.btnNext4)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fourth_picture)
        btnBack4.setOnClickListener {
            val intent= Intent(this,ThirdPictureActivity::class.java)
        }
        btnNext4.setOnClickListener {
            val intent= Intent(this,FifthPictureActivity::class.java)
        }
    }
}