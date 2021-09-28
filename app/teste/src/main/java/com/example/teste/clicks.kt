package com.example.teste

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.core.view.isVisible

class clicks : Fragment() {

    var contaClicks: Int = 0
    lateinit var texto: TextView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view: View = inflater.inflate(R.layout.fragment_clicks, container, false)

        texto = view.findViewById(R.id.texto)
        texto.setText("CLICKS: ${contaClicks.toString()}")

        view.isVisible=false

        return view
    }
}