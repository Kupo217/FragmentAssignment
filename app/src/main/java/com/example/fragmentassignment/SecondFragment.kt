package com.example.fragmentassignment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.findFragment
import androidx.navigation.fragment.navArgs

class SecondFragment : Fragment() {

    private val args by navArgs<SecondFragmentArgs>()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_second, container, false)

        if (args.currentUser != null)
        {
            val firstName = args.currentUser!!.firstName
            val lastName = args.currentUser!!.lastName
            view.findViewById<TextView>(R.id.tvUser).text = "First name: $firstName \n Last name: $lastName"
        }
        else
        {
            view.findViewById<TextView>(R.id.tvUser).text = "No data received yet"
        }

        return view
    }
}