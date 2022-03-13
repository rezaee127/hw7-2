package com.example.hw7_2

import Question
import androidx.lifecycle.ViewModel

class SharedViewModel : ViewModel() {
    var listOfQuastions = ArrayList<Question>()

    init{
        setTestData()
    }


    fun setTestData() {

        val q1 = Question(1, "1+2=3", answer = true, isCheat = false)
        val q2 = Question(2, "2*8=120", answer = false, isCheat = false)
        val q3 = Question(3, "14*7=1000", answer = false, isCheat = false)
        val q4 = Question(4, "12*12=144", answer = true, isCheat = false)
        val q5 = Question(5, "1+6=7", answer = true, isCheat = false)
        val q6 = Question(6, "5-2=4", answer = false, isCheat = false)
        val q7 = Question(7, "1/2=5", answer = false, isCheat = false)
        val q8 = Question(8, "2*3=6", answer = true, isCheat = false)
        val q9 = Question(9, "6/3=1", answer = false, isCheat = false)
        val q10 = Question(10, "1-5=10", answer = false, isCheat = false)

        listOfQuastions = arrayListOf(q1, q2, q3, q5, q5, q6, q7, q8, q9, q10)

    }
}