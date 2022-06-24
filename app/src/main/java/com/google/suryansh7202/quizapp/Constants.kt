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
            R.drawable.ic_flag_belize,
            "Argentina","Fiji","Belize","Armenia",
            3
        )
        questionList.add(que5)


        val que6 = Question(
            6,"What country does this flag belong to?",
            R.drawable.ic_flag_benin,
            "Argentina","benin","Kuwait","Armenia",
            2
        )
        questionList.add(que6)


        val que7 = Question(
            7,"What country does this flag belong to?",
            R.drawable.ic_flag_bermudas,
            "Bermudas","Fiji","India","Germany",
            1
        )
        questionList.add(que7)



        val que8 = Question(
            8,"What country does this flag belong to?",
            R.drawable.ic_flag_germany,
            "Argentina","Fiji","New Zealand","Germany",
            3
        )
        questionList.add(que8)

        val que9 = Question(
            9,"What country does this flag belong to?",
            R.drawable.ic_flag_of_saint_vicent_and_the_grenadines,
            "Argentina","Fiji","New Zealand","Saint Vicent and the Grenadines",
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

        /////////////////////////////////////////////////////


        val que11 = Question(
            11,"What country does this flag belong to?",
            R.drawable.ic_flag_of_yemen,
            "Argentina","Yemen","New Zealand","Germany",
            2
        )
        questionList.add(que11)

        val que12 = Question(
            12,"What country does this flag belong to?",
            R.drawable.ic_flag_of_zimbabwe,
            "Argentina","Brazil","New Zealand","None of these",
            4
        )
        questionList.add(que12)

        val que13 = Question(
            13,"What country does this flag belong to?",
            R.drawable.ic_flag_of_brazil,
            "Argentina","Brazil","New Zealand","Germany",
            2
        )
        questionList.add(que13)

        val que14 = Question(
            14,"What country does this flag belong to?",
            R.drawable.ic_flag_of_vietnam,
            "Vietnam","Brazil","Pakistan","Germany",
            1
        )
        questionList.add(que14)

        val que15 = Question(
            15,"What country does this flag belong to?",
            R.drawable.ic_flag_of_venezuela,
            "Argentina","Brazil","Venezuela","Germany",
            3
        )
        questionList.add(que15)

        val que16 = Question(
            16,"What country does this flag belong to?",
            R.drawable.ic_flag_of_turkmenistan,
            "Argentina","turkmenistan","New Zealand","Germany",
            2
        )
        questionList.add(que16)

        val que17 = Question(
            17,"What country does this flag belong to?",
            R.drawable.ic_flag_of_united_states_of_america,
            "Argentina","United State of America","New Zealand","UK",
            2
        )
        questionList.add(que17)

        val que18 = Question(
            18,"What country does this flag belong to?",
            R.drawable.ic_flag_of_uganda,
            "Argentina","Uganda","New Zealand","Germany",
            2
        )
        questionList.add(que18)

        val que19 = Question(
            19,"What country does this flag belong to?",
            R.drawable.ic_flag_of_togo,
            "Argentina","Brazil","New Zealand","Togo",
            4
        )
        questionList.add(que19)

////////////////////////

        val que20 = Question(
            20,"What country does this flag belong to?",
            R.drawable.ic_flag_of_uzbekistan,
            "Uzbekistan","Brazil","New Zealand","Togo",
            1
        )
        questionList.add(que20)

        val que21 = Question(
            21,"What country does this flag belong to?",
            R.drawable.ic_flag_of_tunisia,
            "Argentina","Brazil","Tunisia","Togo",
            3
        )
        questionList.add(que21)


        val que22 = Question(
            22,"What country does this flag belong to?",
            R.drawable.ic_flag_of_thailand,
            "Argentina","Brazil","Thailand","Togo",
            3
        )
        questionList.add(que22)


        val que23 = Question(
            23,"What country does this flag belong to?",
            R.drawable.ic_flag_of_tonga,
            "Argentina","Brazil","New Zealand","Tongo",
            4
        )
        questionList.add(que23)


        val que24 = Question(
            24,"What country does this flag belong to?",
            R.drawable.ic_flag_of_sweden,
            "Argentina","Sweden","New Zealand","Togo",
            2
        )
        questionList.add(que24)


        val que25 = Question(
            25,"What country does this flag belong to?",
            R.drawable.ic_flag_of_timor_leste,
            "Argentina","Brazil","Timor Leste","Togo",
            3
        )
        questionList.add(que25)



        val que26 = Question(
            26,"What country does this flag belong to?",
            R.drawable.ic_flag_of_seychelles,
            "Argentina","Brazil","New Zealand","Seychelles",
            4
        )
        questionList.add(que26)



        val que27 = Question(
            27,"What country does this flag belong to?",
            R.drawable.ic_flag_of_sierra_leone,
            "Argentina","Brazil","New Zealand","Togo",
            4
        )
        questionList.add(que27)



        val que28 = Question(
            28,"What country does this flag belong to?",
            R.drawable.ic_flag_of_ecuador,
            "Argentina","ecuador","New Zealand","Seychelles",
            2
        )
        questionList.add(que28)



        val que29 = Question(
            29,"What country does this flag belong to?",
            R.drawable.ic_flag_of_bangladesh,
            "Argentina","Brazil","Bangladesh","Togo",
            3
        )
        questionList.add(que29)




        val que30 = Question(
            30,"What country does this flag belong to?",
            R.drawable.ic_flag_of_andorra,
            "Argentina","Brazil","New Zealand","Andorra",
            4
        )
        questionList.add(que30)



        val que31 = Question(
            31,"What country does this flag belong to?",
            R.drawable.ic_flag_of_angola,
            "Angola","Brazil","New Zealand","Togo",
            1
        )
        questionList.add(que31)



        val que32 = Question(
            32,"What country does this flag belong to?",
            R.drawable.ic_flag_of_bahamas,
            "Argentina","Bahamas","New Zealand","Togo",
            2
        )
        questionList.add(que32)


        val que33 = Question(
            33,"What country does this flag belong to?",
            R.drawable.ic_flag_of_bhutan,
            "Argentina","Brazil","New Zealand","Bhutan",
            4
        )
        questionList.add(que33)



        val que34 = Question(
            34,"What country does this flag belong to?",
            R.drawable.ic_flag_of_aruba,
            "Argentina","Aruba","New Zealand","Togo",
            2
        )
        questionList.add(que34)


        val que35 = Question(
            35,"What country does this flag belong to?",
            R.drawable.ic_flag_of_barbados,
            "Argentina","Brazil","Barbados","Togo",
            3
        )
        questionList.add(que35)


        val que36 = Question(
            36,"What country does this flag belong to?",
            R.drawable.ic_flag_of_botswana,
            "Argentina","Botswana","Christas Island","Togo",
            2
        )
        questionList.add(que36)


        val que37 = Question(
            37,"What country does this flag belong to?",
            R.drawable.ic_flag_of_brunei,
            "Argentina","Brazil","New Zealand","Brunei",
            4
        )
        questionList.add(que37)



        val que38 = Question(
            38,"What country does this flag belong to?",
            R.drawable.ic_flag_of_christmas_island,
            "Argentina","Brazil","Christas Island","Togo",
            3
        )
        questionList.add(que38)


        val que39 = Question(
            39,"What country does this flag belong to?",
            R.drawable.ic_flag_of_ecuador,
            "Argentina","Brazil","New Zealand","ecuador",
            4
        )
        questionList.add(que39)


        val que40 = Question(
            40,"What country does this flag belong to?",
            R.drawable.ic_flag_of_gibraltar,
            "Argentina","Gibraltar","New Zealand","Togo",
            2
        )
        questionList.add(que40)


        val que41 = Question(
            41,"What country does this flag belong to?",
            R.drawable.ic_flag_of_finland,
            "Argentina","finland","New Zealand","Togo",
            2
        )
        questionList.add(que41)


        val que42 = Question(
            42,"What country does this flag belong to?",
            R.drawable.ic_flag_of_colombia,
            "Argentina","Colombia","New Zealand","Togo",
            2
        )
        questionList.add(que42)


        val que43 = Question(
            43,"What country does this flag belong to?",
            R.drawable.ic_flag_of_cape_verde,
            "Argentina","Brazil","Cape Verde","Togo",
            3
        )
        questionList.add(que43)


        val que44 = Question(
            44,"What country does this flag belong to?",
            R.drawable.ic_flag_of_egypt,
            "Argentina","Egypt","New Zealand","Togo",
            2
        )
        questionList.add(que44)

////////////////////////////////



        val que45 = Question(
            45,"What country does this flag belong to?",
            R.drawable.ic_flag_of_american_samoa,
            "American-Samoa","finland","New Zealand","Togo",
            1
        )
        questionList.add(que45)

        val que46 = Question(
            46,"What country does this flag belong to?",
            R.drawable.ic_flag_of_china,
            "Argentina","China","New Zealand","Togo",
            2
        )
        questionList.add(que46)

        val que47 = Question(
            47,"What country does this flag belong to?",
            R.drawable.ic_flag_of_faroe_islands,
            "Argentina","finland","Faroe-Island","Togo",
            3
        )
        questionList.add(que47)


        val que48 = Question(
            48,"What country does this flag belong to?",
            R.drawable.ic_flag_of_gutemala,
            "Argentina","finland","New Zealand","Gutemala",
            4
        )
        questionList.add(que48)



        val que49 = Question(
            49,"What country does this flag belong to?",
            R.drawable.ic_flag_of_gabon,
            "Argentina","Gabon","New Zealand","Togo",
            2
        )
        questionList.add(que49)




        val que50 = Question(
            50,"What country does this flag belong to?",
            R.drawable.ic_flag_of_mali,
            "Argentina","finland","New Zealand","Mali",
            4
        )
        questionList.add(que50)





        val que51 = Question(
            51,"What country does this flag belong to?",
            R.drawable.ic_flag_of_greece,
            "Argentina","finland","greece","Togo",
            3
        )
        questionList.add(que51)

        val que52 = Question(
            52,"What country does this flag belong to?",
            R.drawable.ic_flag_of_vatican_city,
            "Argentina","Venezuela","New Zealand","Vatican city",
            4
        )
        questionList.add(que52)




        val que53 = Question(
            53,"What country does this flag belong to?",
            R.drawable.ic_flag_of_eritrea,
            "Argentina","Eritrea","New Zealand","Togo",
            2
        )
        questionList.add(que53)



        val que54 = Question(
            54,"What country does this flag belong to?",
            R.drawable.ic_flag_of_gunam,
            "Argentina","finland","Gunam","Togo",
            3
        )
        questionList.add(que54)


        val que55 = Question(
            55,"What country does this flag belong to?",
            R.drawable.ic_flag_of_pakistan,
            "Argentina","finland","New Zealand","Pakistan",
            4
        )
        questionList.add(que55)



        val que56 = Question(
            56,"What country does this flag belong to?",
            R.drawable.ic_flag_of_cote_dlvoire,
            "Argentina","Cote d'lvoire","New Zealand","Togo",
            2
        )
        questionList.add(que56)


        val que57 = Question(
            57,"What country does this flag belong to?",
            R.drawable.ic_flag_of_qatar,
            "Argentina","finland","quatar","Togo",
            3
        )
        questionList.add(que57)


        val que58 = Question(
            58,"What country does this flag belong to?",
            R.drawable.ic_flag_of_romania,
            "Romania","finland","New Zealand","Togo",
            1
        )
        questionList.add(que58)


        val que59 = Question(
            59,"What country does this flag belong to?",
            R.drawable.ic_flag_of_france,
            "Argentina","france","New Zealand","Togo",
            3
        )

        questionList.add(que59)


        val que60 = Question(
            60,"What country does this flag belong to?",
            R.drawable.ic_flag_of_us_virgin_islands,
            "US Virgin Island","finland","New Zealand","Togo",
            1
        )
        questionList.add(que60)


///////////////////////////////


        val que61 = Question(
            61,"What country does this flag belong to?",
            R.drawable.ic_flag_of_chile,
            "US Virgin Island","finland","Chile","Togo",
            3
        )
        questionList.add(que61)



        val que62 = Question(
            62,"What country does this flag belong to?",
            R.drawable.ic_flag_of_burundi,
            "US Virgin Island","finland","New Zealand","Burundi",
            4
        )
        questionList.add(que62)



        val que63 = Question(
            63,"What country does this flag belong to?",
            R.drawable.ic_flag_of_palau,
            "US Virgin Island","finland","Angola","Palau",
            4
        )
        questionList.add(que63)




        val que64 = Question(
            64,"What country does this flag belong to?",
            R.drawable.ic_flag_of_angola,
            "US Virgin Island","finland","Angola","Togo",
            3
        )
        questionList.add(que64)




        val que65 = Question(
            65,"What country does this flag belong to?",
            R.drawable.ic_flag_of_djibouti,
            "US Virgin Island","finland","New Zealand","Djibouti",
            4
        )
        questionList.add(que65)




        val que66 = Question(
            66,"What country does this flag belong to?",
            R.drawable.ic_flag_of_ukraine,
            "US Virgin Island","Eritrea","New Zealand","Ukraine",
            4
        )
        questionList.add(que66)




        val que67 = Question(
            67,"What country does this flag belong to?",
            R.drawable.ic_flag_of_ecuador,
            "Ecuador","finland","New Zealand","Togo",
            1
        )
        questionList.add(que67)


        val que68 = Question(
            68,"What country does this flag belong to?",
            R.drawable.ic_flag_of_turks_and_caicos_islands,
            "US Virgin Island","Gabon","Turks and Caicos Islands","Togo",
            3
        )
        questionList.add(que68)




        val que69 = Question(
            69,"What country does this flag belong to?",
            R.drawable.ic_flag_of_russian_federation,
            "US Virgin Island","finland","New Zealand","Russian_Federation",
            4
        )
        questionList.add(que69)




        val que70 = Question(
            70,"What country does this flag belong to?",
            R.drawable.ic_flag_of_uruguay,
            "Uruguay","finland","New Zealand","Togo",
            1
        )
        questionList.add(que70)



        val que71 = Question(
            71,"What country does this flag belong to?",
            R.drawable.ic_flag_of_zambia,
            "US Virgin Island","finland","Zambia","Togo",
            3
        )
        questionList.add(que71)


        val que72 = Question(
            72,"What country does this flag belong to?",
            R.drawable.ic_flag_of_trinidad_and_tobago,
            "US Virgin Island","finland","New Zealand","Trinidad and Tobago",
            4
        )
        questionList.add(que72)


        val que73 = Question(
            73,"What country does this flag belong to?",
            R.drawable.ic_flag_of_turkey,
            "US Virgin Island","Turkey","New Zealand","Togo",
            1
        )
        questionList.add(que73)



        val que74 = Question(
            74,"What country does this flag belong to?",
            R.drawable.ic_flag_of_vanuatu,
            "India","finland","New Zealand","Vanuatu",
            1
        )
        questionList.add(que74)




        val que75 = Question(
            75,"What country does this flag belong to?",
            R.drawable.ic_flag_of_thailand,
            "Timor-Leste","Thailand","New Zealand","Togo",
            2
        )
        questionList.add(que75)


        val que76 = Question(
            76,"What country does this flag belong to?",
            R.drawable.ic_flag_of_somalia,
            "UK","finland","New Zealand","Somalia",
            4
        )
        questionList.add(que76)


        val que77 = Question(
            77,"What country does this flag belong to?",
            R.drawable.ic_flag_of_tuvalu,
            "Tuvalu","finland","New Zealand","Togo",
            1
        )
        questionList.add(que77)


        val que78 = Question(
            78,"What country does this flag belong to?",
            R.drawable.ic_flag_of_afghanistan,
            "Pakistan","finland","Afganistan","India",
            4
        )
        questionList.add(que78)


        val que79 = Question(
            79,"What country does this flag belong to?",
            R.drawable.ic_flag_of_albania,
            "US Virgin Island","Albania","New Zealand","Togo",
            2
        )
        questionList.add(que79)


        val que80 = Question(
            80,"What country does this flag belong to?",
            R.drawable.ic_flag_of_armenia,
            "Armenia","finland","New Zealand","Togo",
            1
        )
        questionList.add(que80)

        val que81 = Question(
            81,"What country does this flag belong to?",
            R.drawable.ic_flag_austria,
            "US Virgin Island","Anustria","New Zealand","Togo",
            2
        )
        questionList.add(que81)

        val que82 = Question(
            82,"What country does this flag belong to?",
            R.drawable.ic_flag_of_azerbaijan,
            "US Virgin Island","finland","New Zealand","Azerbaijan",
            4
        )
        questionList.add(que82)


        val que83 = Question(
            83,"What country does this flag belong to?",
            R.drawable.ic_flag_of_bermuda,
            "Bermuda","finland","New Zealand","Togo",
            1
        )
        questionList.add(que83)



        val que84 = Question(
            84,"What country does this flag belong to?",
            R.drawable.ic_flag_of_bosnia,
            "US Virgin Island","finland","Bosnia","Togo",
            1
        )
        questionList.add(que84)


///////////////////////////

        val que85= Question(
            85,"What country does this flag belong to?",
            R.drawable.ic_flag_of_burkina_flso,
            "Argentina","Burkina-flso","India","Armenia",
            2
        )
        questionList.add(que85)

        val que86 = Question(
            86,"What country does this flag belong to?",
            R.drawable.ic_flag_of_bulgaria,
            "Argentina","Australia","Burkina-fiso","Bulgaria",
            4
        )
        questionList.add(que86)

        val que87 = Question(
            87,"What country does this flag belong to?",
            R.drawable.ic_flag_of_canada,
            "Argentina","Canada","India","Armenia",
2
        )
        questionList.add(que87)

        val que88 = Question(
            88,"What country does this flag belong to?",
            R.drawable.ic_flag_of_denmark,
            "Argentina","Denmark","Pakistan","Armenia",
            2
        )
        questionList.add(que88)

        val que89 = Question(
            89,"What country does this flag belong to?",
            R.drawable.ic_flag_of_dominica,
            "Argentina","Australia","None of these","Dominica",
            4
        )
        questionList.add(que89)



        val que90 = Question(
            90,"What country does this flag belong to?",
            R.drawable.ic_flag_of_dominica,
            "Argentina","Australia","None of these","Dominica",
            4
        )
        questionList.add(que90)





        val que91 = Question(
            91,"What country does this flag belong to?",
            R.drawable.ic_flag_of_niger,
            "Argentina","Rawanada","None of these","Niger",
            4
        )
        questionList.add(que91)





        val que92 = Question(
            92,"What country does this flag belong to?",
            R.drawable.ic_flag_of_peru,
            "Peru","Rawanada","None of these","Niger",
            1
        )
        questionList.add(que92)


        val que93 = Question(
            93,"What country does this flag belong to?",
            R.drawable.ic_flag_of_rwanada,
            "Peru","Rawanada","None of these","Niger",
            4
        )
        questionList.add(que93)


        val que94 = Question(
            94,"What country does this flag belong to?",
            R.drawable.ic_flag_of_singapore,
            "Peru","Singapore","None of these","Niger",
            4
        )
        questionList.add(que94)


        val que95 = Question(
            95,"What country does this flag belong to?",
            R.drawable.ic_flag_of_slovakia,
            "Peru","Singapore","Slovakia","Niger",
            4
        )
        questionList.add(que95)



        val que96 = Question(
            96,"What country does this flag belong to?",
            R.drawable.ic_flag_of_soloman_islands,
            "Peru","Singapore","Slovakia","Soloman-islands",
            4
        )
        questionList.add(que96)

        val que97 = Question(
            97,"What country does this flag belong to?",
            R.drawable.ic_flag_of_sudan,
            "Peru","Singapore","Slovakia","Sudan",
            4
        )
        questionList.add(que97)

        val que98 = Question(
            98,"What country does this flag belong to?",
            R.drawable.ic_flag_of_suriname,
            "Peru","Suriname","Slovakia","Sudan",
            2
        )
        questionList.add(que98)

        val que99 = Question(
            99,"What country does this flag belong to?",
            R.drawable.ic_flag_of_syria,
            "Syria","Suriname","Slovakia","Sudan",
            1
        )
        questionList.add(que99)





        val que100 = Question(
            100,"What country does this flag belong to?",
            R.drawable.ic_flag_of_taiwan,
            "Syria","Suriname","Taiwan","Sudan",
            3
        )
        questionList.add(que100)







        return questionList
    }
}