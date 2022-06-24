package com.google.suryansh7202.quizapp

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Vibrator
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnStart: Button = findViewById(R.id.btnStart)
        val etname: EditText = findViewById(R.id.etname)
        val tvAppName: TextView = findViewById(R.id.tvAppName)

        tvAppName.alpha = 0f;
        tvAppName.translationY = 50f;
        tvAppName.animate().alpha(1f).translationYBy(-50f).duration = 1500

        btnStart.setOnClickListener {
            if(etname.text.isEmpty()){
                Toast.makeText(this,"Please enter your name!" ,Toast.LENGTH_LONG).show()
            }else{
                val intent = Intent(this,QuizQuestionsActivity::class.java)
                intent.putExtra(Constants.USER_NAME,etname.text.toString())
                startActivity(intent)
                finish()
            }
        }
    }
}