package com.example.frameweek4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import com.example.frameweek4.databinding.FragmentWelcomeBinding


class WelcomeFragment : Fragment() {

    private lateinit var Binding: FragmentWelcomeBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        Binding = DataBindingUtil.inflate(inflater,R.layout.fragment_welcome, container, false)
        Binding.btnLogin.setOnClickListener(){
            val InputUserName: String = Binding.tvName.text.toString()
            val inputPassword: String = Binding.tvPassword.text.toString()

            if(InputUserName == "abc" && inputPassword == "123"){
                Navigation.findNavController(it).navigate(R.id.action_welcomeFragment_to_gameFragment)
            }else{
                Toast.makeText(context, "Invalid Login", Toast.LENGTH_LONG).show()
            }
        }
        return Binding.root
    }
}