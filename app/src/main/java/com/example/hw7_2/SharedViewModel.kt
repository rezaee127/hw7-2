package com.example.hw7_2

import Question
import androidx.lifecycle.ViewModel

class SharedViewModel : ViewModel() {
    var listOfQuastions = ArrayList<Question>()
    var listOfAnswer=ArrayList<Int>()
    var count=0
    var cheatNumber=0


    init{
        setTestData()
    }


    fun setTestData() {

        val q1 = Question(1, "Question 1 :    1+2=3", true,  false)
        val q2 = Question(2, "Question 2 :    2*8=120",  false, false)
        val q3 = Question(3, "Question 3 :    14*7=1000",  false, false)
        val q4 = Question(4, "Question 4 :    12*12=144", true,  false)
        val q5 = Question(5, "Question 5 :    1+6=7", true,  false)
        val q6 = Question(6, "Question 6 :    5-2=4",  false, false)
        val q7 = Question(7, "Question 7 :    1/2=5",  false, false)
        val q8 = Question(8, "Question 8 :    2*3=6",  true,  false)
        val q9 = Question(9, "Question 9 :    6/3=1",  false,  false)
        val q10 = Question(10, "Question 10 :    1-5=10",  false, false)

        listOfQuastions = arrayListOf(q1, q2, q3, q4, q5, q6, q7, q8, q9, q10)

    }
}