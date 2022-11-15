package com.example.fragmentassignment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.navigation.fragment.findNavController


class FirstFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_first, container, false)

        view.findViewById<Button>(R.id.btnSend).setOnClickListener {

            val firstName = view.findViewById<EditText>(R.id.etFirstName).text.toString()
            val lastName = view.findViewById<EditText>(R.id.etLastName).text.toString()
            val user = User(firstName, lastName)

            val action = FirstFragmentDirections.actionFirstFragmentToSecondFragment(user)
            findNavController().navigate(action)
        }

        return view
    }

}