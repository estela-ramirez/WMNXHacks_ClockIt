package com.example.sample.ui.break_in

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.example.sample.R

class BreakInFragment : Fragment() {

    private lateinit var breakInViewModel: BreakInViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        breakInViewModel =
            ViewModelProviders.of(this).get(BreakInViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_break_in, container, false)
        val textView: TextView = root.findViewById(R.id.text_tools)
        breakInViewModel.text.observe(this, Observer {
            textView.text = it
        })
        return root
    }
}