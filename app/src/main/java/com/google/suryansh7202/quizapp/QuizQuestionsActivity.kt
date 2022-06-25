package com.google.suryansh7202.quizapp

import android.annotation.SuppressLint
import android.content.Context
import android.graphics.Color
import android.graphics.Typeface
import android.os.*
import android.view.View
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import java.sql.Time
import java.util.*
import java.util.concurrent.TimeUnit
import kotlin.collections.ArrayList
import android.content.Intent as Intent1


class QuizQuestionsActivity : AppCompatActivity(),View.OnClickListener{

   private val questionSelectedOptions= ArrayList<Int>()

    private var mUserName: String? =null
    private var mCorrectAnswers: Int = 0
    private var mCurrentPosition: Int =1
    private var mQuestionsList: ArrayList<Question>? =null
    private var mSelectedOptionPosition: Int =0

    private var progressBar: ProgressBar? =null
    private var tvProgress: TextView?= null
    private var tvQuestion: TextView?= null
    private var ivImage : ImageView?= null

    private var tvOptionOne: TextView? = null
    private var tvOptionTwo: TextView? = null
    private var tvOptionThree: TextView? = null
    private var tvOptionFour: TextView? = null
    private var btnSubmit: Button?= null


    override fun onCreate(savedInstanceState: Bundle?) {
        mUserName = intent.getStringExtra(Constants.USER_NAME)

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz_questions)


        // time remaining

        TimeRemaning(findViewById(R.id.tv_timecount))


        progressBar =findViewById(R.id.progressBar)
        tvProgress = findViewById(R.id.tv_progress)
        tvQuestion = findViewById(R.id.tv_question)
        ivImage = findViewById(R.id.iv_image)
        tvOptionOne = findViewById(R.id.tv_option_one)
        tvOptionTwo = findViewById(R.id.tv_option_two)
        tvOptionThree = findViewById(R.id.tv_option_three)
        tvOptionFour = findViewById(R.id.tv_option_four)
        btnSubmit = findViewById(R.id.btn_submit)
        mQuestionsList = Constants.getQuestions()

