package com.google.suryansh7202.quizapp

object Constants {

    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANSWER:String = "correct_answer"
    const val QUESTION_CORRECT_OPTION: String = "question_correct_answer"



    fun getQuestions():ArrayList<Question>{
        val questionList = ArrayList<Question>()

        val que1 = Question(
            1,"What country does this flag belong to?",
            R.drawable.ic_flag_of_argentina,
            "Argentina","Austrialia","India","None of these",
        1
        )
        questionList.add(que1)

        val que2 = Question(
            2,"What country does this flag belong to?",
            R.drawable.ic_flag_of_india,
            "Argentina","Austrialia","India","Armenia",
            3
        )
        questionList.add(que2)

        val que3 = Question(
            3,"What country does this flag belong to?",
            R.drawable.ic_flag_of_belgium,
            "Argentina","Austrialia","India","Belgium",
            4
        )
        questionList.add(que3)



        val que4 = Question(
            4,"What country does this flag belong to?",
            R.drawable.ic_flag_of_australia,
            "Argentina","Austrialia","India","Armenia",
            2
        )
        questionList.add(que4)



        val que5 = Question(
            5,"What country does this flag belong to?",
            R.drawable.ic_flag_of_fiji,
            "Argentina","Fiji","India","Armenia",
            2
        )
        questionList.add(que5)


        val que6 = Question(
            6,"What country does this flag belong to?",
            R.drawable.ic_flag_of_kuwait,
            "Argentina","Fiji","Kuwait","Armenia",
            3
        )
        questionList.add(que6)


        val que7 = Question(
            7,"What country does this flag belong to?",
            R.drawable.ic_flag_of_germany,
            "Argentina","Fiji","India","Germany",
            4
        )
        questionList.add(que7)



        val que8 = Question(
            8,"What country does this flag belong to?",
            R.drawable.ic_flag_of_new_zealand,
            "Argentina","Fiji","New Zealand","Germany",
            3
        )
        questionList.add(que8)

        val que9 = Question(
            9,"What country does this flag belong to?",
            R.drawable.ic_flag_of_denmark,
            "Argentina","Fiji","New Zealand","Denmark",
            4
        )
        questionList.add(que9)


        val que10 = Question(
            10,"What country does this flag belong to?",
            R.drawable.ic_flag_of_brazil,
            "Argentina","Brazil","New Zealand","Germany",
            2
        )
        questionList.add(que10)


        return questionList
    }
}