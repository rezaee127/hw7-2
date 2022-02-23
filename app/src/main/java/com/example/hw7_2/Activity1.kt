package com.example.hw7_2

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.hw7_2.databinding.Activity1Binding

var count=0
var answerNumber=0
var listOfCheats=ArrayList<Int>()
class Activity1 : AppCompatActivity() {
    private lateinit var binding:Activity1Binding

    private val listOfStrings= arrayListOf("1+2=3","2*8=120","14*7=1000","12*12=144","1+6=7"
        ,"5-2=4","1/2=5","2*3=6","6/3=1","1-5=10")
    private val listOfAnswers= arrayListOf("True","False","False","True","True","False",
        "False","True","False","False")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_1)

        binding = Activity1Binding.inflate(layoutInflater)
        setContentView(binding.root)


        count= answerNumber
        answer()


        binding.cheat.setOnClickListener {
            val intent=Intent(this,Activity2::class.java)
            intent.putExtra("Answer",listOfAnswers[count])
            startActivity(intent)
            answerNumber=count
            listOfCheats.add(answerNumber)
        }


        binding.next.setOnClickListener {
            count++
            answer()
        }

        binding.prev.setOnClickListener {
            count--
            answer()
        }




    }



    @SuppressLint("SetTextI18n")
    private fun answer(){

        if (count==0){
            binding.prev.isClickable=false
            binding.textView.text="Question ${count+1} :    ${listOfStrings[count]}"
            binding.tru.setOnClickListener {
                correct()
            }
            binding.fals.setOnClickListener {
                inCorrect()
            }
            return
        }
        if (count==1){
            binding.textView.text="Question ${count+1} :    ${listOfStrings[count]}"
            binding.tru.setOnClickListener {
                inCorrect()
            }
            binding.fals.setOnClickListener {
                correct()
            }
            return
        }
        if (count==2){
            binding.textView.text="Question ${count+1} :    ${listOfStrings[count]}"
            binding.tru.setOnClickListener {
               inCorrect()
            }
            binding.fals.setOnClickListener {
                correct()
            }
            return
        }

        if (count==3){
            binding.textView.text="Question ${count+1} :    ${listOfStrings[count]}"
            binding.tru.setOnClickListener {
                correct()
            }
            binding.fals.setOnClickListener {
                inCorrect()
            }
            return
        }

        if (count==4){
            binding.textView.text="Question ${count+1} :    ${listOfStrings[count]}"
            binding.tru.setOnClickListener {
                correct()
            }
            binding.fals.setOnClickListener {
                inCorrect()
            }
            return
        }

        if (count==5){
            binding.textView.text="Question ${count+1} :    ${listOfStrings[count]}"
            binding.tru.setOnClickListener {
                inCorrect()
            }
            binding.fals.setOnClickListener {
                correct()
            }
            return
        }

        if (count==6){
            binding.textView.text="Question ${count+1} :    ${listOfStrings[count]}"
            binding.tru.setOnClickListener {
                inCorrect()
            }
            binding.fals.setOnClickListener {
                correct()
            }
            return
        }

        if (count==7){
            binding.textView.text="Question ${count+1} :    ${listOfStrings[count]}"
            binding.tru.setOnClickListener {
                correct()
            }
            binding.fals.setOnClickListener {
                inCorrect()
            }
            return
        }

        if (count==8){
            binding.textView.text="Question ${count+1} :    ${listOfStrings[count]}"
            binding.tru.setOnClickListener {
                inCorrect()
            }
            binding.fals.setOnClickListener {
                correct()
            }
            return
        }

        if (count==9){
            binding.next.isClickable=false
            binding.textView.text="Question ${count+1} :    ${listOfStrings[count]}"
            binding.tru.setOnClickListener {
                inCorrect()
            }
            binding.fals.setOnClickListener {
                correct()
            }
            return
        }

    }

    private fun correct(){
        if (listOfCheats.contains(count)){
            Toast.makeText(this, "Cheating is Wrong", Toast.LENGTH_SHORT).show()
        }else {
            Toast.makeText(this, "Correct!", Toast.LENGTH_SHORT).show()
        }
        binding.tru.isClickable = false
        binding.fals.isClickable = false
    }

    private fun inCorrect(){
        Toast.makeText(this,"Incorrect!",Toast.LENGTH_SHORT).show()
        binding.tru.isClickable=false
        binding.fals.isClickable=false
    }

}




