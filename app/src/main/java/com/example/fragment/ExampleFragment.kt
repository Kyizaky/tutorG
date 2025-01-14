package com.example.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment

class ExampleFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_example, container, false)

        val titleText: TextView = view.findViewById(R.id.titleText)
        val descriptionText: TextView = view.findViewById(R.id.descriptionText)
        val actionButton: Button = view.findViewById(R.id.actionButton)

        titleText.text = "Discover Something New!"
        descriptionText.text = "Tap the button below to explore."

        // Event klik pada tombol
        actionButton.setOnClickListener {
            Toast.makeText(requireContext(), "Button clicked!", Toast.LENGTH_SHORT).show()
        }

        return view
    }
}