        setQuestion()
        defaultOptionsView()

    }


    private fun TimeRemaning(mTextFieldsec: TextView) {
        object : CountDownTimer(1800000, 1000) {
            @SuppressLint("SetTextI18n")
            override fun onTick(millisUntilFinished: Long) {
                // TODO do this later in minutes and seconds both

//                if(mTextFieldsec.text == 5.toString() ){
//                    mTextFieldsec.setTextColor(Color.parseColor("#bdbdbd"));
//                }

//                val sDuration = String.format(Locale.ENGLISH,"%02d : %02d",
//                    TimeUnit.MILLISECONDS.toMinutes(1),
//                    TimeUnit.MILLISECONDS.toSeconds(1),
//                    TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(1)))

                mTextFieldsec.text = "Time Remaining (sec) : " +(millisUntilFinished / (1000))

            }

            override fun onFinish() {
                timeFinish()
            }

        }.start()

    }

    private fun timeFinish(){
        val intent = Intent1(this,ResultActivity::class.java)
        intent.putExtra(Constants.USER_NAME,mUserName)
        intent.putExtra(Constants.CORRECT_ANSWER,mCorrectAnswers)
        intent.putExtra(Constants.TOTAL_QUESTIONS,mQuestionsList?.size)
        // array list
        intent.putParcelableArrayListExtra(
            "QuestionsExtra",
            questionSelectedOptions as ArrayList<out Parcelable?>?
        )
        startActivity(intent)
        finish()
    }

    private fun setQuestion() {

        defaultOptionsView()
        val question: Question =mQuestionsList!![mCurrentPosition - 1]

        ivImage?.setImageResource(question.image)
        progressBar?.progress = mCurrentPosition
        tvProgress?.text = "$mCurrentPosition/${progressBar?.max}"
        tvQuestion?.text = question.question
        tvOptionOne?.text = question.optionOne
        tvOptionTwo?.text = question.optionTwo
        tvOptionThree?.text = question.optionThree
        tvOptionFour?.text = question.optionFour

        tvOptionOne?.setOnClickListener(this)
        tvOptionTwo?.setOnClickListener(this)
        tvOptionThree?.setOnClickListener(this)
        tvOptionFour?.setOnClickListener(this)
        btnSubmit?.setOnClickListener(this)

        tvOptionOne?.isEnabled = true
        tvOptionTwo?.isEnabled = true
        tvOptionThree?.isEnabled = true
        tvOptionFour?.isEnabled = true

        if(mCurrentPosition-1== mQuestionsList!!.size){
            btnSubmit?.text = "FINISH"
        }else{
            btnSubmit?.text = "SUBMIT"
        }


    }

    private fun defaultOptionsView(){

        val options= ArrayList<TextView>()
        tvOptionOne?.let {
            options.add(0,it)
        }
        tvOptionTwo?.let {
            options.add(1,it)
        }
        tvOptionThree?.let {
            options.add(2,it)
        }
        tvOptionFour?.let {
            options.add(3,it)
        }

        for(option in options){
            option.setTextColor(Color.parseColor("#7A8089"))
            option.typeface=Typeface.DEFAULT
            option.background = ContextCompat.getDrawable(
                this,
                R.drawable.default_option_border_bg

            )
        }

    }


    private fun selectedOptionView(tv:TextView,selectedOptionNum:Int){
        defaultOptionsView()
        mSelectedOptionPosition = selectedOptionNum
        tv.setTextColor(Color.parseColor("#363A43"))
        tv.setTypeface(tv.typeface,Typeface.BOLD)
        tv.background= ContextCompat.getDrawable(
            this,
            R.drawable.selected_option_border_bg

        )

    }
    @SuppressLint("SetTextI18n")
    override fun onClick(view: View?) {

    when(view?.id) {
        R.id.tv_option_one -> {
            tvOptionOne?.let {
                selectedOptionView(it, 1)
            }
        }
        R.id.tv_option_two -> {
            tvOptionTwo?.let {
                selectedOptionView(it, 2)
            }
        }
        R.id.tv_option_three -> {
            tvOptionThree?.let {
                selectedOptionView(it, 3)
            }
        }
        R.id.tv_option_four -> {
            tvOptionFour?.let {
                selectedOptionView(it, 4)
            }
        }


        R.id.btn_submit -> {
            if(mSelectedOptionPosition==0 && btnSubmit?.text == "SUBMIT"){
                questionSelectedOptions.add(mSelectedOptionPosition)
            }

            if(mSelectedOptionPosition==0 && (btnSubmit?.text == "FINISH" || btnSubmit?.text == "GO TO NEXT QUESTION" || btnSubmit?.text == "SUBMIT")){

                val vibrator = getSystemService(Context.VIBRATOR_SERVICE) as Vibrator
                if (vibrator.hasVibrator()) { // Vibrator availability checking
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                        vibrator.vibrate(VibrationEffect.createOneShot(30, VibrationEffect.DEFAULT_AMPLITUDE)) // New vibrate method for API Level 26 or higher
                    } else {
                        vibrator.vibrate(500) // Vibrate method for below API Level 26
                    }
                }

            }



            if (mSelectedOptionPosition == 0) {
                mCurrentPosition++


                when {
                    mCurrentPosition <= mQuestionsList!!.size -> {

                        setQuestion()
                    }
                    else ->{
                       val intent = Intent1(this,ResultActivity::class.java)
                        intent.putExtra(Constants.USER_NAME,mUserName)
                        intent.putExtra(Constants.CORRECT_ANSWER,mCorrectAnswers)
                        intent.putExtra(Constants.TOTAL_QUESTIONS,mQuestionsList?.size)
                        // array list
                        intent.putParcelableArrayListExtra(
                            "QuestionsExtra",
                            questionSelectedOptions as ArrayList<out Parcelable?>?
                        )
                        startActivity(intent)
                        finish()
                    }
                }

            } else {
                val question = mQuestionsList?.get(mCurrentPosition - 1)

                if (question!!.correctAnswer != mSelectedOptionPosition) {
                    answerView(mSelectedOptionPosition, R.drawable.wrong_option_border_bg)

                }else{
                    mCorrectAnswers++
                }

                answerView(question.correctAnswer, R.drawable.correct_option_border_bg)
                tvOptionOne?.isEnabled = false
                tvOptionTwo?.isEnabled = false
                tvOptionThree?.isEnabled = false
                tvOptionFour?.isEnabled = false
                questionSelectedOptions.add(mSelectedOptionPosition)
                if(mCurrentPosition == mQuestionsList!!.size){
                    btnSubmit?.text = "FINISH"
                }else{
                    btnSubmit?.text = "GO TO NEXT QUESTION"
                }
                mSelectedOptionPosition =0
            }

        }
    }
    }


    private fun answerView(answer:Int,drawableView: Int){
        when(answer){
            1 -> {
                tvOptionOne?.background = ContextCompat.getDrawable(
                    this,drawableView
                )
            }
            2 -> {
                tvOptionTwo?.background = ContextCompat.getDrawable(
                    this,drawableView
                )
            }
            3 -> {
                tvOptionThree?.background = ContextCompat.getDrawable(
                    this,drawableView
                )
            }
            4 -> {
                tvOptionFour?.background = ContextCompat.getDrawable(
                    this,drawableView
                )
            }


        }
    }



    }

