package aula27.fragments

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText

class Login : Fragment() {

    private lateinit var botao: Button
    private lateinit var nome: EditText
    private lateinit var idade: EditText
    private lateinit var email: EditText
    private var listener: Login.ILoginListener? = null

    interface ILoginListener{
        fun cadastrar(dados: Array<String>)
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        if (context is ILoginListener) {
            listener = context
        } else {
            throw RuntimeException(context.toString() + "Fragmento não implementado")
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
       // return inflater.inflate(R.layout.fragment_login, container, false)
        val view: View = inflater.inflate(R.layout.fragment_login, container, false)
        nome = view.findViewById(R.id.nome)
        idade = view.findViewById(R.id.idade)
        email = view.findViewById(R.id.email)
        botao = view.findViewById(R.id.botao)

        botao.setOnClickListener{
            listener?.cadastrar(arrayOf(nome.text.toString(),idade.text.toString(),email.text.toString()))
        }
    return view
    }

    override fun onDetach() {
        super.onDetach()
        listener = null
    }

}