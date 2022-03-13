package com.example.hw7_2

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.os.bundleOf
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.example.hw7_2.databinding.FragmentFirstBinding

var count=0
var cheatNumber=0
var listOfCheats=ArrayList<Int>()
var listOfAnswer=ArrayList<Int>()

class FirstFragment : Fragment() {
    lateinit var binding:FragmentFirstBinding
    lateinit var vModel:SharedViewModel

    var listOfStrings=ArrayList<String>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentFirstBinding.inflate (inflater, container, false)
        return binding.root
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_first, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        vModel = ViewModelProvider(this).get(SharedViewModel::class.java)





                count= cheatNumber
                answer()


                binding.cheat.setOnClickListener {
                    cheatNumber=count
                    listOfCheats.add(cheatNumber)
                    val bundle= bundleOf("Answer" to listOfAnswers[count])
                    findNavController().navigate(R.id.action_firstFragment_to_secondFragment, bundle)
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
                //  if (count !in listOfAnswer){
                //      binding.tru.isEnabled=true
                //      binding.fals.isEnabled=true
                //   }
                if (count!=0)
                    binding.prev.isEnabled=true
                if (count!=9)
                    binding.next.isEnabled=true

                if (count==0){
                    binding.prev.isEnabled=false
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
                    binding.next.isEnabled=false
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
                if (count in listOfCheats){
                    Toast.makeText(activity, "Cheating is Wrong", Toast.LENGTH_SHORT).show()
                }else {
                    Toast.makeText(activity, "Correct!", Toast.LENGTH_SHORT).show()
                }
                //  listOfAnswer.add(count)
                //  binding.tru.isEnabled = false
                // binding.fals.isEnabled = false
            }

            private fun inCorrect(){
                Toast.makeText(activity,"Incorrect!", Toast.LENGTH_SHORT).show()
                //  listOfAnswer.add(count)
                // binding.tru.isEnabled=false
                //  binding.fals.isEnabled=false
            }

        }



