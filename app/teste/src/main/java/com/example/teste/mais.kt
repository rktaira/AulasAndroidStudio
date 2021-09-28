package com.example.teste

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class mais : Fragment() {

    private lateinit var botao: Button
    private lateinit var listener: AppCompatActivity


    override fun onAttach(context: Context) {
        super.onAttach(context)
            listener = AppCompatActivity()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view: View = inflater.inflate(R.layout.fragment_mais, container, false)
        botao = view.findViewById(R.id.botao)

        botao.setOnClickListener{
            listener?.somar()
        }
        // Inflate the layout for this fragment
        return view
    }
}