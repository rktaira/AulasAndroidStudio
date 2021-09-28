package aula27.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

class Cadastro : Fragment() {

    lateinit var nome: TextView
    lateinit var idade: TextView
    lateinit var email: TextView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view: View = inflater.inflate(R.layout.fragment_cadastro, container, false)
        nome = view.findViewById(R.id.nome)
        idade = view.findViewById(R.id.idade)
        email = view.findViewById(R.id.email)
        // Inflate the layout for this fragment

        return view
    }

    fun recebe(dados: Array<String>) {
        nome.setText(dados[0])
        idade.setText(dados[1])
        email.setText(dados[2])
    }

}