package com.example.teste

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button

class menos : Fragment() {

    private lateinit var botao: Button
    private lateinit var listener: IBotaoMenos

    interface IBotaoMenos{
        fun subtrair()
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        if (context is IBotaoMenos) {
            listener = context
        } else {
            throw RuntimeException(context.toString() + "Fragmento não implementado")
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view: View = inflater.inflate(R.layout.fragment_menos, container, false)
        botao = view.findViewById(R.id.botao)

        botao.setOnClickListener{
            listener?.subtrair()
        }
        // Inflate the layout for this fragment
        return view
    }
}