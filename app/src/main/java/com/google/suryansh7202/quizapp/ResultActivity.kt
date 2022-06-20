package com.google.suryansh7202.quizapp

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView


class ResultActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
        val iv_info = findViewById<ImageView>(R.id.iv_info)
        val tvName = findViewById<TextView>(R.id.tv_name)
        val tvScore = findViewById<TextView>(R.id.tv_score)
        val btnFinish = findViewById<Button>(R.id.btn_finish)
        btnFinish.alpha =0f
       btnFinish.translationY = 50f;
        btnFinish.animate().alpha(1f).translationYBy(-50f).duration = 1500

        iv_info.alpha = 0f;
        iv_info.translationY = 50f;
        iv_info.animate().alpha(1f).translationYBy(-50f).duration = 1500
      tvName.text = intent.getStringExtra(Constants.USER_NAME)
        val CorrectAns = intent.getIntExtra(Constants.CORRECT_ANSWER,0)
        val TotalQuestion = intent.getIntExtra(Constants.TOTAL_QUESTIONS,0)

        tvScore.text = "Your Score is ${CorrectAns} out of ${TotalQuestion}."

        btnFinish.setOnClickListener {

           startActivity(Intent(this,MainActivity::class.java))
        }


        iv_info.setOnClickListener{

            val url = "https://github.com/Suryansh1720001/Quiz-Application"
            val i = Intent(Intent.ACTION_VIEW)
            i.data = Uri.parse(url)
            startActivity(i)

        }

    }
}
