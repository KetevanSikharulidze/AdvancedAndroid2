package com.example.advancedandroid2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.example.advancedandroid2.databinding.FragmentFirstBinding

class FirstFragment : Fragment() {

    private var _binding : FragmentFirstBinding? = null
    private val binding get() = _binding!!

    private lateinit var controller: NavController

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentFirstBinding.inflate(inflater,container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.apply {
            controller = Navigation.findNavController(view)

            okBtn.setOnClickListener {
                val number = mobileNumberArg.text.toString().toInt()

                val action = FirstFragmentDirections.actionFirstFragmentToSecondFragment(number)
                controller.navigate(action)
            }

        }
    }

}