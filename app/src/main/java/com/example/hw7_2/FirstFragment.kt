package com.example.hw7_2


import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.os.bundleOf
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.example.hw7_2.databinding.FragmentFirstBinding





class FirstFragment : Fragment() {
    private lateinit var binding: FragmentFirstBinding
    private val vModel: SharedViewModel by viewModels()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentFirstBinding.inflate(inflater, container, false)
        return binding.root
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_first, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        vModel.count = vModel.cheatNumber
        answer()


        binding.cheat.setOnClickListener {
            vModel.cheatNumber = vModel.count
            vModel.listOfQuastions[vModel.count].isCheat = true
            val bundle = bundleOf("Answer" to vModel.listOfQuastions[vModel.count].answer)
            findNavController().navigate(R.id.action_firstFragment_to_secondFragment, bundle)

        }


        binding.next.setOnClickListener {
            vModel.count++
            answer()
        }

        binding.prev.setOnClickListener {
            vModel.count--
            answer()
        }


    }


    @SuppressLint("SetTextI18n")
    private fun answer() {
        if (vModel.count in vModel.listOfAnswer){
            disable()
        }else{
            enable()
        }

        for (i in 0..9) {

            when (vModel.count) {
                0 -> {
                    binding.prev.isEnabled = false
                    binding.next.isEnabled = true
                }
                9 -> {
                    binding.next.isEnabled = false
                    binding.prev.isEnabled = true
                }
                else -> {
                    binding.prev.isEnabled = true
                    binding.next.isEnabled = true
                }
            }

            binding.textView.text = vModel.listOfQuastions[vModel.count].question

            if (vModel.listOfQuastions[vModel.count].answer) {
                binding.tru.setOnClickListener {
                    correct()
                }
                binding.fals.setOnClickListener {
                    inCorrect()
                }
            } else {
                binding.tru.setOnClickListener {
                    inCorrect()
                }
                binding.fals.setOnClickListener {
                    correct()
                }
            }


        }




    }


    private fun correct() {
        if (vModel.listOfQuastions[vModel.count].isCheat) {
            Toast.makeText(activity, "Cheating is Wrong", Toast.LENGTH_SHORT).show()
        } else {
            Toast.makeText(activity, "Correct!", Toast.LENGTH_SHORT).show()
        }
        vModel.listOfAnswer.add(vModel.count)
        disable()
    }

    private fun inCorrect() {
        Toast.makeText(activity, "Incorrect!", Toast.LENGTH_SHORT).show()
        vModel.listOfAnswer.add(vModel.count)
        disable()
    }

    private fun disable(){
        binding.tru.isEnabled=false
        binding.fals.isEnabled=false
    }

    private fun enable(){
        binding.tru.isEnabled=true
        binding.fals.isEnabled=true
    }


}



