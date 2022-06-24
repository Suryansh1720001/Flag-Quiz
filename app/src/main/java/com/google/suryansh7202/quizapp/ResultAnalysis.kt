package com.google.suryansh7202.quizapp

import android.annotation.SuppressLint
import android.content.Context
import android.os.Build
import android.os.Bundle
import android.os.VibrationEffect
import android.os.Vibrator
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment

class ResultAnalysis : AppCompatActivity() {
    private var mCurrentPosition: Int =1
    private var mQuestionsList: ArrayList<Question>? =null
    private var progressBar: ProgressBar? =null
    private var tvProgress: TextView?= null
    private var ivImage : ImageView?= null



    val mquestionSelectedOptions =  ArrayList<Int>()

        private var tv_AcutalCorrectAnswer: TextView? = null
    private var tv_YourAnswer: TextView? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result_analysis)
        mQuestionsList = Constants.getQuestions()

        val question: Question =mQuestionsList!![mCurrentPosition - 1]

        val questionSelectedOptions =  intent.getSerializableExtra("QuestionsExtra") as ArrayList<Int>?

        progressBar =findViewById(R.id.ResultprogressBar)
        tvProgress = findViewById(R.id.tv_Resultprogress)
        mquestionSelectedOptions.addAll(questionSelectedOptions!!)


        ivImage = findViewById(R.id.iv_image_analysis)
        val next = findViewById<ImageView>(R.id.btn_next)
        val previous = findViewById<ImageView>(R.id.btn_previous)
//        next.setImageResource(next)


        tv_AcutalCorrectAnswer = findViewById(R.id.tv_AcutalCorrectAnswer)
        tv_YourAnswer = findViewById(R.id.tv_YourAnswer)




        setQuestion()

        previous.setOnClickListener {
            val vibrator = getSystemService(Context.VIBRATOR_SERVICE) as Vibrator
                if (vibrator.hasVibrator()) { // Vibrator availability checking
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                        vibrator.vibrate(VibrationEffect.createOneShot(30, VibrationEffect.DEFAULT_AMPLITUDE)) // New vibrate method for API Level 26 or higher
                    } else {
                        vibrator.vibrate(500) // Vibrate method for below API Level 26
                    }
                }
           previous.alpha =1f
            previous.translationY = 8f;
            previous.animate().alpha(1f).translationYBy(-5f).duration = 50

            mCurrentPosition--
            if(mCurrentPosition==1){

                previous?.isEnabled = false
                next?.isEnabled = true
            }else {
                next?.isEnabled = true

            }

            setQuestion()
        }

            next.setOnClickListener {
                val vibrator = getSystemService(Context.VIBRATOR_SERVICE) as Vibrator
                if (vibrator.hasVibrator()) { // Vibrator availability checking
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                        vibrator.vibrate(VibrationEffect.createOneShot(30, VibrationEffect.DEFAULT_AMPLITUDE)) // New vibrate method for API Level 26 or higher
                    } else {
                        vibrator.vibrate(500) // Vibrate method for below API Level 26
                    }
                }
                next.alpha =1f
                next.translationY = 8f;
                next.animate().alpha(1f).translationYBy(-5f).duration = 50
                mCurrentPosition++
                if(mCurrentPosition==mquestionSelectedOptions.size){

                    next?.isEnabled = false
                    previous?.isEnabled = true
                }else{
                    previous?.isEnabled = true

                }
                setQuestion()
            }


    }



    private fun setQuestion() {

     val question: Question = mQuestionsList!![mCurrentPosition - 1]

     ivImage?.setImageResource(question.image)

        progressBar?.progress = mCurrentPosition
        tvProgress?.text = "$mCurrentPosition/${progressBar?.max}"

     yourans()
     correctans()
 }



    @SuppressLint("SetTextI18n")
    private fun yourans(){
        val question: Question =mQuestionsList!![mCurrentPosition - 1]

        if(mquestionSelectedOptions[mCurrentPosition-1] == question.correctAnswer ){
            setOptions(question.correctAnswer)
            tv_YourAnswer?.background = ContextCompat.getDrawable(
                this,R.drawable.correct_option_border_bg
            )
        }else if (mquestionSelectedOptions[mCurrentPosition-1] ==0 ){
            tv_YourAnswer?.text = "Not Selected"
            tv_YourAnswer?.background = ContextCompat.getDrawable(
                this,R.drawable.selected_option_border_bg
            )

        }

        else{
            setOptions(mquestionSelectedOptions[mCurrentPosition-1])

            tv_YourAnswer?.background = ContextCompat.getDrawable(
                this,R.drawable.wrong_option_border_bg
            )
        }
    }






    private fun correctans(){
        val question: Question =mQuestionsList!![mCurrentPosition - 1]

        when(question!!.correctAnswer){
            1 -> {
                tv_AcutalCorrectAnswer?.text = question.optionOne

            }
            2 -> {
                tv_AcutalCorrectAnswer?.text = question.optionTwo
            }
            3 -> {
                tv_AcutalCorrectAnswer?.text = question.optionThree
            }
            else ->{
                tv_AcutalCorrectAnswer?.text = question.optionFour
            }
        }
        tv_AcutalCorrectAnswer?.background = ContextCompat.getDrawable(
            this,R.drawable.correct_option_border_bg
        )
    }








 private fun setOptions(option : Int){
     val question: Question =mQuestionsList!![mCurrentPosition - 1]

     when(option){
                1 -> {
                    tv_YourAnswer?.text = question.optionOne

                }
                2 -> {
                    tv_YourAnswer?.text = question.optionTwo
                }
                3 -> {
                    tv_YourAnswer?.text = question.optionThree
                }
                else ->{
                    tv_YourAnswer?.text = question.optionFour
                }
            }

    }
}









