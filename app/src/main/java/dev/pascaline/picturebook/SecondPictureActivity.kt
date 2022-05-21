package dev.pascaline.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SecondPictureActivity : AppCompatActivity() {
    lateinit var btnBack2: Button
    lateinit var btnNext2: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second_picture)
        btnBack2= findViewById(R.id.btnBack2)
        btnNext2= findViewById(R.id.btnNext2)
        btnBack2.setOnClickListener {
            val intent= Intent(this,FirstPictureActivity::class.java)
            startActivity(intent)
        }
        btnNext2.setOnClickListener {
            val intent= Intent(this,ThirdPictureActivity::class.java)
            startActivity(intent)
        }
    }
}